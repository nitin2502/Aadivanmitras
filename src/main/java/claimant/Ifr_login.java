package claimant;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Ifr_login 
{
	//protected static ThreadLocal<EdgeDriver> driver=new ThreadLocal<>();
	//protected static ThreadLocal<FirefoxDriver> driver=new ThreadLocal<>();
	 protected static ThreadLocal<ChromeDriver> driver=new ThreadLocal<>();
	 @BeforeMethod
	 public void setup() throws Exception
	 { 
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\chromedriver.exe");
	   driver.set(new ChromeDriver());
	 
	 
	 /*System.setProperty("webdriver.gecko.driver","C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\geckodriver.exe");
	   driver.set(new FirefoxDriver());
	   */

		 // System.setProperty("webdriver.edge.driver","C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\msedgedriver.exe");
		 // driver.set(new EdgeDriver());
	 
	    //open Browser
		driver().manage().window().maximize();
	    driver().get("http://trti.mahamining.com/home");
		Thread .sleep(1000);
		driver().findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("NITI1591");
		Thread .sleep(1000);
		driver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("627FAC4");
		Thread .sleep(1000);	
		driver().findElement(By.id("home_claimant_login")).click();
		Thread .sleep(1000);	
		
		  // System.setProperty("webdriver.edge.driver","C:\\Users\\niting\\Downloads\\edgedriver_win64\\edgedrvr\\msedgedriver.exe\\");
		  // driver.set(new EdgeDriver());
	
	 }
	        public WebDriver driver()
	 {
		 return driver.get();
	 }
	   //  @AfterMethod
	     public void teardown() 

	     {  
	    	 driver().quit();
	     }
	 
	     }
		
	
	





