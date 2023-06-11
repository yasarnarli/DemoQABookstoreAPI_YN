package services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.Map;

public class DeleteBook {

    Response response;

    public void deleteBook_mtd(){

        String body="{\n" +
                "  \"isbn\": \""+ConfigurationReader.get("isbn8")+"\",\n" +
                "  \"userId\": \""+ConfigurationReader.get("userID")+"\"\n" +
                "}";

        Map<String,Object> token=new HashMap<>();
        token.put("Authorization", "Bearer "+ ConfigurationReader.get("token"));

        response= RestAssured.given().contentType(ContentType.JSON)
                .headers(token)
                .body(body)
                .when().log().all()
                .delete("/BookStore/v1/Book").prettyPeek();


    }


    public void verifyDeleteBook_mtd(){
        response.then().statusCode(204);
    }

}
