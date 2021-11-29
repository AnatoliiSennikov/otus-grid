package ru.otus.qa.automation.tests.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import ru.otus.qa.automation.logic.pages.MainPage;

import static ru.otus.qa.automation.logic.WebDriverInit.initDriver;

public class Test01 {
    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp() {
           driver = initDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void Test01Button() throws InterruptedException {
        mainPage = new MainPage(driver);
        driver.get("https://otus.ru");
        mainPage
                .someButton();
        Thread.sleep(10000);
    }
}
