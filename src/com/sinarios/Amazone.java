package com.sinarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazone 
{
	public static void main(String[] args)
	{
		WebDriver d=new FirefoxDriver();
		d.get("https://amazon.in/");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("moto e3 power",Keys.ENTER);
		String search= d.findElement(By.id("s-result-count")).getText();	
		System.out.println(search);
		
		WebElement w=d.findElement(By.xpath("//span[text()='Category']"));
		Actions act=new Actions(d);
		act.moveToElement(w).perform();
		
		WebElement w1=d.findElement(By.xpath("//span[text()='TV, Appliances, Electronics']"));
		act.moveToElement(w1).perform();
		
		d.findElement(By.xpath("//span[text()='Headphones']")).click();
	}
}
