package org.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Flight {

    WebDriver driver;




    @BeforeMethod
    public void initializeBrowser(){

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\chromedriver.exe");

        //System.out.println(System.getProperty("user.dir"));
        driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
    }

    @Test(enabled = false)
    public void ticketBook(){
        driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();


       List<WebElement> fromCityName=driver.findElements(By.cssSelector("td div li a"));
       for (WebElement city:fromCityName){
           //System.out.println(city.getText());
           if (city.getText().contains("Goa"))
               city.click();
       }

       driver.findElement(By.xpath("(//a[@value=\"HYD\"])[2]")).click();
    }


    @Test(enabled = false)
    public void dianamicDDL(){

        driver.findElement(By.id("divpaxinfo")).click();



        while(true){
            String passengers = driver.findElement(By.id("divpaxinfo")).getText();
            String[]arr= passengers.split(" ");
            String a = arr[1];
           int num= Integer.parseInt(a);


            if (num==3){
                break;
            }
            driver.findElement(By.xpath("//div[@id=\"divAdult\"]//span[3]")).click();
        }

    }

@Test
    public void staticDDl(){



        WebElement sddl=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select select=new Select(sddl);

        select.selectByVisibleText("USD");


    }



}
