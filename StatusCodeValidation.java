import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StatusCodeValidation {

    @Test
    public void validateStatusCode() {
        // Set base URI
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Make a GET request and get the response
        Response response = RestAssured.get("/posts/1");

        // Get status code from the response
        int statusCode = response.getStatusCode();

        // Validate status code
        if (statusCode == 200) {
            System.out.println("Status code is 200. API is working fine.");
        } else {
            System.out.println("Status code is not 200. API might be down or experiencing issues.");
        }
    }
}
