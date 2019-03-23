package com.sinarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailMenory 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		//login
		driver.findElement(By.id("identifierId")).sendKeys("manojmanoj3695@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("7377111385");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//identify multiple checkbox in 2nd column from index table
		//String x="//div[@id=':iv']/div/div/div[1]/span[2]";
		String x="//div[@id=':iv']/div/div/div[1]/span[1]";
		String s=driver.findElement(By.xpath(x)).getText();
		System.out.println(s);
	}
}
