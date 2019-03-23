package WindowHandel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup
{
	public static void main(String[] args) 
	{  
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//click on a button which open an alert
		driver.findElement(By.id("loginbutton")).click();
		//pass driver control to alert pop-up
		Alert alt=driver.switchTo().alert();
		//capture msg from alert pop-up
		System.out.println(alt.getText());
		//click on ok button
		alt.accept();
		//perform an action on parent window
		driver.findElement(By.id("usernameId")).sendKeys("1234");
		driver.findElement(By.name("j_password")).sendKeys("74223");
	}
}
