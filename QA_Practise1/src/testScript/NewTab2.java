package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class NewTab2{
@Test
public void run(){

        // Set path for ChromeDriver (replace with the path to your chromedriver)
        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

        // Initialize Chrome options (optional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        // Start the ChromeDriver with the options
        WebDriver driver = new ChromeDriver(options);

        try {
            // Step 1: Open Google and search for Flipkart
            driver.get("https://www.google.com");

            // Wait for the search box to be visible and perform the search
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
            searchBox.sendKeys("Flipkart");
            searchBox.submit();

            // Wait for the search results to load and locate the Flipkart link
            WebElement flipkartLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'Flipkart')]")));
            flipkartLink.click();

            // Wait for Flipkart website to load (adjust if needed)
            wait.until(ExpectedConditions.titleContains("Flipkart"));
            Thread.sleep(3000); // Optional wait for demo purposes

            // Step 2: Open a new tab and search for Amazon
            driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
            driver.get("https://www.google.com");

            // Wait for the search box to be visible and perform the search for Amazon
            searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
            searchBox.sendKeys("Amazon");
            searchBox.submit();

            // Wait for the search results to load and locate the Amazon link
            WebElement amazonLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'Amazon')]")));
            amazonLink.click();

            // Wait for Amazon website to load (adjust if needed)
            wait.until(ExpectedConditions.titleContains("Amazon"));
            Thread.sleep(3000); // Optional wait for demo purposes

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser after the operations
            driver.quit();
        }}}