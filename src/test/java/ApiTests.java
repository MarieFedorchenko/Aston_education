import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class ApiTests{

    @Test
    public void getRequestTest() {
        RestAssured.given().log().all()
                .spec(Specifications.requestSpecification())
                .get("/get?foo1=bar1&foo2=bar2")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("args.foo1", Matchers.is("bar1"))
                .body("args.foo2", Matchers.is("bar2"));
    }

    @Test
    public void postRawTest() {
        String requestBody = "This is expected to be sent back as part of response body.";

        RestAssured.given()
                .contentType("text/plain")
                .spec(Specifications.requestSpecification())
                .body(requestBody)
                .post("/post")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("data", Matchers.is(requestBody));

    }

    @Test
    public void postFormData() {

        String foo1 = "bar1";
        String foo2 = "bar2";

        RestAssured.given()
                .spec(Specifications.requestSpecification())
                .contentType(ContentType.URLENC.withCharset("UTF-8"))
                .formParam("foo1", foo1)
                .formParam("foo2", foo2)
                .post("/post")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("form.foo1", Matchers.is("bar1"))
                .body("form.foo2", Matchers.is("bar2"));

    }

    @Test
    public void putRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";
        RestAssured.given()
                .contentType("text/plain")
                .spec(Specifications.requestSpecification())
                .body(requestBody)
                .put("/put")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("data", Matchers.is(requestBody));
    }

    @Test
    public void patchRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";
        RestAssured.given()
                .contentType("text/plain")
                .spec(Specifications.requestSpecification())
                .body(requestBody)
                .patch("/patch")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("data", Matchers.is(requestBody));
    }

    @Test
    public void deleteRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";
        RestAssured.given()
                .contentType("text/plain")
                .spec(Specifications.requestSpecification())
                .body(requestBody)
                .delete("/delete")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("data", Matchers.is(requestBody));
    }
}