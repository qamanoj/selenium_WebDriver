package com.selenium.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
	public static void main(String[] args)
	{

		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demos.telerik.com/kendo-ui/dragdrop/index");
		driver.manage().window().maximize();

		WebElement srcwb=driver.findElement(By.id("draggable"));
		WebElement deswb=driver.findElement(By.id("droptarget"));
		Actions act=new Actions(driver);
		//act.dragAndDrop(srcwb,deswb).perform();
		act.clickAndHold(srcwb).moveToElement(deswb).release().build().perform();
	}
}
