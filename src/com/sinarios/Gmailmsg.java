package com.sinarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailmsg 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver dd=new FirefoxDriver();
		dd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dd.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		dd.findElement(By.id("identifierId")).sendKeys("manojmanoj3695@gmail.com");
		dd.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(3000);
		dd.findElement(By.xpath("//input[@name='password']")).sendKeys("7377111385");
		dd.findElement(By.xpath(".//*[@id='passwordNext']")).click();
		Thread.sleep(3000);
		String f="//table[@class='F cf zt']/tbody/tr/td[6]";
		List<WebElement>lst= dd.findElements(By.xpath(f));
		for(int i=0;i<lst.size();i++)
		{
			System.out.println( lst.get(i).getText());
		}
	}
}
