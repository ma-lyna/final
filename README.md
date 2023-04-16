# The project with automation tests for the functionality of rabota.by

## Contents

> ➠ [Technology stack](#technology-stack)
>
> ➠ [Test cases](#test-cases)
>
> ➠ [Run tests locally](#run-tests-locally)
>
> ➠ [Run tests via Jenkins](#run-tests-via-Jenkins)
>
> ➠ [Allure reports](#allure-reports)
>
> ➠ [Integration with Allure TestOps](#integration-with-allure-testOps)
>
> ➠ [Notifications on Telegram](#notifications-on-telegram)
>
> ➠ [Example of test run in Selenoid](#example-of-test-run-in-Selenoid)

## Technology stack

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure_TO"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://https://telegram.org/"><img src="images/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/></a>
</p>

### <code>Java</code> is used as a programming language for the tests.
>
> <code>Selenide</code> is used for writing UI tests.
>
> <code>Gradle</code> helps to build the project automatically.
>
> <code>JUnit 5</code> is used as a library for module testing.
>
> It is possible to run tests locally or with the help of <code>Jenkins</code> and <code>Selenoid</code>.
>
> <code>Selenoid</code> is used to run browsers in <code>Docker</code> containers.
>
> <code>Allure report</code> creates a report about test run.
>
> All the test results are sent to <code>Telegram</code> with the help of Bot.

## Test cases

- ✓ Successful search 
- ✓ Check filter by specified income
- ✓ Extended search
- ✓ Create a resume
- ✓ Log in

##  Run tests locally

Run the command in the Terminal:
```bash
gradle clean test
```
In order to get the report run the command below:
```bash
allure serve build/allure-results
```

##  Run tests via Jenkins
1. Open <a target="_blank" href="https://jenkins.autotests.cloud/job/018-marinka_k-projectUITests/">the project</a>.
2. Choose **Build with parameters**.
3. Change parameters (if it is needed).
4. Tap on  **Build**.
5. Check results in the Allure reports.

###  Главное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/allure.png">
</p>

###  Тесты

<p align="center">
<img title="Allure Tests" src="images/screens/allure_2.png">
</p>


## <img src="images/logo/Allure_TO.svg" width="25" height="25"  alt="Allure"/></a> Интеграция с <a target="_blank" href="https://allure.autotests.cloud/launch/19330">Allure TestOps</a>
### Общий список всех кейсов: ручных и авто
<p align="center">
<img title="Allure Graphics" src="images/screens/testops_tests.png">
</p>

### Dashboard с общими результатами тестирования
<p align="center">
<img title="Allure Graphics" src="images/screens/testops_dashboard.png">
</p>

### Пример отчёта выполнения одного из автотестов
<p align="center">
<img title="Allure Graphics" src="images/screens/testops_cycle.png">
</p>

## <img src="images/logo/jira-logo.svg" width="25" height="25"  alt="Allure"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-546">Atlassian Jira</a>
<p align="center">
<img title="Jira" src="images/screens/jira.png">
</p>

## <img src="images/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram о результатах прогона тестов

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/telegram.png" >
</p>

## <img src="images/logo/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Видео прохождения тестов

<p align="center">
  <img title="Selenoid Video" src="images/video_selenide/videoSelenide.gif">
</p>
