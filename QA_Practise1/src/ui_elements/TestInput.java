package ui_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestInput extends Open_close_sauce{
@Test(priority = 1)
public void textInput()
{
	driver.findElement(By.xpath("//a[text()='Inputs']")).click();
	driver.findElement(By.xpath("//a[text()='Text input']")).click();
	driver.findElement(By.id("id_text_string")).sendKeys("Adarsha"+Keys.ENTER);
		
}
@Test
public void emailField()
{
	driver.findElement(By.xpath("//a[text()='Inputs']")).click();
	driver.findElement(By.xpath("//a[text()='Email field']")).click();
	driver.findElement(By.xpath("//input[@type='text' and @name='email']")).sendKeys("adarshakn24@gmail.com"+Keys.ENTER);
	
}
@Test
public void passwordField()
{
	driver.findElement(By.xpath("//a[text()='Inputs']")).click();
	driver.findElement(By.xpath("//a[text()='Password field']")).click();
	driver.findElement(By.xpath("//input[@type='password' and @placeholder='Submit me']")).sendKeys("Abcd1234*#"+Keys.ENTER);
	
}
}
