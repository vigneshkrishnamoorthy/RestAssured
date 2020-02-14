package RestAssured.RestAssured01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_01_GetRequest {
	
  @Test(invocationCount=5,threadPoolSize=5,priority=0)
  public void getMethod() 
  
  {
	  
	  Response resp =  RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=4d85e8af7685795562192cb6f2c2a9b9");
	  int responseCode = resp.getStatusCode();
	  System.out.println("1. Response code is :" +responseCode);
	  
	  if(responseCode==200)
	  {
		 System.out.println("Response is Success"); 
	  }
	  
	  else 
	  {
		  
		System.out.println("Response is Failed");
	   }
	  
	  
	  
	 
  }
  
  
  @Test(priority=1,enabled=true,invocationCount=10, threadPoolSize=5)
  
  public void getFullData()
  
  {
	  
	  Response resp1 =  RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=4d85e8af7685795562192cb6f2c2a9b9");
	   String dataFromResponse = resp1.asString();
	   System.out.println("2. Entire Data from Response is" +dataFromResponse);
	   
	  
	  
  }
  
  
}
