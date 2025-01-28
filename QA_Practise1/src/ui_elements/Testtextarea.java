package ui_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testtextarea extends Open_close_sauce {
	@Test
	public void testTextArea() {
	    driver.findElement(By.xpath("//a[text()='Text area']")).click();
		driver.findElement(By.xpath("//textarea[@name='text_area']")).sendKeys("A paragraph is a group of sentences that support a single main idea. Paragraphs are a key part of any piece of writing longer than a few sentences. They help readers understand the structure of a piece of writing and grasp its main points. ");
		WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		Point l = button.getLocation();
		int x = l.getX();
		int y = l.getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		button.click();
		WebElement ye = driver.findElement(By.xpath("//p[text()='You entered']"));
		Point l1 = ye.getLocation();
		int X = l1.getX();
		int Y = l1.getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+X+","+Y+")");
		}
	@Test(priority=1)
	public void testMultipletextareas() {
	
		driver.findElement(By.xpath("//a[text()='Text area']")).click();
		driver.findElement(By.xpath("//a[text()='Multiple textareas']")).click();
		driver.findElement(By.xpath("//textarea[@name='first_chapter']")).sendKeys("In the bustling city of New York, where towering skyscrapers pierce the sky and the relentless hum of traffic echoes through the streets, a young woman named Maya embarks on a life-altering journey, fueled by a relentless pursuit of her artistic dreams, unaware of the intricate web of challenges and unexpected connections that await her in the vibrant, yet unforgiving landscape of the art world.");
		driver.findElement(By.xpath("//textarea[@name='second_chapter']")).sendKeys("Chapter 2 delves deeper into the historical context surrounding the development of the steam engine, exploring key figures like Thomas Savery and Thomas Newcomen whose early inventions laid the foundation for James Watt's groundbreaking improvements. This section examines the critical technological advancements that enabled the steam engine to transition from a rudimentary pump to a powerful force driving industrial revolution, highlighting the pivotal role of the condenser in enhancing efficiency and expanding its applications across various industries.");
		driver.findElement(By.xpath("//textarea[@name='third_chapter']")).sendKeys("Chapter 3 delves into the research methodology employed in this study, outlining the specific data collection methods, including semi-structured interviews with key stakeholders, alongside a detailed explanation of the thematic analysis process used to identify recurring patterns and themes within the qualitative data, allowing for a deeper understanding of the complex factors contributing to the phenomenon under investigation.");
		WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		Point l = button.getLocation();
		int x = l.getX();
		int y = l.getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		button.click();
		
		WebElement ye = driver.findElement(By.xpath("//p[text()='You entered']"));
		Point l1 = ye.getLocation();
		int X = l1.getX();
		int Y = l1.getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+X+","+Y+")");
		}

}
