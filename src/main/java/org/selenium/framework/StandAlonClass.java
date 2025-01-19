package org.selenium.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.WatchEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StandAlonClass {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client/");
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait=new WebDriverWait(driver,5,2);



        //login page credential
        driver.findElement(By.id("userEmail")).sendKeys("rahulshendage@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Tcs@2025");
        driver.findElement(By.cssSelector("input[name='login']")).click();
        //product catalog

        List<WebElement> productsName=driver.findElements(By.cssSelector(".card-body b"));
        List<WebElement>addTocarts=driver.findElements(By.xpath("//div[@class=\"card-body\"]/ button[2]"));

        for (int i=0;i<productsName.size();i++) {
            //for (WebElement name:productsName)
            // {
            if (productsName.get(i).getText().equalsIgnoreCase("Banarsi Saree")) {

                wait.until(ExpectedConditions.visibilityOf(addTocarts.get(i)));
                addTocarts.get(i).click();
                break;
            }
        }
// got to cart
        driver.findElement(By.xpath("(//button[@class=\"btn btn-custom\"])[3]")).click();

        List<WebElement>CartItemList=driver.findElements(By.cssSelector(".cartSection h3"));
        }


    }




}
