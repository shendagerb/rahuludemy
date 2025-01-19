package org.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHRM {

    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.firefoxdriver().setup();

        System.setProperty("webdriver.chrome.driver", "//C:\\Users\\DDR\\IdeaProjects\\practice\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.close();
    }
}



