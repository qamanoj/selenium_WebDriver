package com.sinarios;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com/");
		//click on radio button
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		//click on form DropDown options
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		//display all DropDown options in the console
		List<WebElement> w=driver.findElements(By.xpath("//td[@class='mapbg']/div[3]/div[*]/div[*]/ul[*]/li[*]"));
		System.out.println(w.size());
		for(int i=0;i<=w.size()-1;i++)
		{
			System.out.println(w.get(i).getText());
		}
		System.out.println("******************");
		//click on GOI
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		//display all dropdown options in the console
		List<WebElement> w1=driver.findElements(By.xpath("(//td[@class='mapbg'])[2]/div[3]/div[*]/div[*]/ul[*]/li[*]"));
		System.out.println(w1.size());
		for(int i=0;i<=w1.size()-1;i++)
		{
			System.out.println(w1.get(i).getText());
		}
		//click on to dropdown options
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		//click on calender pop-up
		int count=0;
		while(count<12)
		{
			try
			{
				String str="//td[@data-year='2018' and @data-month='7']/a[text()='19']";
				driver.findElement(By.xpath(str)).click();
				break;
			}
			catch(Exception e)
			{
				String st="//div[@id='ui-datepicker-div']/div[2]/div/a/span[text()='Next']";
				driver.findElement(By.xpath(st)).click();
				count++;
				if(count==12)
				{
					System.out.println("invalid date");
				}
			}
		}
		//click on Adult and select one by one
		/*WebElement wb=driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']"));

		Select sel =new Select(wb);

		sel.selectByValue("4");
		//click on Clild and select one by one
		Select se=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		se.selectByIndex(4);
		//click on infant and select one by one
		Select ss=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		ss.selectByVisibleText("4");*/
		//click on curency and select one by one
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByIndex(3);
		s.selectByValue("AED");
		s.selectByVisibleText("INR");
		//display all the curency and show in console
		List<WebElement> st=s.getOptions();
		System.out.println("**********");
		System.out.println(st.size());
		for(int i=0;i<st.size();i++)
		{
			String str=st.get(i).getText();
			System.out.println(str);
		}
		//click on check box
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		//move mouse on login button
		WebElement ww=driver.findElement(By.id("ctl00_HyperLinkLogin"));
		Actions act=new Actions(driver);
		act.moveToElement(ww).perform();
		//click on the travel agent login option
		driver.findElement(By.xpath("//div[@class='maincontainer']/div/div[1]/div[2]/div[2]/div/ul/li[14]/ul/li[3]/a")).click();
		//enter data into username
		WebElement ww2= driver.findElement(By.id("ControlGroupLoginAgentView_AgentLoginView_TextBoxUserID"));
		ww2.sendKeys("manoj");
		//dobleclick on username
		act.doubleClick(ww2).perform();
		//copy username
		act.sendKeys(Keys.chord(Keys.CONTROL,"C")).perform();
		//click on tab button
		act.sendKeys(Keys.TAB).perform();
		//paste it into password field
		act.sendKeys(Keys.chord(Keys.CONTROL,"V")).perform();

	}
}
