package hello;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsser {
		
		static WebDriver driver;
		
		public static void main(String[] args) throws IOException {
			
			String path ="C:\\Users\\pavan\\eclipse-workspace\\hello\\browserproperties";
			Properties prop = new Properties();
			FileInputStream fs = new FileInputStream(path);
			prop.load(fs);
			
			String abrowser = prop.getProperty("browser");
			System.out.println("browser value ---"+abrowser);
			if(abrowser.equalsIgnoreCase("firefox"))
			{
					
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pavan\\Desktop\\Setup\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			}
			
			
			String baseURL= prop.getProperty("url");
			driver.get(baseURL);
			
			System.out.println("baseurl");
	}
	}

	
	
	
	
	


