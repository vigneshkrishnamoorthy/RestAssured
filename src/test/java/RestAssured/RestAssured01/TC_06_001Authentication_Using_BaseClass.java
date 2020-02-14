package RestAssured.RestAssured01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import restAssuredLibraries.CredentialsAndURI;

public class TC_06_001Authentication_Using_BaseClass extends CredentialsAndURI {
  @Test
  public void authenticateUsingBaseClass() 
  
  {
	  
	  int statusCode = RestAssured.given().get().getStatusCode();
	  System.out.println("Response Code is  :" +statusCode );
  }
}
