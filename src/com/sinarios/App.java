package com.sinarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class App
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("ddC:/Users/Manoj%20Kumar/Desktop/app.html");

		Select s=new Select(driver.findElement(By.id("name")));

		List<WebElement> lst=s.getOptions();
		List<String> alltext=new ArrayList<>();
		List<String> alltext1=new ArrayList<>();

		for(WebElement op:lst)
		{
			String str=op.getText();
			System.out.println(str);

			alltext.add(str);
		}
		System.out.println("**********");

		Collections.sort(alltext);

		for(String st:alltext)
		{
			System.out.println(st);
			alltext1.add(st);
		}
		System.out.println("**********");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String string=sc.next();
		
		for(String duplicate:alltext1)
		{
			if(duplicate.contains(string))
			{
				System.out.println(duplicate);
			}
		}
	}
}
