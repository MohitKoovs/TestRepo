package com.qa.TestRepo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\browserdrivers\\chromedriver.exe");

		driver= new ChromeDriver(); 

		driver.get("http://www.google.com");
		
		
	}

}