package com.selenium.select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main(String[] args) 
	{
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.facebook.com");

		WebElement wb=d.findElement(By.id("month"));
		Select sel=new Select(wb);
		sel.selectByValue("2");

		WebElement wb1=d.findElement(By.id("day"));
		Select sel1=new Select(wb1);
		sel1.selectByVisibleText("18");

		WebElement wb2=d.findElement(By.id("year"));
		Select sel2=new Select(wb2);
		sel2.selectByValue("2018");

		d.navigate().back();
		d.navigate().forward();

		Select s=new Select(d.findElement(By.id("month")));
		s.selectByValue("2");
		s.selectByIndex(2);

		Select s1=new Select(d.findElement(By.id("day")));
		s1.selectByVisibleText("18");
		s1.selectByIndex(18);

		new Select(d.findElement(By.id("year"))).selectByVisibleText("2018");
		
		//d.quit();
	}
}
