package org.example;

import org.openqa.selenium.WebDriver;
public class Test1 implements ITest {
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
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        //добавление
        pageObject.clickByXpath("/html/body/div[2]/div/div/button");
        pageObject.clickByXpath("/html/body/div[2]/div/div/button");
        //удаление
        pageObject.clickByXpath("/html/body/div[2]/div/div/div/button[1]");
        pageObject.clickByXpath("/html/body/div[2]/div/div/div/button");
    }

    @Override
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}