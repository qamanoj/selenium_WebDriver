package com.waitstatements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitlywait 
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		 driver.findElement(By.id("H-destination")).sendKeys("nyc");
		 driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		 driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

		 WebDriverWait d=new WebDriverWait(driver,20);
		 d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
		 //Thread.sleep(5000L);
		 
		

		 driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();
		    
	}
}
