package com.selenium.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		//search wipro jobs
		driver.findElement(By.id("lst-ib")).sendKeys("wripro jobs");
		//create an object of action class
		Actions act=new Actions(driver);
		//enter operation
		act.sendKeys(Keys.ENTER).perform();
		//wipro jobs link
		WebElement wb=driver.findElement(By.linkText
				("Wipro Jobs in Bangalore - Wipro Openings in Bangalore - Naukri.com"));
		//rightClick on the link
		act.contextClick(wb).perform();
		act.sendKeys("T").perform();
	}
}
