package hello;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Findelebycss {

	public static void main(String[] ars) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pavan\\Desktop\\Setup\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseURL = "http://adactin.com/HotelApp/";
		driver.get(baseURL);
		WebElement User = driver.findElement(By.cssSelector("input[id=username]"));
		User.sendKeys("adactin123");
		WebElement Pass = driver.findElement(By.cssSelector("input[id=password]"));
		Pass.sendKeys("adactin123");
		WebElement Logbutton = driver.findElement(By.cssSelector("input[id=login]"));
		Logbutton.click();
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
		
		WebElement aSubmit = driver.findElement(By.name("submit"));
		aSubmit.click();
		
		
		
		
			
		
		
		
		
	
		
		
	}

}
