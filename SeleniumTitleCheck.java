package com.selenium.jattask9;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxOptions;

	public class SeleniumTitleCheck {
	    public static void main(String[] args) {
	       

	        // Initialize the WebDriver for Firefox
	    	 WebDriver driver = new ChromeDriver();

	        try {
	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Navigate to the website
	            driver.get("https://www.demoblaze.com/");

	            // Get the title of the current page
	            String pageTitle = driver.getTitle();

	            // Check if the title matches "STORE"
	            if (pageTitle.equals("STORE")) {
	                System.out.println("Page landed on the correct website");
	            } else {
	                System.out.println("Page not landed on correct website");
	            }
	        } finally {
	            // Close the browser
	            //driver.quit();
	        }
	    }
	}



