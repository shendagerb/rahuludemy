package org.selenium.rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GreenKart {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DDR\\IdeaProjects\\practice\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String[] listOfVeg = {"Cauliflower","Cucumber", "Beans","Brinjal"};

        List<String> items=Arrays.asList(listOfVeg);

        List<WebElement> addToCard = driver.findElements(By.cssSelector("div.product button"));

        List<WebElement> productName = driver.findElements(By.cssSelector("h4.product-name"));


            for(int j=0;j<items.size();j++) {

                for (int i = 0; i < productName.size(); i++) {


                    if (productName.get(i).getText().contains(items.get(j))) {
                        addToCard.get(i).click();
                        break;
                    }
                }
            }
           driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();

            //driver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();
        driver.findElement(By.xpath("//div[@class='action-block']/button[1]")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        driver.findElement(By.xpath("//button[text()=\"Place Order\"]")).click();
        WebElement ddlCounty=driver.findElement(By.tagName("select"));
        Select select=new Select(ddlCounty);
        select.selectByVisibleText("India");
        driver.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
        driver.findElement(By.xpath("//button[text()=\"Proceed\"]")).click();


            }
        }


