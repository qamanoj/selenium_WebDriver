package com.selenium.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOperation
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement wb=driver.findElement(By.id("email"));
		wb.sendKeys("manoj");
		Actions act=new Actions(driver);
		act.doubleClick(wb).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"C")).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"V")).perform();
		//driver.quit();
	}
}
