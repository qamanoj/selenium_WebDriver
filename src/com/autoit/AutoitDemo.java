package com.autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoitDemo 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		driver.findElement(By.id("wordresume")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\Manoj Kumar\\Desktop\\resumeuplode.exe");
	}
	
}

