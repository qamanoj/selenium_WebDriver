package com.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementMathods 
{
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/login/");
	
	driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("u_0_m")).sendKeys("Manoj");
	
	String w=driver.findElement(By.id("u_0_m")).getAttribute("name");
	
	String w1=driver.findElement(By.id("u_0_m")).getAttribute("value");
	
	System.out.println(w);
	System.out.println(w1);
	
	driver.findElement(By.id("u_0_m")).clear();
	driver.findElement(By.id("u_0_c")).click();
	
	boolean a=driver.findElement(By.id("u_0_c")).isSelected();
	System.out.println(a);
	if(a)
	{
		System.out.println("pass ::::");
	}
	else
	{
		System.out.println("fail ::::");
	}
	
	boolean b=driver.findElement(By.xpath("//div[text()='Create a new account']")).isDisplayed();
	System.out.println(b);
	if(b)
	{
		System.out.println("pass ::::");
	}
	else
	{
		System.out.println("fail ::::");
	}
	
	boolean b1=driver.findElement(By.xpath("//div[text()='Create a new account']")).isEnabled();
	System.out.println(b1);
	if(b1)
	{
		System.out.println("pass ::::");
	}
	else
	{
		System.out.println("fail ::::");
	}
	}
}
