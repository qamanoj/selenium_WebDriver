package com.sinarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazone1 
{
	public static void main(String[] args) 
	{
		//.//*[@id='nav-flyout-shopAll']/div[2]
		//div[@class='nav-template nav-flyout-content nav-tpl-itemList']/span[*]
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.fr/");
		WebElement w=driver.findElement(By.xpath("//span[text()='catégories']"));
		Actions act=new Actions(driver);
		act.moveToElement(w).perform();

		String f=".//div[@id='nav-flyout-shopAll']/div[2]/span[*]";
		List<WebElement> lst= driver.findElements(By.xpath(f));
		System.out.println(lst.size());
		System.out.println("**********");
		for(int i=0;i<lst.size();i++)
		{
			System.out.println( lst.get(i).getText());
		}
	}
}
