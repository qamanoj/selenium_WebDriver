package com.sinarios;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class App1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Manoj%20Kumar/Desktop/app.html");

		Select s=new Select(driver.findElement(By.id("name")));
		
		List<WebElement> option=s.getOptions();
		HashMap<String, Integer> map=new HashMap<>();
		
		for(WebElement w:option)
		{
			String str=w.getText();
			if(!map.containsKey(str))
			{
				map.put(str, 1);
			}
			else
			{
				Integer in=map.get(str);
				in++;
				map.put(str, in);
			}
		}
		System.out.println(map);
	}
}
