package com.maphus.kafa.API;

import com.maphus.kafa.DTOs.Token;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

public class Authorization {

    public static Token generateToken(final String clientId, final String clientSecret) {

        String requestBody = "grant_type=client_credentials";

        String base64Credentials = Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes());

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://us.battle.net/oauth/token"))
                .setHeader("Authorization", "Basic " + base64Credentials)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        Token token = null;
        try {
            token = objectMapper.readValue(response.body(), Token.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return token;
    }

}
