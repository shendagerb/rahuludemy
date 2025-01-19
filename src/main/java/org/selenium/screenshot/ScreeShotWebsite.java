package org.selenium.screenshot;

import net.bytebuddy.asm.Advice;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ScreeShotWebsite {

    @Test
    public void getScreenshot() throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DDR\\IdeaProjects\\practice\\src\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");




        TakesScreenshot sc=(TakesScreenshot) driver;
        File srcFile=sc.getScreenshotAs(OutputType.FILE);
        Date date=new Date();
        String sdf=new SimpleDateFormat("HHmmss").format(date);
        System.out.println(sdf);
        File desFile=new File("C:\\Users\\DDR\\IdeaProjects\\practice\\src\\main\\java\\org\\selenium\\screenshot\\sc"+sdf+".jpg");
        FileUtils.copyFile(srcFile,desFile);






    }


}
