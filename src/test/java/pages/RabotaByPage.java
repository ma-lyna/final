package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class RabotaByPage {
        private SelenideElement
                searchInput = $("#a11y-search-input"),
                searchBtn = $(byText("Найти работу")),
                searchResults = $(".vacancy-serp-item__layout"),
                qaResult = $(".bloko-header-section-3"),
                specifiedExpRb = $(".nova-control--GtG8Kpo7kAMGijnRbxtY:nth-child(19)").$(withText("От 1 года до 3 лет")),
                specifiedExp = $(".vacancy-serp-content .vacancy-serp-item__layout"),
                extSearchBtn = $(".supernova-navi-advanced-search-icon"),
                extPageTitle = $(".bloko-header-1"),
                createCvBtn = $(byText("Создать резюме")),
                createCvPageTitle = $(".bloko-header-1"),
                logInBtn = $(byText("Войти")),
                logInPageTitle = $(".bloko-header-section-2");


        public RabotaByPage fillInSearchField (String value) {
        searchInput.setValue(value);

        return this;
    }

        public RabotaByPage tapToSearch () {
        searchBtn.click();

        return this;
    }

        public RabotaByPage checkSearchResults () {
        searchResults.should(exist);

        return this;
    }

        public RabotaByPage checkQaResult () {
        qaResult.shouldHave(text("QA"));

        return this;
    }

        public RabotaByPage checkSpecifiedExp () {
        specifiedExpRb.click();

        return this;
    }
        public RabotaByPage verifySpecifiedExpExist () {
        specifiedExp.shouldHave(text("От 1 года до 3 лет"));

        return this;
    }

        public RabotaByPage tapOnExtSearch () {
        extSearchBtn.click();

        return this;
    }

        public RabotaByPage checkPageExtSearch () {
        extPageTitle.shouldHave(text("Поиск вакансий"));

        return this;
    }

        public RabotaByPage tapOnCreateCv () {
        createCvBtn.click();

        return this;
    }

        public RabotaByPage checkPageCreateCv () {
        createCvPageTitle.shouldHave(text("Регистрация соискателя"));

        return this;
    }

        public RabotaByPage tapOnLogIn () {
        logInBtn.click();

        return this;
    }

        public RabotaByPage checkPageLogIn () {
        logInPageTitle.shouldHave(text("Поиск работы"));

        return this;
    }
}
