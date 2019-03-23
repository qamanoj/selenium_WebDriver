package com.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserDemo 
{
	public static void main(String[] args)
	{
		//open with FireFoxBrowser
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//open with chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://www.google.com");
		//open with ie browser
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer.exe");
		WebDriver drive1=new InternetExplorerDriver();
	}
}
