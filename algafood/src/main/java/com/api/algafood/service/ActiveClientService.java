package com.api.algafood.service;

import com.api.algafood.client.Client;
import com.api.algafood.notifications.Notifier;
import com.api.algafood.notifications.TypeNotifier;
import com.api.algafood.notifications.UrgencyLevel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActiveClientService {

  private String msg = "Seu cadastro no sistema está ativo!";

  @TypeNotifier(UrgencyLevel.URGENCY)
  @Autowired
  private Notifier notification;

  public void active(Client client) {
    client.setActive(true);

    notification.notify(client, msg);
  }
}
