package com.sinarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText 
{
	public static void main(String[] args) 
	{
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		d.get("https://google.co.in/?gws_rd=ssl");
		d.findElement(By.id("lst-ib")).sendKeys("wipro careers");
		List<WebElement> list = d.findElements(By.xpath("//div[@class='sbdd_b']/div/ul/li[*]"));
		System.out.println(list.size());
		for(int i=0;i<list.size()-1;i++)
		{
			System.out.println(list.get(i).getText());

		}
		d.quit();
	}
}
