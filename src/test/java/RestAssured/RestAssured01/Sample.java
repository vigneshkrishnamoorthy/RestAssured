package RestAssured.RestAssured01;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	RequestSpecification resp1 =	RestAssured.given();
	//resp.header("Conte", "applic", "");
	
 Response resp =	RestAssured.given().auth().preemptive().basic("UN", "A").when().post("URL");
 resp.statusCode();
 resp.jsonPath().toString();
 resp.getBody().asString();
 resp.getBody().jsonPath().prettify();
  JsonPath valu =  resp.jsonPath();
  String tweetID = valu.get("tweet_Id");
 
 	
		
	}

}
