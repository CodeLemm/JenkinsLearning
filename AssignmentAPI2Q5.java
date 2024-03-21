import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AssignmentAPI2Q5 {

    @Test
    public void verifyEmailInResponse() throws JSONException {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        Response response = RestAssured.get("/comments?id=5");
        JSONArray jsonArr = new JSONArray(response.getBody().asString());
        JSONObject jsnObj = jsonArr.getJSONObject(0);
        Assert.assertEquals(jsnObj.getString("email"),"Hayden@althea.biz");
   }
}
