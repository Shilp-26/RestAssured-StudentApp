package com.studentapp.studentinfo;

import com.studentapp.StudentPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class StudentPatchTest extends TestBase {

    @Test
    public void updateStudentWithPatch(){

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setEmail("primetesting26@gmail.com");


        Response response = given()
                //.contentType(ContentType.JSON)
                .header("Content-Type", "application/json")
                .body(studentPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
