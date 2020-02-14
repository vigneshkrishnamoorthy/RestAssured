package RestAssured.RestAssured01;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_04_Delete {
  @Test
  public void deleteUser() 
  {
Response resp = RestAssured.delete("https://reqres.in/api/users/166");
 int responseCode = resp.getStatusCode();
System.out.println("Response code is :" +responseCode);

Assert.assertEquals(responseCode, 204);




	  
	  
  }
}
