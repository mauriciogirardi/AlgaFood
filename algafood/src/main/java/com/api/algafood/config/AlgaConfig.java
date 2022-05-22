package com.api.algafood.config;

import com.api.algafood.notifications.NotificationEMAIL;
import com.api.algafood.service.ActiveClientService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlgaConfig {

  @Bean
  public NotificationEMAIL notificationEMAIL() {
    NotificationEMAIL notifier = new NotificationEMAIL("smtp.maurico.com.br");
    notifier.setCapsLock(true);
    return notifier;
  }

  @Bean
  public ActiveClientService activeClientService() {
    return new ActiveClientService(notificationEMAIL());
  }
}
