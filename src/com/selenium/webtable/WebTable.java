package com.selenium.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable 
{
	public static WebDriver driver;

	public void webtable(String operation)
	{
		try 
		{
			boolean flag=false;
			boolean status=false;

			WebElement table=driver.findElement(By.id("DG_bankdetails"));

			List<WebElement> rows = table.findElements(By.tagName("tr"));
			
			//System.out.println(rows.size());   o/p-7

			String pagelinks[]=rows.get(rows.size()-1).getText().split(" ");

			for (int i = 1; i < pagelinks.length; i++) 
			{
				table=driver.findElement(By.id("DG_bankdetails"));

				rows = table.findElements(By.tagName("tr"));

				for(WebElement r : rows)
				{
					List<WebElement> columns = r.findElements(By.tagName("td"));

					for (WebElement c : columns) 
					{
						if (c.getText().matches("233")) 
						{
							if (operation.equalsIgnoreCase("edit"))
							{
								columns.get(columns.size()-2).findElement(By.tagName("a")).click();
							} 
							else if (operation.equalsIgnoreCase("delete")) 
							{
								columns.get(columns.size()-1).findElement(By.tagName("a")).click();
							}
							else
							{
								System.out.println("Wrong operation entered");
							}
							flag=true;
							break;
						} 
					}
					if (flag == true)
					{
						break;
					}
				}
				if (flag == true)
				{
					break;
				}
				try
				{
					if(pagelinks[i].contains("...") && status==true)
					{
						driver.findElement(By.xpath("//a[text()='...'][2]")).click();
					}
					else
					{
						table.findElement(By.linkText(pagelinks[i])).click();
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				if(pagelinks[i].contains("..."))
				{
					status=true;
					webtable(operation);
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		driver=new FirefoxDriver();
		driver.get("http://srssprojects.in/home.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		WebTable w=new WebTable();
		w.webtable("edit");
	}
}


