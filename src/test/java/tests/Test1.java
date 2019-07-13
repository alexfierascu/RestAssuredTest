package tests;


import org.testng.annotations.Test;

import static net.serenitybdd.rest.SerenityRest.given;


public class Test1 {


  @Test
  public void accessGoogleAndGetStatusCode() {

    given()
        .when()
        .get("https://www.google.com/")
        .then()
        .statusCode(200);
  }

}
