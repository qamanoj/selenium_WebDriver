package com.sinarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail 
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
		String x="//div[@class='UI']/div/div[1]/div[2]/div/table/tbody/tr[*]/td[2]/div";
		List<WebElement> st=driver.findElements(By.xpath(x));
		//click all the check box
		for(int i=0;i<st.size();i++)
		{
			st.get(i).click();
		}
		//driver.findElement(By.xpath("//div[@class='ar9 T-I-J3 J-J5-Ji']")).click();
	}
}
