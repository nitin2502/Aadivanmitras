package old_Claim_CFR;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ThanedlcL 
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
	   
	    driver().manage().window().maximize();
		driver().navigate().to("http://aadivanmitra.org/login");
		 Thread.sleep(1000);
		
	//Thane DLC login
	
		
		driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("DLCSatara");		  
	
		
		Thread .sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("t444@8436");
	  Thread .sleep(1000);	
	  String s=JOptionPane.showInputDialog(" Please Enter Captcha");
	    
	  	driver().findElement(By.xpath("//input[@placeholder='कॅप्चा प्रविष्ट करा']")).sendKeys(s);
	      Thread .sleep(1000);
	    
	  	driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
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
		
	
	





