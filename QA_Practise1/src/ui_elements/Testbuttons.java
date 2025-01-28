package ui_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testbuttons extends Open_close_sauce {
@Test(priority = 1)
public void simpleButtons()
{
	driver.findElement(By.xpath("//a[text()='Buttons']")).click();
	driver.findElement(By.xpath("//input[@name='submit' and @type='submit']")).click();
		
}

@Test
public void lookslike_a_Button()
{
	driver.findElement(By.xpath("//a[text()='Buttons']")).click();
	driver.findElement(By.xpath("//a[text()='Looks like a button']")).click();
	driver.findElement(By.xpath("//a[text()='Click']")).click();
	
}

@Test
public void buttonDisabled()
{
	driver.findElement(By.xpath("//a[text()='Buttons']")).click();
	driver.findElement(By.xpath("//a[text()='Disabled']")).click();
	WebElement we = driver.findElement(By.xpath("//select[@id='id_select_state' and @class='form-select'] "));
	Select s = new Select(we);
	s.selectByValue("enabled");
	we.click();
	driver.findElement(By.xpath("//input[@name='submit' and @type='submit']")).click();
	
}
}
