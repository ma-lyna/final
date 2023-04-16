package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${env}.properties"})

public interface WebDriverConfig extends Config {
    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Config.Key("browserVersion")
    @Config.DefaultValue("100.0")
    String getBrowserVersion();

    @Config.Key("remote")
    String getRemote();
}
