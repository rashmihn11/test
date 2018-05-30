package hello;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class firstjunit {
	static WebDriver driver;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pavan\\Desktop\\Setup\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL = "http://adactin.com/HotelApp/";
		driver.get(baseURL);
		
	}

	

	@Before
	public void setUp() throws Exception {
	
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
	}

	
	@After
	public void tearDown() throws Exception {
		
		WebElement User = driver.findElement(By.cssSelector("input[id=username]"));
		User.sendKeys("adactin123");
		WebElement Pass = driver.findElement(By.cssSelector("input[id=password]"));
		Pass.sendKeys("adactin123");
		WebElement Logbutton = driver.findElement(By.cssSelector("input[id=login]"));
		Logbutton.click();	
		
		
		Select drpLocation = new Select(driver.findElement(By.name("location")));
		drpLocation.selectByVisibleText("Sydney");
		drpLocation.selectByIndex(2);
		
		 
		//hotel
		Select drpHotel = new Select(driver.findElement(By.name("hotels")));
		drpHotel.selectByValue("Hotel Creek");
		drpHotel.selectByIndex(2);
		drpHotel.selectByVisibleText("Hotel Hervey");
		
		//room type
		Select drpRoom = new Select(driver.findElement(By.name("room_type")));
		drpRoom.selectByIndex(2);
			
		//Number of rooms
		Select drpNoroom =  new Select(driver.findElement(By.name("room_nos")));
		drpNoroom.selectByValue("3");
		
		WebElement sDate = driver.findElement(By.name("datepick_in"));
		sDate.clear();
		sDate.sendKeys("22/04/2018");
		//sDate.clear();
		//sDate.sendKeys("24042018");
		
		WebElement sDateout = driver.findElement(By.id("datepick_out"));
		sDateout.clear();
		sDateout.sendKeys("28/04/2018");
		
		
		Select adultRoom = new Select(driver.findElement(By.name("adult_room")));
		adultRoom.selectByIndex(3);
		
		Select childRoom = new Select(driver.findElement(By.name("child_room")));
		childRoom.selectByValue("2");
				
	}

	@Test
	public void test() {
		
		WebElement aSubmit = driver.findElement(By.name("submit"));
		aSubmit.click();	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
		
		
	}
}
