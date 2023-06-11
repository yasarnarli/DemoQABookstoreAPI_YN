package services;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GetUserById {

    Response response;

    public void getUser_mtd(){

        Map<String, Object>token=new HashMap<>();

        token.put("Authorization","Bearer "+ ConfigurationReader.get("token"));

        response= RestAssured.given().contentType(ContentType.JSON)
                .headers(token)
                .pathParam("id",ConfigurationReader.get("userID"))
                .when().log().all()
                .get("/Account/v1/User/{id}").prettyPeek();

    }

    public void verifyGetUser_mtd(){
        response.then().statusCode(200);
    }
}
