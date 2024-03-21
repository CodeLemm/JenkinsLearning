import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignmentAPI2Q6 {
    @Test
    public void CheckTitleForTenthValue() throws JSONException {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
        Response response = RestAssured.get("/albums");
        JSONArray jsonArray = new JSONArray(response.getBody().asString());
        JSONObject jsnObj = jsonArray.getJSONObject(9); // fetching the tenth value form the response
        Assert.assertEquals(jsnObj.getString("title"),"distinctio laborum qui");
        }
    }
