package WindowHandel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderPopUp 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().timeouts().implicitlyWait(22,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("hp-widget__depart")).click();
		int count=0;
		while(count<12)
		{
			try
			{
				String x="//td[@data-year='2018' and @data-month='8']/a[text()='20']";
				driver.findElement(By.xpath(x)).click();
				break;
			}
			catch(Exception e)
			{
				String x1="//div[@class='dateFilter hasDatepicker']/div/div[2]/div/a/span[text()='Next']";
				driver.findElement(By.xpath(x1)).click();
				count++;
				if(count==12)
				{
					System.out.println("invalid date");
				}
			}
		}
	}
}
