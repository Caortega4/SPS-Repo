package com.google.sps.data;

/** An item on a todo list. */
public final class Comment {

  private final long id;
  private final String name;
  private final String message;
  private final long timestamp;

  public Comment(long id, String name, String message, long timestamp) {
    this.id = id;
    this.name = name;
    this.message = message;
    this.timestamp = timestamp;
  }
}