package RestAssured.RestAssured01;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_03_Post {
	
  @Test
  public void PostUserCreation() 
  {
	
	  //To Pass the Header value we are creating object for the same.
	  RequestSpecification request = RestAssured.given();
	  
	  
	  request.header("Content-Type","application/json");
	  
	  //Adding the required values in Body
	  JSONObject json = new JSONObject();
	  json.put("name", "testname03");
	  json.put("job", "testjob03");
	  
	  
	  
	  // Sending the above value as a JSON format
	  request.body(json.toJSONString());
	  
	  Response resp = request.post("https://reqres.in/api/users");
	  int responseCode = resp.getStatusCode();
	  System.out.println("Response Code is" +responseCode);
	  
	  
	 Assert.assertEquals(responseCode, 201);
	  
	  
	  
	  
	  
	 /* 
	  if (responseCode==201) 
	  
	  {
		
		  System.out.println("User is created");
		  
	}
	  
	 else if (responseCode==200) 
	 {
		 System.out.println("Response is success");
		
	}*/
	  
	  
	  
  }
}
