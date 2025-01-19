package org.selenium.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ActionClass {


    @FindBy(xpath = "//a[text()=\"Mobiles\"]")
    private WebElement btnMobile;

    WebDriver driver;

    ActionClass(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @BeforeSuite
    public void base(){

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }

    @Test
    public void actionMethod(){

     Actions actions=new Actions(driver);

        actions.doubleClick(btnMobile).build().perform();
    }






}
