package RestAssured.RestAssured01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TC_08_Oauth2 {
  @Test
  public void authentication2() 
  {
	  
	  //Passing the Token value in Oauth2
	  Response resp = RestAssured.given().auth().oauth2("accessTokenToPass").post("URL/URL");
	  resp.getStatusCode();
	  
	  //Getting entire data value
	  System.out.println("Content is :" +resp.getBody().asString());
	  
	  //Converting in to Json path value
	  JsonPath json = resp.getBody().jsonPath();
	  
	  //Printing in JSON value
	  System.out.println("Json Value are  :"  +json);
  }
}
