package com.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Controls
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		Dimension d=new Dimension(900, 700);
		driver.manage().window().setSize(d);

		driver.manage().window().maximize();

		driver.get("http://softwaretesting-guru.blogspot.in/p/main-page.html");

		driver.findElement(By.linkText("Selenium Practice page")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("Name")).sendKeys("wellcom to st guru page");

		driver.findElement(By.name("subscribe")).click();

		driver.findElement(By.name("comments")).sendKeys("i am manoj");

		new Select(driver.findElement(By.name("countries"))).selectByVisibleText("Albania");

		driver.findElement(By.name("pwd")).sendKeys("54685624");

		driver.findElement(By.xpath("//input[@value='bad']")).click();

	}
}
