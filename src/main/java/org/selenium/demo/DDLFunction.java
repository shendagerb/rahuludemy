package org.selenium.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DDLFunction {

    @Test
    public void m1() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html#google_vignette");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//select[@id=\"course\"]"));

        Select select=new Select(element);
        System.out.println(select.getFirstSelectedOption());

        select.selectByVisibleText("Java");
        Thread.sleep(2000);
        select.selectByVisibleText("Python");

        List<WebElement>ddlList=select.getOptions();

        for (WebElement element1:ddlList){
            System.out.println(element1.getText());
        }




        driver.quit();
        System.out.println("successfully load page");






    }


    public static void main(String[] args) throws InterruptedException {

        DDLFunction main=new DDLFunction();
        main.m1();
    }
}