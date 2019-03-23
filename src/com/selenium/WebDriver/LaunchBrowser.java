package com.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser 
{
	public static void main(String[] args) 
	{
		//lunch the firefox browser
		WebDriver driver=new FirefoxDriver();
		//enter the valid URL
		driver.navigate().to("http://www.google.co.in");
		//Maximize window
		driver.manage().window().maximize();
		//enter data into search box and click
		driver.findElement(By.id("lst-ib")).sendKeys("selenium",Keys.ENTER);
		//Minimize window
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Dimension d=new Dimension(800,500);
		driver.manage().window().setSize(d);
		
		driver.get("https://in.yahoo.com/?p=us");
		driver.manage().window().maximize();
		boolean imgstat=driver.findElement(By.xpath(".//*[@id='uh-logo']")).isDisplayed();
		if(imgstat)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		//quit window
		driver.quit();
	}
}
