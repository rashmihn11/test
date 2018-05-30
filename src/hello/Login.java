package hello;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		
		String path="C:\\Users\\pavan\\eclipse-workspace\\hello\\firstbrowser.properties";
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(path);
		prop.load(fs);
		
		String abrowser=prop.getProperty("browser");
		
		if(abrowser.equalsIgnoreCase("firefox"))
		{
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\Desktop\\Setup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		
		
		String baseURL= prop.getProperty("url");
		driver.get(baseURL);
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("adactin123");
		driver.findElement(By.id("password")).sendKeys("adactin123");
		driver.findElement(By.xpath(".//*[@id='login']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String sExpetedTitle= "AdactIn.com - Search Hotel" ;
		String sAtualTitle = driver.getTitle();
		System.out.println("vvvvalue " + sAtualTitle);
		if(sExpetedTitle.contentEquals(sAtualTitle))
		{
			System.out.println("Home page is loaded");
			
		}
		else
		{
			System.out.println("not loaded");
		}
		

	
		//driver.close();
		
	}
	
}
	
	
	