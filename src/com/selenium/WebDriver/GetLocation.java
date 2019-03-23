package com.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetLocation {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yahoo.com");
		Point p=driver.findElement(By.id("uh-search-box")).getLocation();
		System.out.println(p);
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		
}
}
