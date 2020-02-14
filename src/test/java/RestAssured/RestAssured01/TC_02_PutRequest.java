package RestAssured.RestAssured01;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_02_PutRequest {
  
	@Test
  public void putUpdate() 
	
	{
		
	Response putResponse = RestAssured.get("https://reqres.in/api/users/2XYZ");
	int putResponseCode = putResponse.getStatusCode();
	System.out.println("Response Code from PutRequest is :" +putResponseCode);
	
	
	
	//Assert.assertEquals(putResponseCode, 300);
	
	if(putResponseCode ==200)
		
	{
		System.out.println("Put Request is Success");
		
	}
	
	else if (putResponseCode==404) 
	
	{
		
		System.out.println("Put Request response is  'Page Not found'");
		
	}
	
	else 
	{
		System.out.println("Put Response is Failed");
		
	}
	
	
	
  }
}
