package ui_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class Open_close_sauce implements Data{
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
	driver = new ChromeDriver();
	System.setProperty(Key, Value);
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//span[text()='Single UI Elements']")).click();
	}
	public void closeApp()
	{
	driver.close();	
	}

}
