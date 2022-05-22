package com.api.algafood.notifications;

import com.api.algafood.client.Client;

public class NotificationEMAIL implements Notifier {

  private boolean capsLock;
  private String hostServerSmtp;

  public NotificationEMAIL(String hostServerSmtp) {
    this.hostServerSmtp = hostServerSmtp;
  }

  @Override
  public void notify(Client client, String msg) {
    if (this.capsLock) {
      msg = msg.toUpperCase();
    }

    System.out.printf("Notificando %s através do E-mail %s: usando SMTP %s: %s\n",
        client.getName(), client.getEmail(), this.hostServerSmtp, msg);
  }

  public void setCapsLock(boolean capsLock) {
    this.capsLock = capsLock;
  }
}
