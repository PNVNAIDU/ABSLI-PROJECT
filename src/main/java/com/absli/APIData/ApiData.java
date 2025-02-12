package com.absli.APIData;
import com.google.gson.JsonObject;
import java.util.HashMap;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiData {

    public String String 

    (String username, String password) {
        HashMap<String, String> headersMap = new HashMap<String, String>();
        headersMap.put("Content-Type", "application/json");
        JsonObject jsonBody = new JsonObject();
        jsonBody.addProperty("isPasswordEncrypted", false);
        jsonBody.addProperty("isSkipAdAuth", true)
        
        ;
        jsonBody.addProperty("loginId", username);
        jsonBody.addProperty("password", password);
        RequestSpecification request = RestAssured.given()
                .baseUri("https://leapdev.adityabirlasunlifeinsurance.com/leap-qa-server/api/users/login")
                .headers(headersMap).body(jsonBody.toString());
        System.out.println(jsonBody.toString());
        Response response = request.post();
        // System.out.println(response.getStatusCode() + " " +
        // response.getBody().toString());
        // System.out.println(response.asPrettyString());
        JsonPath jsonPathEvaluator = response.jsonPath();
        String token = jsonPathEvaluator.get("token");
        System.out.println("Token :" + token);
        return token;
    }

    public String getApplicationId(String username, String appnumber, String token) {
        HashMap<String, String> headersMap = new HashMap<String, String>();
        headersMap.put("Content-Type", "application/json");
        headersMap.put("Authorization", "Bearer " + token);
        JsonObject jsonBody = new JsonObject();
        jsonBody.addProperty("loginId", username);
        jsonBody.addProperty("applicationNumber", appnumber);
        RequestSpecification request = RestAssured.given()
                .baseUri("https://leapdev.adityabirlasunlifeinsurance.com/leap-qa-server/api/customers/getApplication")
                .headers(headersMap).body(jsonBody.toString());
        System.out.println(jsonBody.toString());
        Response response = request.post();
        System.out.println(response.getStatusCode() + " " + response.getBody().toString());
        // System.out.println(response.asPrettyString());
        JsonPath jsonPathEvaluator = response.jsonPath();
        String applicationId = jsonPathEvaluator.get("data.applicationId");
        System.out.println("applicationId :" + applicationId);
        return applicationId;
    }

    public String getRNALink(String username, String appnumber, String applicationid, String token) {
        HashMap<String, String> headersMap = new HashMap<String, String>();
        headersMap.put("Content-Type", "application/json");
        headersMap.put("Authorization", "Bearer " + token);
        JsonObject jsonBody = new JsonObject();
        System.out.println("Token : " + token);
        jsonBody.addProperty("applicationId", applicationid);
        jsonBody.addProperty("type", "link");
        RequestSpecification request = RestAssured.given()
                .baseUri("https://leapdev.adityabirlasunlifeinsurance.com/leap-qa-server/api/customers/rnaLink")
                .queryParam("loginId", username).queryParam("applicationNumber", appnumber).headers(headersMap)
                .body(jsonBody.toString());
        System.out.println(jsonBody.toString());
        Response response = request.post();
        System.out.println(response.getStatusCode() + " " + response.getBody().toString());
        JsonPath jsonPathEvaluator = response.jsonPath();
        String url = jsonPathEvaluator.get("data.tinyURLResult");
        System.out.println("URL :" + url);
        return url;
    }

    public Integer getOTP(String username, String appnumber, String applicationid, String token) {
        HashMap<String, String> headersMap = new HashMap<String, String>();
        headersMap.put("Content-Type", "application/json");
        headersMap.put("Authorization", "Bearer " + token);
        JsonObject jsonBody = new JsonObject();
        System.out.println("Token : " + token);
        jsonBody.addProperty("applicationId", applicationid);
        RequestSpecification request = RestAssured.given()
                .baseUri("https://leapdev.adityabirlasunlifeinsurance.com/leap-qa-server/api/customers/rnaLink")
                .queryParam("loginId", username).queryParam("applicationNumber", appnumber).headers(headersMap)
                .body(jsonBody.toString());
        System.out.println(jsonBody.toString());
        Response response = request.post();
        System.out.println(response.getStatusCode() + " " + response.getBody().toString());
        JsonPath jsonPathEvaluator = response.jsonPath();
        int OTP = jsonPathEvaluator.get("data.verificationCode");
        System.out.println("OTP :" + OTP);
        return OTP;
    }
}
