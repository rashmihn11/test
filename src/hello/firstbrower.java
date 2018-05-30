package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstbrower {
	
	public static void main(String[] args) {
		WebDriver browser;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pavan\\Desktop\\Setup\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		browser = new FirefoxDriver();
		//System.setProperty(key, value);
		
		
		String baseURL = "http://adactin.com/HotelApp/";
		
		
		browser.get(baseURL);
		browser.findElement(By.xpath(".//*[@id='username']")).sendKeys("adactin123");
		browser.findElement(By.id("password")).sendKeys("adactin123");
		browser.findElement(By.xpath(".//*[@id='login']")).click();
		
				
	
	}

}
