package com.api.algafood.mock;

import com.api.algafood.client.Client;
import com.api.algafood.notifications.Notifier;
import com.api.algafood.notifications.TypeNotifier;
import com.api.algafood.notifications.UrgencyLevel;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TypeNotifier(UrgencyLevel.URGENCY)
@Component
public class NotifierEmailMock implements Notifier {

  @Override
  public void notify(Client client, String msg) {
    System.out.printf("MOCK: Notificando seria enviado para %s através do e-mail %s: %s\n",
        client.getName(), client.getEmail(), msg);
  }
}
