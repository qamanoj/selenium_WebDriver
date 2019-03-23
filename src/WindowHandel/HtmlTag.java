package WindowHandel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HtmlTag 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//font[text()=' Wi-Fi Railway Stations']")).click();
		
		Set<String> set=driver.getWindowHandles();
		System.out.println(set.size());
		
		Iterator<String> it=set.iterator();
		String parentid=it.next();
		String childid=it.next();
		
		driver.switchTo().window(childid);
		driver.findElement(By.linkText("Home")).click();
		
		driver.switchTo().window(parentid);
		driver.findElement(By.id("usernameId")).sendKeys("manoj");
		
		driver.switchTo().window(childid);
		driver.findElement(By.linkText("Apply Online")).click();
		driver.close();
		
		driver.switchTo().window(parentid);
		driver.findElement(By.name("j_password")).sendKeys("kumar");
		driver.quit();
	}
}
