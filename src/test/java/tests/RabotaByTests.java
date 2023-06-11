package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.RabotaByPage;

import static io.qameta.allure.Allure.step;

@Tags({@Tag("UI")})

public class RabotaByTests extends TestBase {
    RabotaByPage rabotaByPage = new RabotaByPage();

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Owner("ma-lyna")
    @DisplayName("Displaying of 'QA' results after successful search")
    void checkSuccessfulSearch() {
        step("Fill in the 'Search' field with 'QA'", () -> {
            rabotaByPage.fillInSearchField("QA");
        });
        step("Tap on the 'Найти работу' button'", () -> {
            rabotaByPage.tapToSearch();
        });
        step("Check displaying of results after search", () -> {
            rabotaByPage.checkSearchResults();
        });
        step("Verify the displayed result is 'QA' result", () -> {
            rabotaByPage.checkQaResult();
        });
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Owner("ma-lyna")
    @DisplayName("Check filter by experience from 1 to 3 years")
    void checkJobsWithOneAndThreeExp() {
        step("Fill in the 'Search' field with 'QA'", () -> {
            rabotaByPage.fillInSearchField("QA");
        });
        step("Tap on the 'Найти работу' button'", () -> {
            rabotaByPage.tapToSearch();
        });
        step("Choose the filter 'from 1 to 3 years of experience' ", () -> {
            rabotaByPage.checkSpecifiedExp();
        });
     step("Verify the positions with experience from 1 to 3 years are displayed", () -> {
       rabotaByPage.verifySpecifiedExpExist();
       });
        }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Owner("ma-lyna")
    @DisplayName("Check the page with extended search is opened after tapping on 'Extended search'")
    void checkJobsInSpecifiedCity() {
        step("Tap on the 'Расширенный поиск' button'", () -> {
            rabotaByPage.tapOnExtSearch();
        });
        step("Verify the page with extended search is opened", () -> {
            rabotaByPage.checkPageExtSearch();
        });
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Owner("ma-lyna")
    @DisplayName("Check displaying of the page for creation a resume")
    void checkCreationResume() {
        step("Tap on the 'Создать резюме' button'", () -> {
            rabotaByPage.tapOnCreateCv();
        });
        step("Verify the page for creation a resume is opened", () -> {
            rabotaByPage.checkPageCreateCv();
        });
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Owner("ma-lyna")
    @DisplayName("Check displaying of the page for login")
    void checkLogIn() {
        step("Tap on the 'Войти' button'", () -> {
            rabotaByPage.tapOnLogIn();
        });
        step("Verify login page is opened", () -> {
            rabotaByPage.checkPageLogIn();
        });
    }
}