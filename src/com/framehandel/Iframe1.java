package com.framehandel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe1 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		int a=driver.findElements(By.linkText("iframe")).size();
		
		System.out.println(a);
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.xpath("//*[text()='Deprecated']")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[text()='com.thoughtworks.selenium']")).click();
	}
}
