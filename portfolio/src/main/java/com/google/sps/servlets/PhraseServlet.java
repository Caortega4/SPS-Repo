package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet that returns HTML that contains the page view count. */
@WebServlet("/phrase")
public class PhraseServlet extends HttpServlet {

  private String phrase = "He who wants to reach the top must begin at the bottom.";

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    
    
    String[] phrases = {"One must never prioritize their own gain over humanities survival. Erwin Smith", 
                        "The future belongs to those who believe in the beauty of their dreams. Shoyo Hinata",
                        "You do not win alone. That is just how it is. Tobio Kageyama"};

    String json = convertToJson(phrases);


    response.setContentType("application/json;");
    response.getWriter().println(json);
    
  }

  private String convertToJson(String[] phrases) {
  String json = "[";
  json += "\"" + phrases[0] + "\"";
  json += ", ";
  json += "\"" + phrases[1] + "\"";
  json += ", ";
  json += "\"" + phrases[2] + "\"";
  json += "]";
  return json;
  }


}
