package restAssuredLibraries;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class CredentialsAndURI {

@BeforeClass

public void credentials()

{
		
		RestAssured.authentication = RestAssured.preemptive().basic("ToolsQA", "TestPassword");
		RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication/";
		

	}

}
