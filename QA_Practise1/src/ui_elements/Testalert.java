package ui_elements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testalert extends Open_close_sauce{
	@Test
	public void testalertBox() {
	    driver.findElement(By.xpath("//a[text()='Alerts']")).click();
		WebElement button = driver.findElement(By.xpath("//a[text()='Click']"));
		button.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		}
	@Test(priority=1)
	public void testconfirmationBox() {
	    driver.findElement(By.xpath("//a[text()='Alerts']")).click();
	    driver.findElement(By.xpath("//a[text()='Confirmation box']")).click();
		WebElement button = driver.findElement(By.xpath("//a[text()='Click']"));
		button.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
		}
	@Test(priority=2)
	public void testpromptBox() {
	    driver.findElement(By.xpath("//a[text()='Alerts']")).click();
	    driver.findElement(By.xpath("//a[text()='Prompt box']")).click();
	    WebElement button = driver.findElement(By.xpath("//a[text()='Click']"));
	    button.click();
	    Alert a = driver.switchTo().alert();
		a.sendKeys("promptbox");
		a.accept();
	
		}
}
