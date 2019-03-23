package com.sinarios;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalRoughDemo 
{
	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com/");
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		List<WebElement> lst=driver.findElements(By.xpath("//td[@class='mapbg']/div[3]/div[*]/div[*]/ul[*]/li[*]"));
		System.out.println(lst.size());
		for(int i=0;i<=lst.size()-1;i++)
		{
			System.out.println(lst.get(i).getText());
		}
		System.out.println("*******");
		for(WebElement wb:lst)
		{
			System.out.println(wb.getText());
		}
		System.out.println("*********");
	}
}
