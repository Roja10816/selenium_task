package com.selenium.jattask9;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class question3 {
	    public static void main(String[] args) {
	        // Set the path to the chromedriver executable
	       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Replace with your chromedriver path

	        // Create ChromeOptions
	        ChromeOptions options = new ChromeOptions();

	        // Initialize the WebDriver for Chrome
	        WebDriver driver = new ChromeDriver(options);

	        try {
	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Navigate to Wikipedia
	            driver.get("https://www.google.com");

	            // Find the search input field and enter "Artificial Intelligence"
	            WebElement searchBox = driver.findElement(By.name("search"));
	            searchBox.sendKeys("Artificial Intelligence");

	            // Find and click the search button
	            WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
	            searchButton.click();

	            // Wait for the page to load the search results
	            Thread.sleep(2000); // It's better to use WebDriverWait, but we're using Thread.sleep for simplicity

	            // Click on the "History" section link in the search results
	            WebElement historyLink = driver.findElement(By.partialLinkText("History"));
	            historyLink.click();

	            // Wait for the page to load the History section
	            Thread.sleep(2000); // Again, use WebDriverWait for better synchronization

	            // Print the title of the History section
	            WebElement historySectionTitle = driver.findElement(By.id("History"));
	            System.out.println("History Section Title: " + historySectionTitle.getText());
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            //driver.quit();
	        }
	    }
	


}



