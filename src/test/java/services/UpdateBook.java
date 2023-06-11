package services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.Map;

public class UpdateBook {

    Response response;

    public void verifyUpdateBook_mtd(){
        response.then().statusCode(200);
    }

    public void updateBook_mtd(){

        String body="{\n" +
                "  \"userId\": \""+ ConfigurationReader.get("userID") +"\",\n" +
                "  \"isbn\": \""+ConfigurationReader.get("isbn8")+"\"\n" +
                "}";

        Map<String,Object> token=new HashMap<>();
        token.put("Authorization", "Bearer "+ ConfigurationReader.get("token"));

        response= RestAssured.given().contentType(ContentType.JSON)
                .pathParam("isbn",ConfigurationReader.get("isbn1"))
                .headers(token)
                .body(body)
                .when().log().all()
                .put("/BookStore/v1/Books/{isbn}").prettyPeek();


    }


}
