package testScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTab {
	@Test
	public void testNew() {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
			driver.get("https://www.amazon.com");
			//driver.findElement(By.xpath("//input[@id='input' and @type='search']")).sendKeys("Amazon"+Keys.ENTER);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
			driver.get("https://www.flipkart.com");
			//driver.findElement(By.xpath("//input[@id='input' and @type='search']")).sendKeys("Flipkart"+Keys.ENTER);

			} 
		catch (AWTException e) 
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			}}}
