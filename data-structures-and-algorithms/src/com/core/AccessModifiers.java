package com.core;
 
public class AccessModifiers {
  private String token;
 
  private void removeToken() {
    token = "";
  }
 
  protected void invalidateToken() {
    this.token = "INVALID";
  }
 
  void setToken(String token) {
    this.token = token;
  }
 
  public String getToken() {
    return this.token;
  }
}