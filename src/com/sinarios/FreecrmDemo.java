package com.sinarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FreecrmDemo {

	
	public static void main(String[] args) {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//form[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
		//form[@id='vContactsForm']/table/tbody/tr[4]/td[1]/input
		String beforexpath="form[@id='vContactsForm']/table/tbody/tr[";
		String afterxpath="]/td[2]/a";
		
		for(int i=4;i<=24;i++)
		{
			String name=driver.findElement(By.xpath("//form[@id='vContactsForm']/table/tbody/tr["+i+"]/td[2]/a")).getText();
			System.out.println(name);
			if(name.equals("Deepak Yadav"))
			{
				driver.findElement(By.xpath("//form[@id='vContactsForm']/table/tbody/tr[23]/td[1]/input")).click();
			}
		}
		//driver.quit();
		/*String s="//form[@id='vContactsForm']/table/tbody/tr[*]/td[2]/a";
		List<WebElement> name=driver.findElements(By.xpath(s));
		
		System.out.println(name.size());
		
		System.out.println(name);
	
		for (int i = 1; i <name.size(); i++) 
		{
			String str=name.get(i).getText();
			System.out.println(str);
		}*/
		
		/*String s1="//form[@id='vContactsForm']/table/tbody/tr[*]/td[*]/input";
		List<WebElement> name1=driver.findElements(By.xpath(s1));
		
		System.out.println(name1.size());
	
		for (int i = 2; i <name1.size(); i++) 
		{
			name1.get(i).click();
		}*/
		
	}
}
