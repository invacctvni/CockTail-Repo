//at minimum, you should have the model class(es) completed, an API utility to send HTTP requests and create objects from the JSON returned
package com.example.assignment2gc200477892.Utility;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//Allow and parse to Java Object
public class APIUtility {
    /**
     * Final: This method call the API and return the Java Objects without creating any JSON file on hdd.
     */
    public static ApiResponse getObjectsFromWebQuick() {
        //fetch data from the following API.
        String uri= "https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        try {
            //Call API and write the result and returns a string
            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
//            response asked for body
            return gson.fromJson(response.body(), ApiResponse.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //if we didn't get json object return, return null.
        return null;
    }

}
