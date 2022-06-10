package BookStore;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


public class GETBook {
	  @Test
	  public void f() {
		  RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books"; 
			RequestSpecification httpRequest = RestAssured.given(); 
			Response response = httpRequest.request(Method.GET, "");
			System.out.println("Status received => " + response.getStatusLine());
			System.out.println("Response=>" + response.prettyPrint());
	  }
	}
