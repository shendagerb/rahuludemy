package org.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindow {

WebDriver driver;
    @BeforeMethod
    public void initBrowser(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\DDR\\IdeaProjects\\practice\\src\\chromedriver.exe");
        driver=new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

    }

    @Test
    public void testMultipleWindow(){
        driver.findElement(By.xpath("//li/a[text()=\"Multiple Windows\"]")).click();
        driver.findElement(By.xpath("(//div/a)[2]")).click();

        Set<String> windowsId=driver.getWindowHandles();



        Iterator<String> it=windowsId.iterator();

        String parantwindow=it.next();

        String childWindow=it.next();
        driver.switchTo().window(childWindow);
       String childWindowHeading= driver.findElement(By.tagName("h3")).getText();
        System.out.println(childWindowHeading);
        driver.switchTo().window(parantwindow);




    }


}
