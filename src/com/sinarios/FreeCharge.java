package com.sinarios;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FreeCharge 
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecharge.in/?utm_source=google&utm_medium=paid&utm_campaign=fc_sok_sem_reach_rma_web_in000_cc000_super_brand_rlsa&gclid=CjwKCAiA_ojVBRAlEiwAOLRxI3sKiUlUI_MT9m68t1HVoHN0tQwQqg6vtLZcmfGoVbGdnth4yaYgaBoCufwQAvD_BwE");
		
		driver.findElement(By.xpath("//a[text()='Login/Register']")).click();
		
		driver.findElement(By.xpath("//span[text()='Login with Google']")).click();
		
		Set<String> str=driver.getWindowHandles();
		//System.out.println(str.size());
		
		Iterator<String> s=str.iterator();
		String parent=s.next();
		String child=s.next();
		
		driver.switchTo().window(child);
		driver.findElement(By.id("identifierId")).sendKeys("manojmanoj3695");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
}
