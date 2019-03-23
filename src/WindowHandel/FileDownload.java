package WindowHandel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=OndXWpqHOoqjX6KLj7AD");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("lst-ib")).sendKeys("java download",Keys.ENTER);
		driver.findElement(By.linkText("Download Free Java Software")).click();
		driver.findElement(By.xpath("//div[@class='jvdl0 jvdl0v0']/a/span ")).click();
		driver.findElement(By.xpath("//div[@class='jvdl0 jvdl0v0']/a/span")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
	}
}
