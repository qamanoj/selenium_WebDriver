package com.sinarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppleIphoneI7 
{
	public static void main(String[] args) 
	{
		WebDriver d= new FirefoxDriver();
		d.get("https://amazon.in");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 7",Keys.ENTER);
		String fx=".//div[@id='resultsCol']/div[1]/div/ul/li/div/div/div/div[2]/div[1]/div[1]/a";
		List<WebElement> lst= d.findElements(By.xpath(fx));
		System.out.println(lst.size());
		for(int i=0;i<lst.size()-1;i++)
		{
			System.out.println(lst.get(i).getText());
		}
		/*for(WebElement wb:lst)
		{
			System.out.println(wb.getText());
		}*/
		d.close();
	}
}
