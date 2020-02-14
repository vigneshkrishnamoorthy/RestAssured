package RestAssured.RestAssured01;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_09_Oauth2_GenerateToken_And_PassTheValueToRequest {
  @Test
  public void genearteTokenAndPassValue() 
  
  {
	  
	  
	  
	  //Generating access token part
	  //Passing the values like "client_ID", "Client_secret","grant_type", Http method to get the access token. that access token (i.e. credentials) will be passed to next step to process the request. 
	  Response resp = RestAssured.given().formParam("client_ID", "Client_ID_Value").formParam("Client_secret", "Client_Secret_Value").formParam("grant_type", "Credentials/Password").post("URL/URL/Endpoint");
	  
	  //Getting the access token from above output from the code
	  String accessToken = resp.jsonPath().get("access_token");
	  
	  
	  
	  
	  
	  
	  
	  // Performing the "POST" action using the above access token
	  //Performing the post action using the above access token
	  Response resp1 = RestAssured.given().auth().oauth2(accessToken).post("URI/URL");
	  
	  // Asserting the repsonse code.
	  Assert.assertEquals(resp1.getStatusCode(), 200);
	  
	  
	  
  }
}
