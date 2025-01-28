package ui_elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestDragandDrop extends Open_close_sauce{	
@Test
	public void testDragandDropBox() {
	    driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
		WebElement drag = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement drop = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag,drop).perform();
		}
	@Test(priority=1)
	public void testDragandDropImages() {
	    driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
	    driver.findElement(By.xpath("//a[text()='Images']")).click();
	    WebElement drag = driver.findElement(By.xpath("//img[@src='/static/home/smile.png']"));
		WebElement drop = driver.findElement(By.id("rect-droppable2"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag,drop).perform();
		
		}

}
