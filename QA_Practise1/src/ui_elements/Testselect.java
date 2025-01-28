package ui_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testselect extends Open_close_sauce {
	@Test(priority = 1)
	public void singleSelect()
	{
		driver.findElement(By.xpath("//a[text()='Select']")).click();
		WebElement we = driver.findElement(By.xpath("//select[@name='choose_language']"));
		Select s = new Select(we);
		s.selectByValue("4");
		driver.findElement(By.xpath("//input[@name='submit' and @type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Select']")).click();
		
	}
	@Test
	public void multiSelect()
	{
		driver.findElement(By.xpath("//a[text()='Select']")).click();
		driver.findElement(By.xpath("//a[text()='Multiple selects']")).click();
		WebElement we2 = driver.findElement(By.xpath("//select[@class='select form-select' and @id='id_choose_the_place_you_want_to_go']"));
		Select s1 = new Select(we2);
		s1.selectByValue("1");
		
		WebElement we3 = driver.findElement(By.xpath("//select[@class='select form-select' and @id='id_choose_how_you_want_to_get_there']"));
		Select s2 = new Select(we3);
		s2.selectByValue("1");
		
		WebElement we4 = driver.findElement(By.xpath("//select[@class='select form-select' and @id='id_choose_when_you_want_to_go']"));
		Select s3 = new Select(we4);
		s3.selectByValue("1");
		
		driver.findElement(By.xpath("//input[@name='submit' and @type='submit']")).click();
	}

}
