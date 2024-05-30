package org.example;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"file:.env", "system:env"})
public interface AppConfig extends Config {
  @Key("HTTP_ADDRESS")
  String httpAddress();

  @Key("LOG_LEVEL")
  int logLevel();
}
