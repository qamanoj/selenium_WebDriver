package com.sinarios;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesForce {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();

		driver.get("https://login.salesforce.com/?locale=in");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("manojkumar123");

		driver.findElement(By.id("password")).sendKeys("12345");

		driver.findElement(By.xpath(".//input[@id='Login']")).click();

		String actmsg="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

		String expmsg=driver.findElement(By.id("error")).getText();

		System.out.println(expmsg);

		if(expmsg.equals(expmsg))
		{
			System.out.println("this testcase is pass=====");
		}
		else
		{
			System.out.println("this testcase is fail=====");
		}
	}

}
