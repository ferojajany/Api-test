package com;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class MathodApi {
    @Test
    public void apiTest(){
        get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data[0].id",equalTo(7))
                .body("data.first_name",hasItem("Rachel"))
                .body("data.last_name",hasItem("Howell"));
    }
    @Test
    public void apiMathod(){
        baseURI = "https://reqres.in/api";
        given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"Kishore QA\",\n" +
                        "    \"job\": \"Technical Consultant\"\n" +
                        "}")
                .when()
                .post("users")
                .then()
                .statusCode(201)
                .body("name",equalTo("Kishore QA"))
                .body("job",equalTo("Technical Consultant"))
                .log().all();
    }

}
