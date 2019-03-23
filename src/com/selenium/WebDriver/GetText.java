package com.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText 
{
public static void main(String[] args)
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.gmail.com");
	
	String expectres="Enter an email or phone number";
	
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	String actlres=driver.findElement(By.xpath("//div[@class='dEOOab RxsGPe']")).getText();
	System.out.println(actlres);
	
	if(expectres.equals(actlres))
	{
		System.out.println("pass ::::");
	}
	else
	{
		System.out.println("fail ::::");
	}
}
}
