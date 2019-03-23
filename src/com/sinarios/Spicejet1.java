package com.sinarios;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spicejet1 
{
	public static void main(String[] args) 
	{

    	WebDriver driver=new FirefoxDriver();
    	
    	driver.get("http://book.spicejet.com/");
    	
    	driver.manage().window().maximize();
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	driver.navigate().refresh();
    	
    	driver.findElement(By.name("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
    	
    	WebElement window=driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTNR"));
    	
    	List<WebElement> links=window.findElements(By.tagName("a"));
    	
    	for(WebElement li:links)
    	{
    		String x=li.getText();
    		System.out.println(x);
    		
    		if(x.contains("Kochi (COK)"))
    		{
    			li.click();
    			break;
    		}
    		
    	}
    	boolean flag=false;
    	driver.findElement(By.name("custom_date_picker")).click();
    	Scanner s=new Scanner(System.in);
		System.out.println("enter the month");
		String expmnth=s.next();
    	while(true)
    	{
    		
    		driver.findElement(By.xpath("//span[text()='Next']")).click();
    		
    		
    		String text=driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]/span")).getText();
    		
    		
    		
    		if(text.contains(expmnth))
    		{
    			WebElement table=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table"));
    			
    			List<WebElement> rows=table.findElements(By.tagName("tr"));
    			
    			for(WebElement r:rows)
    			{
    				List<WebElement> columns=r.findElements(By.tagName("td"));
    			
    				for(WebElement c:columns)
    				{
    					String x=c.getText();
    					System.out.println(x);
    					if(x.contains("19"))
    					{
    						c.click();
    						flag=true;
    						break;
    					}
    				}
    				if(flag==true)
    				{
    					break;
    				}
    			}
    			
    			if(flag==true)
				{
					break;
				}
    		}
    	}
    	
    	
    	
    	
    	
    	
	}
}
