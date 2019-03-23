package com.sinarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iphone7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("apple iphone 7",Keys.ENTER);
		Thread.sleep(4000);
		String x="//div[@id='container']/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[1]/div[4]/div/a[3]/div/div[1]";
		String s=driver.findElement(By.xpath(x)).getText();
		System.out.println(s);
	}
}
