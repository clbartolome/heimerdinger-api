package com.redhat.heimerdinger;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Order;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ServerResourceTest {

  @Test
  @Order(1)
  public void test_getServers_OK() {
    given()
        .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
        .when()
        .get("/servers/")
        .then()
        .statusCode(200)
        .body("size()", equalTo(2))
        .body("hostName", hasItems("win-cli-1", "win-cli-22"));
  }

  @Test
  @Order(2)
  public void test_createServer() {
    JsonObject jsonObject = Json.createObjectBuilder()
        .add("hostName", "win-cli-3")
        .add("nodeName", "win-cli-3.redhat.com")
        .add("version", "Server version information")
        .build();
    given()
        .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
        .contentType(MediaType.APPLICATION_JSON)
        .body(jsonObject.toString())
        .when()
        .post("/servers/")
        .then()
        .statusCode(201);

    given()
        .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
        .when()
        .get("/servers/win-cli-3")
        .then()
        .statusCode(200)
        .body("nodeName", equalTo("win-cli-3.redhat.com"));

  }

  @Test
  @Order(3)
  public void test_updateServer() {
    JsonObject jsonObject = Json.createObjectBuilder()
        .add("hostName", "win-cli-3")
        .add("nodeName", "win-cli-3.redhat.com")
        .add("version", "Server version information 2")
        .build();
    given()
        .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
        .contentType(MediaType.APPLICATION_JSON)
        .body(jsonObject.toString())
        .when()
        .post("/servers/")
        .then()
        .statusCode(201);

    given()
        .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
        .when()
        .get("/servers/win-cli-3")
        .then()
        .statusCode(200)
        .body("version", equalTo("Server version information 2"));
  }
}