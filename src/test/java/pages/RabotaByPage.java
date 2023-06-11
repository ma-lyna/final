package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RabotaByPage {
        private SelenideElement
                searchInput = $("#a11y-search-input"),
                searchBtn = $(byText("Найти работу")),
                searchResults = $(".vacancy-serp-item__layout"),
                qaResult = $(".bloko-header-section-3"),
                specifiedExpRb = $(".nova-control--GtG8Kpo7kAMGijnRbxtY:nth-child(7) .bloko-form-item"),
                specifiedExp = $(".vacancy-serp-item__layout span[data-qa ='vacancy-serp__vacancy-compensation']"),
                extSearchBtn = $(".supernova-navi-advanced-search-icon"),
                extPageArea = $(".row-content form"),
                createCvBtn = $(byText("Создать резюме")),
                createCvPageArea = $(".signup-wrapper"),
                logInBtn = $(byText("Войти")),
                logInPageArea = $(".account-login-page");


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
        specifiedExpRb.scrollTo().click();

        return this;
    }
        public RabotaByPage verifySpecifiedExpExist () {
        specifiedExp.should(exist);

        return this;
    }

        public RabotaByPage tapOnExtSearch () {
        extSearchBtn.click();

        return this;
    }

        public RabotaByPage checkPageExtSearch () {
        extPageArea.should(exist);

        return this;
    }

        public RabotaByPage tapOnCreateCv () {
        createCvBtn.click();

        return this;
    }

        public RabotaByPage checkPageCreateCv () {
        createCvPageArea.should(exist);

        return this;
    }

        public RabotaByPage tapOnLogIn () {
        logInBtn.click();

        return this;
    }

        public RabotaByPage checkPageLogIn () {
        logInPageArea.should(exist);

        return this;
    }
}
