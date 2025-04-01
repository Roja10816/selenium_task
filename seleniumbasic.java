package com.selenium.jattask9;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class seleniumbasic {
	    public static void main(String[] args) {
	        // Set the path to the geckodriver executable
	        //System.setProperty("webdriver.gecko.driver", "path/to/geckodriver"); // Replace with your geckodriver path

	        // Create FirefoxOptions
	        //FirefoxOptions options = new FirefoxOptions();
	        
	        // Initialize the WebDriver for Firefox
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Navigate to Google
	            driver.get("http://google.com");

	            // Print the current URL
	            System.out.println("Current URL: " + driver.getCurrentUrl());

	            // Reload the page
	            driver.navigate().refresh();

	            // Print the URL again after refresh
	            System.out.println("URL after refresh: " + driver.getCurrentUrl());
	        } finally {
	            // Close the browser
	            //driver.quit();
	        }
	    }
	}


