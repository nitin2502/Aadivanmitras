package cms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class Chromedriverbase {
	//protected static ThreadLocal<EdgeDriver> driver=new ThreadLocal<>();
	//protected static ThreadLocal<FirefoxDriver> driver=new ThreadLocal<>();
	 protected static ThreadLocal<ChromeDriver> driver=new ThreadLocal<>();
	 @BeforeMethod
	 public void setup() throws Exception
	 { System.out.println("Browser Name Is:EdgeDriver");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\Downloads\\chromedriver_win32 (1)\\crom_drvr-2\\chromedriver.exe\\");
	    driver.set(new ChromeDriver());
		 // System.setProperty("webdriver.gecko.driver","C:\\Users\\niting\\eclipse-workspace\\Mavenutility\\src\\main\\resources\\drivers\\geckodriver\\geckodriver.exe");
		  // driver.set(new FirefoxDriver());
		  // System.setProperty("webdriver.edge.driver","C:\\Users\\niting\\Downloads\\edgedriver_win64\\edgedrvr\\msedgedriver.exe\\");
		  // driver.set(new EdgeDriver());
	
	 }
	 public WebDriver driver()
	 {
		 return driver.get();
	 }
//	     @AfterMethod
//	     public void teardown() 
//	     {  
//	    	 driver().quit();
//	     }
	 
	     }
	
