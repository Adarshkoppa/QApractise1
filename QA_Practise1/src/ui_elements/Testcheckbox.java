package ui_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcheckbox extends Open_close_sauce{
	@Test(priority = 1)
	public void singleCheckbox()
	{
		driver.findElement(By.xpath("//a[text()='Checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @class='form-check-input']")).click();
		driver.findElement(By.xpath("//input[@name='submit' and @type='submit']")).click();
	}

	@Test
	public void Checkboxes()
	{
		driver.findElement(By.xpath("//a[text()='Checkbox']")).click();
		driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='one']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='two']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='three']")).click();
		driver.findElement(By.xpath("//input[@name='submit' and @type='submit']")).click();
	}
}
