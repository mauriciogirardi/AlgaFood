package com.api.algafood.controllers;

import com.api.algafood.client.Client;
import com.api.algafood.service.ActiveClientService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {

  private ActiveClientService activeClientService;

  public MyFirstController(ActiveClientService activeClientService) {
    this.activeClientService = activeClientService;
  }

  @GetMapping("/hello")
  @ResponseBody
  public String hello() {
    Client mauricio = new Client("Mauricio", "mauricio@examplo.com", "47996089365");
    activeClientService.active(mauricio);

    return "Olá Mauricio";
  }
}
