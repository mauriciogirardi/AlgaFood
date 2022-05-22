package com.api.algafood.notifications;

import com.api.algafood.client.Client;

public interface Notifier {
  void notify(Client client, String msg);
}
