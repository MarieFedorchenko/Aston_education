import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;


public class Specifications {

    public static RequestSpecification requestSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri("https://postman-echo.com")
                .build();
    }
}