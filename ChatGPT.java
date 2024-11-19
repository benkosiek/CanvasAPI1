package org.example;

import org.json.JSONArray;
import org.json.JSONObject;
import java.net.URI;
import java.net.http.*;

public class ChatGPT {
  static HttpClient client = HttpClient.newHttpClient();
  static String chatAPIKey = "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";
  String prompt;

  ChatGPT(String prompt) {
    this.prompt = prompt;
  }

  //makes the body of the request
  HttpRequest.BodyPublisher makeBody() {
    JSONObject body = new JSONObject()
      .put("model", "gpt-4o-mini")
      .put("messages", new JSONArray()
        .put(new JSONObject()
          .put("role", "user")
          .put("content", new JSONArray()
            .put(new JSONObject()
              .put("type", "text")
              .put("text", this.prompt)))));

    return HttpRequest.BodyPublishers.ofString(body.toString());
  }

  //makes a post request
  public HttpRequest makeRequest() {
    return HttpRequest.newBuilder(URI.create("https://api.openai.com/v1/chat/completions"))
      .method("POST", makeBody())
      .header("Content-Type", "application/json")
      .header("Authorization", "Bearer " + chatAPIKey)
      .build();
  }

  //Extracts chat-gpt's response to this prompt
  String getResponse(JSONObject response) {
    JSONArray choices = new JSONArray(response.get("choices").toString());
    JSONObject choice = new JSONObject(choices.getJSONObject(0).toString());
    JSONObject message = new JSONObject(choice.get("message").toString());
    return message.get("content").toString();

  }

  //Asks chatgpt to answer this prompt
  public String askChat() {
    HttpRequest request = makeRequest();
    try {
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      return getResponse(new JSONObject(response.body()));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}