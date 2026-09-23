package org.example;

import org.openqa.selenium.WebDriver;

public class Test2 implements ITest {
    private WebDriver driver;
    private PageObject pageObject;

    @Override
    public void setUp() {
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.manage().window().maximize();
        pageObject = new PageObject(driver);
    }

    @Override
    public void execute() {
        driver.get("https://example.com");
        pageObject.clickByXpath("//a[@href='/more-info']");
    }

    @Override
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}