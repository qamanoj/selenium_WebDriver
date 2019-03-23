package com.framehandel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FreeCRMDemoFrameHandel
{
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Pipeline']")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		
		driver.quit();
	}
}
