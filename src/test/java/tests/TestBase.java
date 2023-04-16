package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.RabotaByPage;





public class TestBase {
    RabotaByPage rabotaByPage = new RabotaByPage();
    @BeforeAll
    static void setUp() {
        WebDriverProvider provider = new WebDriverProvider();
    }

    @BeforeEach
        void addListener() {
            SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        }

        @AfterEach
        void addAttachments(){
            Attach.screenshotAs("Last screenshot");
            Attach.pageSource();
            Attach.browserConsoleLogs();
            Attach.addVideo();
        }
}

