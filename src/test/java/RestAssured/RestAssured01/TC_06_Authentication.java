package RestAssured.RestAssured01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class TC_06_Authentication {
  @Test
  public void authenticateUsernameAndPassword()
  {
	
	  RequestSpecification request = RestAssured.given();
	  int responseCode =  request.auth().preemptive().basic("ToolsQA", "TestPassword").when().get("http://restapi.demoqa.com/authentication/CheckForAuthentication/").getStatusCode();
	  System.out.println("Response Code is :" +responseCode);
	  
	 // RestAssured.given().auth().preemptive().basic("", "").when().get().getStatusCode();
	  
	  
  }
}
