package org.selenium.rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Locator1 {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DDR\\IdeaProjects\\practice\\src\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[name=\"inputPassword\"]")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.signInBtn")).click();
        Thread.sleep(2000);
        String message=driver.findElement(By.tagName("p")).getText();

        Assert.assertEquals(message,"You are successfully logged in.");
        System.out.println(message);
        driver.close();




    }
}
