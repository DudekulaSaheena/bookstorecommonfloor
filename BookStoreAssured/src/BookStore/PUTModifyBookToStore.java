package BookStore;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUTModifyBookToStore {
	  @Test
	  public void f() {
		  String userId= "Shaahi2mail@gmail.com";
		  String isbn ="8977432437";
		     RestAssured.baseURI = "https://bookstore.toolsqa.com/";
		     RequestSpecification httpRequest = RestAssured.given().header("Authorization", "Bearer " )
		             .header("Content-Type", "application/json");

		     
		     Response response = httpRequest.body("{ \"isbn\": \"" + isbn + "\", \"userId\": \"" + userId + "\"}").put("/Books/9781449325862");

		     System.out.println("The response code - " +response.getStatusCode());
		     Assert.assertEquals(response.getStatusCode(),302);
	  }
	}


