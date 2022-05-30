package com.api.algafood.notifications;

import com.api.algafood.client.Client;

import org.springframework.stereotype.Component;

//@Primary fix required a single bean, but 2 were found:
//@Qualifier("sms")

@TypeNotifier(UrgencyLevel.NORMAL)
@Component
public class NotificationSMS implements Notifier {

  @Override
  public void notify(Client client, String msg) {
    System.out.printf("Notificando %s por SMS através do telefone %s: %s\n",
        client.getName(), client.getPhone(), msg);
  }

}
