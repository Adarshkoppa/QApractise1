package ui_elements;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestnewTab extends Open_close_sauce{
	@Test(priority = 1)
	public void testNewLink()
	{
		driver.findElement(By.xpath("//a[text()='New tab']")).click();
		driver.findElement(By.id("new-page-link")).click();
	}
	@Test
	public void testNewButton()
	{
		driver.findElement(By.xpath("//a[text()='New tab']")).click();
		driver.findElement(By.xpath("//a[text()='New tab button']")).click();
		driver.findElement(By.id("new-page-button")).click();
	}

}
