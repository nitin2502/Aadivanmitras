package old_Claim_IFR;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Thanedlc
{
	//protected static ThreadLocal<EdgeDriver> driver=new ThreadLocal<>();
	//protected static ThreadLocal<FirefoxDriver> driver=new ThreadLocal<>();
	 protected static ThreadLocal<ChromeDriver> driver=new ThreadLocal<>();
	 @BeforeMethod
	 public void setup() throws Exception
	 { 
	
	WebDriverManager.chromedriver().setup();
	   driver.set(new ChromeDriver());
	 
	 
	  // WebDriverManager.firefoxdriver().setup();
	 //  driver.set(new FirefoxDriver());
	   

		//WebDriverManager.edgedriver().setup();
		 // driver.set(new EdgeDriver());
	   
	    driver().manage().window().maximize();
		driver().navigate().to("http://trti.mahamining.com/login");
		 Thread.sleep(1000);
		
	//Thane DLC login
	
		
		driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("ThaneDLC");		  
	
		
		Thread .sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("aneDLC@5959");
	  Thread .sleep(1000);	
	  String s=JOptionPane.showInputDialog(" Please Enter Captcha");
	    
	  	driver().findElement(By.xpath("//input[@placeholder='कॅप्चा प्रविष्ट करा']")).sendKeys(s);
	      Thread .sleep(1000);
	    
	  	driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
	  	Thread .sleep(1000);
	    
	  
	
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
		
	
	





