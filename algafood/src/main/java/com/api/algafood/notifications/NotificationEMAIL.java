package com.api.algafood.notifications;

import com.api.algafood.client.Client;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TypeNotifier(UrgencyLevel.URGENCY)
@Component
public class NotificationEMAIL implements Notifier {

  @Override
  public void notify(Client client, String msg) {
    System.out.printf("Notificando %s através do e-mail %s: %s\n",
        client.getName(), client.getEmail(), msg);
  }
}
