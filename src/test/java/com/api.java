package com;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class api {
    @Test
    public void testGetMothod(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Response code :"+response.getStatusCode());
        System.out.println("Response body :"+response.getBody().asString());
        System.out.println("date :"+response.getHeader("Date"));
        System.out.println("Content-Type :"+response.getHeader("Content-Type"));
        System.out.println(response.getStatusLine());
        System.out.println("time"+response.getTime());
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
