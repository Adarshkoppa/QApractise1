package ui_elements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestPopups extends Open_close_sauce {
	@Test
	public void testModal() {
	    driver.findElement(By.xpath("//a[text()='Pop-Up']")).click();
		driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Send']")).click();
		}
	@Test
	public void testIframePopup() {
	    driver.findElement(By.xpath("//a[text()='Pop-Up']")).click();
	    driver.findElement(By.xpath("//a[text()='Iframe Pop-Up']")).click();
		driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-primary']")).click();
		Set<String> wh = driver.getWindowHandles();
		for (String str : wh)
		{
			driver.switchTo().window(str);
		}
		WebElement msg = driver.findElement(By.xpath("//div[@class='card card-body']/p[@id='text-to-copy']"));
		String text = msg.getText();
		driver.findElement(By.xpath("//button[text()='Check']")).click();
		driver.findElement(By.xpath("//input[@name='text_from_iframe']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
}}
