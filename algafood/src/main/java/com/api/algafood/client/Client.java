package com.api.algafood.client;

public class Client {
  private String name;
  private String email;
  private String phone;
  private boolean active = false;

  public Client(String name, String email, String phone) {
    this.email = email;
    this.phone = phone;
    this.name = name;
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

  public void active() {
    this.active = true;
  }
}
