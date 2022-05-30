package com.api.algafood.client;

public class Client {
  private String name;
  private String email;
  private String phone;
  private boolean active = false;

  public Client(String name, String email, String phone, Boolean active) {
    this.email = email;
    this.phone = phone;
    this.name = name;
    this.active = active;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPhone() {
    return phone;
  }
}
