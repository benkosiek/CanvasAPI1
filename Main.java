package org.example;

import org.json.JSONObject;

public class Main {
  public static void main(String[] args) {
    Canvas canvasCourse = new Canvas("33973");

    JSONObject newestFile = canvasCourse.getMostRecentFile();
    JSONObject newestDiscussion = canvasCourse.getMostRecentDiscussion();
    System.out.println(newestFile.get("url"));
    System.out.println(newestDiscussion.get("message"));

    String prompt2Chat = "Document: " + canvasCourse.readFileContents(newestFile)
      + "\n" + "Prompt: " + newestDiscussion.get("message");
    ChatGPT chatGpt = new ChatGPT(prompt2Chat);
    String chatResponse = chatGpt.askChat();
    System.out.println(chatResponse);

    canvasCourse.makeDicussionPost(newestDiscussion.get("id").toString(), chatResponse);

  }
}