//at minimum, you should have the model class(es) completed, an API utility to send HTTP requests and create objects from the JSON returned
package com.example.assignment2gc200477892;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

//Allow and parse to Java Object
public class APIUtility {

    /**
     * Practice1: Google has made a nice set of libs to parse Json object. This method will read file and parse out JSON objects into Java objects.
     */
    public static ApiResponse getObjectsFromJSONFile(String fileName)
    {
        //create a gson obj to parse the objects
        Gson gson = new Gson();
        ApiResponse response = null;

        //try with resources block - anything inside the () will "auto close"
        try(
                //fileReader opens JSon file from hard-drive.
                FileReader fileReader = new FileReader(fileName);
                JsonReader jsonReader = new JsonReader(fileReader);
                ) {
            //converting the json objects into an ApiResonse object. Doing the magic.
                response = gson.fromJson(jsonReader, ApiResponse.class);
        }
        //checked exceptions vs unchecked exceptions.
        catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

    /**
     *  Practice2: This method will call the API and write to a file.
     */
    public static ApiResponse getObjectsFromWeb() {
        //don't plan to search anything...
        String uri= "https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        try {
            //Call API and write the result to the file "javaApiFetched.json".
            HttpResponse<Path> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofFile(Paths.get("javaApiFetched.json")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getObjectsFromJSONFile("javaApiFetched.json");
    }

    /**
     * Final: This method call the API and return the Java Objects without creating any JSON file on hdd.
     */
    public static ApiResponse getObjectsFromWebQuick() {
        //don't plan to search anything...
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


    public static DrinkDetails getDrinkDetails(String drinkId)
    {

        //don't plan to search anything...
//        String uri= "https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i="+drinkId;
//        System.out.println(uri);
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();
//        try {
//            //Call API and write the result and returns a string
//            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
//            Gson gson = new Gson();
////            response asked for body
//            return gson.fromJson(response.body(), DrinkDetails.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //if we didn't get json object return, return null.
        return null;
    }
}
