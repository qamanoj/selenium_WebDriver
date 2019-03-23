package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelenumGrid1 
{
	
	public static void main(String[] args) throws MalformedURLException  {

		String ipadd="http://192.168.43.102:4444/wd/hub";
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN10);
		
		
		WebDriver driver=new RemoteWebDriver(new URL(ipadd),dc);
		
		driver.get("https://www.seleniumhq.org/download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Google Chrome Driver']")).click();
	}
}
