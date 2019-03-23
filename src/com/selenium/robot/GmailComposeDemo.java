package com.selenium.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailComposeDemo 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		//login
		String santosh="psantoshrao414@gmail.com";
		String password="psantoshrao7@gmail.com";
		driver.findElement(By.id("identifierId")).sendKeys(santosh);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=':h4']/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dw']/div/div/div/div/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/textarea")).sendKeys("manojmanoj3695@gmail.com",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='dw']/div/div/div/div/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[3]/input")).sendKeys("fuck me",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='dw']/div/div/div/div/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[2]/div[2]/div")).sendKeys("Hi Manoj Sir",Keys.ENTER,"how are you",Keys.ENTER,"Can You fuck me today midnight",Keys.ENTER,"Thanks and Regards",Keys.ENTER,"Name:Santosh Rao",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='dw']/div/div/div/div/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[4]/div/div[1]/div/div/div")).click();
		
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
		
		driver.findElement(By.xpath("//div[@class='dw']/div/div/div/div/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]")).click();
		driver.quit();
	}
}
