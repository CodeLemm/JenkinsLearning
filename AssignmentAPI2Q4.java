import io.restassured.RestAssured;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignmentAPI2Q4 {
    @Test
    public void verifyResponse(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        Response response = RestAssured.get("/posts/100");
        response.getBody();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
        String bodyOfRequiredValue = response.getBody().asString();
        String responseBody = "{\n" + "  \"userId\": 10,\n" + "  \"id\": 100,\n" + "  \"title\": \"at nam consequatur ea labore ea harum\",\n" + "  \"body\": \"cupiditate quo est a modi nesciunt soluta\\nipsa voluptas error itaque dicta in\\nautem qui minus magnam et distinctio eum\\naccusamus ratione error aut\"\n" + "}";
        Assert.assertEquals(bodyOfRequiredValue,responseBody,"The string is matched");
    }
}
