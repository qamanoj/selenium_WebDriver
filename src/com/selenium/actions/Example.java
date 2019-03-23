package com.selenium.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Example 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement wb=driver.findElement(By.xpath("//span[text()='Departments']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		
		WebElement ewb=driver.findElement(By.xpath("//span[text()='Electronics, Computers & Office']"));
		act.moveToElement(ewb).perform();
		
		driver.findElement(By.xpath("//span[text()='Camera, Photo & Video']")).click();
	}
}
