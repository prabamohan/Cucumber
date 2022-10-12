package com.adact.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile/adacin.feature", glue = "com.adact.stepdefinition")
public class RunnerClass {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	@AfterClass
	public static void quitBrowser() {

		driver.close();
	}

}
