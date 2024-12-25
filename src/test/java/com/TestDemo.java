package com;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import com.pojo.AdmissionProcessPreViewDto;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

  @Test(description = "Verify that the Get Post API returns correctly")
  public void verifyGetAPI() {
    // Given
    given()
        .baseUri("https://jsonplaceholder.typicode.com")
        .header("Content-Type", "application/json")
        // When
        .when()
        .get("/posts/1")
        // Then
        .then()
        .statusCode(200)
        // To verify correct value
        .body("userId", equalTo(1))
        .body("id", equalTo(1))
        .body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
        .body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"));
  }



  @Test(description = "Verify that the Get Post API returns correctly")
  public void verifyUSISGetAPI() {


    Response response =
        given()
            .spec(this.requestSpecificationForJsonHeader()) // Ensure requestSpecificationForJsonHeader is implemented
            .baseUri("https://usis.bracits.net/api/adp/v1/admission-processes/267/view")
            .log().uri()
            .when()
            .get() // Ensure the correct HTTP method is used
            .then()
            .statusCode(200)
            .log().body()
            . body("semesterSession",
                equalTo("Spring 2024"))
            . body("intake",
                equalTo(1))
            . body("allowAppeared",
                equalTo(true))
            .extract()
            .response();


    // Extract and print the JSON response
    String jsonResponse = response.asString();
    
    System.out.println("JSON Response: " + jsonResponse);


  }


  private String accessToken = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJqVmFBZHdlRjRyRGpwV2VWSllJbFNoME1xcm5GajBoRkRmbUU3LWhfai1rIn0.eyJleHAiOjE3MzUxNDAxOTAsImlhdCI6MTczNTEzODM5MCwianRpIjoiZDg1NTdmYjktZTI0MC00NTgxLWE5ZWYtN2Q3ZTYyZTNlNjUwIiwiaXNzIjoiaHR0cHM6Ly9icmFjdXNzby5icmFjaXRzLm5ldC9yZWFsbXMvdXNpcyIsInN1YiI6ImQ1YTkxNmIzLTI2YjUtNDE3Mi05MjYxLTRhZDJiMmZiZGQwZCIsInR5cCI6IkJlYXJlciIsImF6cCI6InNsbSIsInNpZCI6IjU5NWQzYTlhLTllNjEtNGVhOC1iMzhlLWU1ZGJmYTJiOTU0MiIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiKiJdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOlsiUkVHX0FXUyIsIkFEUF9TX0RfViIsIkFEUF9BX0EiLCJSRUdfTV9TIiwiRVhDX01fUyIsIlJFR19BUyIsIkVYQ19HUkRTSFQiLCJSRUdfQUEiLCJSRUdfSU5TIiwiU0NIX1JQVCIsIlJFR19BQyIsIkVYQ19NX0QiLCJBUFBfU19DX0MiLCJSRUdfUlNBRFYiLCJEU0JMX0wiLCJBUFBfU1JQIiwiUkVHX1NDIiwiQVBQX0ZJTiIsIlJFR0lTVEVSIiwiRVhDX0RfQSIsIlJFR19TVEMiLCJSRUdfU0QiLCJSRUdfU0JBQyIsIkVYQ19HUyIsIlNDSF9DQ05fVFlQRVMiLCJNT0RFTEVSX0VESVRPUiIsIkVYQ19DX1RfViIsIlJFR19ERVAiLCJSRUdfUlMiLCJSRUdfU0NDIiwiRVhDX0FQTSIsIkFEUF9NX1MiLCJBUFBfRVhDIiwiUkVHX1NDSCIsIkVYQ19QU01FIiwiRVhDX01fUFJPQiIsIlJFR19DVVIiLCJTVEZfV0dUIiwiQURNX1JQVCIsIlJFR19SU0ciLCJSRUdfUlNEIiwiUFJPQkFUSU9OIiwiU0EiLCJTVERfQ1MiLCJFWENfQUNDX0FUVCIsIlJFR19SU1BFIiwiRVhDX01fRF9DTSIsIkVYQ19FTUVfVklFVyIsIlJFR19DTUEiLCJTQ0hETF9NIiwiQURWX0VWQSIsIlJFR19TRU0iLCJSRUdfR0FEViIsIlJFR19TRVEiLCJTQ0hfT0ZGSUNFUiIsIlJFR19IUyIsIlJFR19SU0dTIiwiRVhDX1BTTUVfQVBWIiwiRklOX01fUyIsIlZfQVBQIiwiRVhDX01fTV9FIiwiUkVHX1JTTSIsIlJFR19DRU4iLCJSRUdfUlNTIiwiUkVHX09NTSIsIkFDQ0VTU19TQ0giLCJSRUdfUlNXIiwiRklOX1JQVCIsIkFQUF9DRk8iLCJSRUdfQ09IIiwiQVBQX1NDSF9TUENMIiwiTV9BX1AiLCJBUFBfUFJPQkFUSU9OIiwiUkVHX0NPVSIsIlJFR19DT1MiLCJSRUdfTVYiLCJSRUdfTU0iLCJSRUdfUk9CQSIsIlJFR19PRkMiLCJCX1IiLCJFWENfTV9FQVMiLCJSRUdfUk9CQiIsIkVYQ19HQ1JfVklFVyIsIlJFR19MQVMiLCJSRUdfUFJDIiwiQl9FQyIsIlJFR19QQVAiLCJFWENfTV9EX0MiLCJUU0tfQSIsIlJFR19GV0VDIiwiTURMUl9ETFQiLCJBUFBfTElCIiwiUkVHX0VEQyIsIlZBIiwiU1REX0xJU1QiLCJBRFBfQl9PX0EiLCJSRUdfQURWSCIsIkFEUF9WX1BfUiIsIkFEUF9HX1AiLCJURVNUIiwiUkVHX0FDVyIsIlJFR19VQ0EiLCJBUFBfUkVHIiwiUkVHX0VDUiIsIlJFR19SRUwiLCJSRUdfQ1MiLCJBUFBfQURNIiwiUkVHX0NQIiwiUkVHX1JGVSIsIkFfQyIsIlJFR19ST0IiLCJSRUdfVFNDIiwiUkVHX01FQSIsIk1BS0VVUF9BUFYiLCJBRFBfVl9CX0EiLCJSRUdfQ0wiLCJFWENfUFJPQl9WSUVXIiwiUkVHX0NDIiwiUkVHX1BSTyIsIkFEUF9NX0ZfViIsIkFQUF9QUk9CIiwiUFNfRExUIiwiUkVHX0NBIiwiRVhDX01fREFSIiwiQV9SIiwiUkVHX0NFIiwiZGVmYXVsdC1yb2xlcy11c2lzIiwiQUNDRVNTX0FEUCIsIkVYQ19FTUEiLCJSRUdfV0lQIiwiUkVHX1VCIiwiUkVHX1IiLCJFWENfTV9DX0QiLCJBUFBfU0NIX1JWT0siLCJBUFBfQ09ORklHX1YiLCJBUFBfTUMiLCJVU0VSIiwiQUNDRVNTX1JFRyIsIkZBQ1VMVFkiLCJFWENfRFJQX1JFViIsIkVYQ19NQUtFVVAiLCJTQ0hfVElNRUxJTkUiLCJTQ0hfQ0NOX0NORklHIiwiQVBQX1NDSF9DQ04iLCJBUFBfREgiLCJBRFZJU09SIiwiQVBQX09BQSIsIkVYQ19NX1ZJRVciLCJWX0VfRl9QX0wiXX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJuYW1lIjoiQmlwdWwgS3VtYXIgQmFzYWsiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJiaXB1bCIsInVzZXJUeXBlIjoiU1RBRkYiLCJnaXZlbl9uYW1lIjoiQmlwdWwiLCJmYW1pbHlfbmFtZSI6Ikt1bWFyIEJhc2FrIiwiZW1haWwiOiJiaXB1bGt1bWFyLmJhc2FrQGJyYWNpdHMuY29tIn0.ajAB2TtDEcD2pqDInXTompAMw-Fbgxtzq56_MY0Lnzv2xzj2MVHO_MhIhnHuJcmy1-3_-6DYeIE49ucfcIlEgnvJhvunIPY3qeYwG69sCOhejrZyDQcylPFW2bZfM-1iUOb6FRLnu0eGIBAIsf2Gi8cgW-8bPbppL35y5bfWw3NUW1hWDkXdERREzQtTpA624Iy8YHzIrrjjgNeb8KratAZuZfsY_jQIOoYkbgUvyYdzBd5jRQgmvS8vIWiTGpxd1H2EpcJGgereckUKJNxYmPyBklAQ4S7MD8FOB1Z7p3_FgJEZIvVUKuyjZT9cN2_6nqhvX5GdQJdTyomIXxIQUA";

  public RequestSpecification requestSpecificationForJsonHeader() {
    return new RequestSpecBuilder()
        .addHeader("Authorization", "Bearer "+  accessToken)
        .addHeader("Content-Type", "application/json")
        .build();
  }
}
