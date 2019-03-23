package com.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example 
{
	public static void main(String[] args) 
	{
		WebDriver f=new FirefoxDriver();
		f.get("https://login.yahoo.com");
		f.manage().window().maximize();
		f.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String s=f.findElement(By.id("login-username")).getAttribute("placeholder");
		System.out.println(s);
		
		f.findElement(By.cssSelector("#login-username")).sendKeys("mailngfhgf");
		String s1=f.findElement(By.cssSelector("#login-username")).getAttribute("value");
		System.out.println(s1);
		
		String colour=f.findElement(By.id("login-signin")).getCssValue("background-color");
		System.out.println(colour);
		
		String yahoocolor=f.findElement(By.className("logo")).getCssValue("width");
		System.out.println(yahoocolor);

	}
}
