package org.selenium.demo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestDemo implements ITestListener {

    public void onTestStart(ITestResult result) {

        System.out.println("Start");
    }
}
