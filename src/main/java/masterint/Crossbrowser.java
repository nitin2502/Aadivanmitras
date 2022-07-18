package masterint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Crossbrowser 
{
	//protected static ThreadLocal<EdgeDriver> driver=new ThreadLocal<>();
	//protected static ThreadLocal<FirefoxDriver> driver=new ThreadLocal<>();
	 protected static ThreadLocal<ChromeDriver> driver=new ThreadLocal<>();
	 @BeforeMethod
	 public void setup() throws Exception
	 { 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\chromedriver.exe");
	    driver.set(new ChromeDriver());
		 // System.setProperty("webdriver.gecko.driver","C:\\Users\\niting\\Downloads\\geckodriver-v0.31.0-win64\\Geckodriver1\\geckodriver.exe");
		  // driver.set(new FirefoxDriver());
		   driver().manage().window().maximize();
		   driver().get("http://trti.mahamining.com/login");
			driver().findElement(By.xpath("//*[@id=\"home_login\"]")).click();
			Thread .sleep(3000);	
			//admin login
			driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
		   Thread .sleep(1000);
			driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
		    Thread .sleep(1000);	
			driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[4]/button")).click();
			Thread .sleep(4000);
		 
		   
		  // System.setProperty("webdriver.edge.driver","C:\\Users\\niting\\Downloads\\edgedriver_win64\\edgedrvr\\msedgedriver.exe\\");
		  // driver.set(new EdgeDriver());
	
	 }
	 public WebDriver driver()
	 {
		 return driver.get();
	 }
	   @AfterMethod
	     public void teardown() 
	     {  
	    	 driver().quit();
	     }
	 
	     }
		
	
	

