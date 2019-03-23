package com.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();

		driver.get("https://www.yahoo.com");	

		driver.manage().window().maximize();

		Thread.sleep(10000);

		List<WebElement> st=driver.findElements(By.tagName("a"));

		Thread.sleep(3000);

		System.out.println(st.size());

		for(int i=0;i<=st.size()-1;i++)
		{
			System.out.println(st.get(i).getText());
		}  	
	}
}
