package RestAssured.RestAssured01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_07_Oauth {
  
	
	@Test
  public void oauthOne() 
  
  {
		
		// Creating a Twitter post using Post API. 
		
		//Passing the Auth values to perform the post action
		 Response resp = RestAssured.given().auth().oauth("APIKEY", "APISecretKey", "AccessToken","AccessTokenSecret").post("URL/URI");
		 int responseCode = resp.getStatusCode();
		 System.out.println("Response code is :" +responseCode);
		 
		 //Getting the response value in string format, it will print in the string format the entire format
		 System.out.println("Response values are :"+resp.getBody().asString());
		 
		 //Getting the response value in JSON Format & it will show properly
		 System.out.println("JSON value response are :"+resp.getBody().jsonPath().prettify());
		 
		 //Getting the Specific value (i.e. tweet ID) from JSON
		 JsonPath json = resp.jsonPath();
		 
		 //The below code will print the tweet ID
		 String tweetID = json.get("tweet_id");
		 
		 System.out.println("Tweet ID is :" +tweetID);
		 
		 

		 
	  
  }
}
