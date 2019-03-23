package com.selenium.select;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions
{
	public static void main(String[] args)
	{
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.facebook.com");

		WebElement element=d.findElement(By.id("month"));
		Select wb=new Select(element);
		//Select wb=new Select(d.findElement(By.id("month")));

		List <WebElement> elementCount = wb.getOptions();
		System.out.println(elementCount.size());
		for(int i=0;i<=elementCount.size()-1;i++)
		{
			System.out.println(elementCount.get(i).getText());
		}
		System.out.println("***********");
		for(WebElement wb1:elementCount)
		{
			System.out.println(wb1.getText());
		}
		System.out.println("***********");
		Select wb1=new Select(d.findElement(By.id("day")));
		List <WebElement> elementCount1 = wb1.getOptions();
		System.out.println(elementCount1.size());
		for(int i=1;i<=elementCount1.size()-1;i++)
		{
			System.out.println(elementCount1.get(i).getText());
		}

		System.out.println("***********");

		Select wb2=new Select(d.findElement(By.id("year")));
		List <WebElement> elementCount2 = wb2.getOptions();
		System.out.println(elementCount2.size());
		int a=elementCount2.size();
		for(int i=0;i<a-1;i++)
		{
			System.out.println(elementCount2.get(i).getText());
		}
	}
}
