package com.autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoitExample 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Selenium/Autoit/ResumeUplode.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("1")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\Manoj Kumar\\Desktop\\resumeuplode.exe");
		
	}
}
