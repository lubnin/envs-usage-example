package org.example;

import org.aeonbits.owner.ConfigFactory;

public class Main {
  public static void main(String[] args) {
    AppConfig config = ConfigFactory.create(AppConfig.class);

    System.out.println("HTTP Address: " + config.httpAddress());
    System.out.println("Log Level: " + config.logLevel());
  }
}
