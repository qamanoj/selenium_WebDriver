package WindowHandel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvatiesmentPopup 
{
	public static void main(String[] args) 
	{
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("http://www.tappx.com/en/promote-your-app/?utm_source=bing&utm_medium=cpc&utm_campaign=eeuu");
			driver.manage().timeouts().implicitlyWait(22,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//i[@class='tappxicon tappxicon-close']")).click();
			
		}
	}
