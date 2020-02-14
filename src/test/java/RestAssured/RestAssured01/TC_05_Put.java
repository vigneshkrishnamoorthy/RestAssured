package RestAssured.RestAssured01;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_05_Put {
  @Test
  public void putUser() 
  {
	  
	  RequestSpecification resp = RestAssured.given();
	  resp.header("Content-type", "application/json");
	  
	  JSONObject json = new JSONObject();
	  json.put("name", "testuser");
	  json.put("job", "updatedjob434");
	  json.put("id", "3");
	  resp.body(json.toJSONString());
	  
	  
	Response response = resp.put("https://reqres.in/api/users/");
	int responseCode = response.getStatusCode();
	System.out.println("Response Code is:  " +responseCode);
	
	Assert.assertEquals(responseCode, 200);
	  
	  
  }
}
