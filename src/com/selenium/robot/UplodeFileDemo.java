package com.selenium.robot;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UplodeFileDemo 
{
	public static void main(String[] args) throws Exception
	{
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		driver.findElement(By.id("wordresume")).click();
		
		StringSelection s=new StringSelection("C:\\Users\\Manoj Kumar\\Desktop\\Manoj Kumar _Testing.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
