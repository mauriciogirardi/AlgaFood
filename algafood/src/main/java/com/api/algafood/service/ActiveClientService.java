package com.api.algafood.service;

import com.api.algafood.client.Client;
import com.api.algafood.notifications.Notifier;

public class ActiveClientService {

  private String msg = "Seu cadastro no sistema está ativo!";
  private Notifier notification;

  public ActiveClientService(Notifier notification) {
    this.notification = notification;
  }

  public void active(Client client) {
    client.active();

    notification.notify(client, msg);
  }
}
