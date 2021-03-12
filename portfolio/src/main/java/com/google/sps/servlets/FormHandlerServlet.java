package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String nameValue = request.getParameter("name-input");
    String messageValue = request.getParameter("message-input");

    // Print the values so you can see it in the server logs.
    System.out.println("Wants to contact Carlos Ortega: " + nameValue);
    System.out.println("Message: " + messageValue);

    // Write the value to the response so the user can see it.
    response.getWriter().println(nameValue + " says: " + messageValue);
  }
}