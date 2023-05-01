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
    @DisplayName("Check the possibility to create a resume")
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
    @DisplayName("Check the possibility to log in")
    void checkLogIn() {
        step("Tap on the 'Войти' button'", () -> {
            rabotaByPage.tapOnLogIn();
        });
        step("Verify login page is opened", () -> {
            rabotaByPage.checkPageLogIn();
        });
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Owner("ma-lyna")
    @DisplayName("Successful search")
    void checkSuccessfulSearch() {
        step("Fill in the 'Search' field with 'QA'", () -> {
            rabotaByPage.fillInSearchField("QA");
        });
        step("Tap on the 'Найти работу' button'", () -> {
            rabotaByPage.tapToSearch();
        });
        step("Verify that search results for 'QA' are shown", () -> {
            rabotaByPage.checkSearchResults();
        });
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Owner("ma-lyna")
    @DisplayName("Check filter by specified income")
    void checkJobsWithSpecifiedIncome() {
        step("Fill in the 'Search' field with 'QA'", () -> {
            rabotaByPage.fillInSearchField("QA");
        });
        step("Tap on the 'Найти работу' button'", () -> {
            rabotaByPage.tapToSearch();
        });
        step("Check 'Указан доход' checkbox", () -> {
            rabotaByPage.checkSpecifiedIncome();
        });
        step("Verify search results are displayed according to 'Указан доход' checkbox", () -> {
            rabotaByPage.verifySpecifiedIncomeExist();
        });
        }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Owner("ma-lyna")
    @DisplayName("Extended search")
    void checkJobsInSpecifiedCity() {
        step("Tap on the 'Расширенный поиск' button'", () -> {
            rabotaByPage.tapOnExtSearch();
        });
        step("Verify the page with extended search is opened", () -> {
            rabotaByPage.checkPageExtSearch();
        });
    }
}