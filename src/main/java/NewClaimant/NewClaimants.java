package NewClaimant;

import java.util.List;

import javax.swing.JOptionPane;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class NewClaimants  
{
	
	WebDriver d;
	
	 @Test
	  public void Managedriver()
	  
	 {   
		 System.out.println("starting Sucessfully");
		 
		 // setting the chromedriver 
		
		WebDriverManager.chromedriver().setup();
		  
		 d= new ChromeDriver();
		 String url="https://aadivanmitra.org/c-registration";
		// String url ="http://trti.mahamining.com/c-registration";
		 d.get(url);
	     List<WebElement> elements = d.findElements(By.xpath("//*[@id=\"conditionsMdoalId\"]/div/div/form/div[1]/div[2]/div[2]/div/ngx-select/div/input"));
	        System.out.println("Number of elements:" +elements);
		 d.manage().window().maximize();
		
		 // Examine Actual v/s Expected title
		 String ExpectedTitle ="AadiVanMitra"; 
		 String actualtitle   = d.getTitle();
		 Assert.assertEquals(actualtitle, ExpectedTitle);
		 System.out.println(actualtitle);
		 if (actualtitle.contentEquals(ExpectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	
		String n=d.getCurrentUrl();
		System.out.println(n);
		String k =d.toString();
		System.out.println(k); 
	 int noofurl = d.findElements(By.tagName("a")).size();
	 System.out.println("Number of links on Web Page :" + noofurl);
		  
	 }
	    @Test(priority=1)
	    public void Castselect() throws Exception
	    
	    {  //select Tribe
	    	d.findElement(By.xpath("//ngx-select[@formcontrolname='AreYouFromScheduledTribe']")).click();
	        Thread.sleep(1000);
	   
	        d.findElement(By.xpath("//*[@id=\"conditionsMdoalId\"]/div/div/form/div[1]/div[2]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
	        Thread.sleep(1000);
	   
	        d.findElement(By.xpath("//*[@id=\"conditionsMdoalId\"]/div/div/form/div[2]/div/div/button")).click();
	        Thread.sleep(1000);
	    
	        
	       
	   		
	    }@Test(priority=2)
	      public void claimantregistraton() throws Exception
	      {  //Enter Claimant details
	    	
	    	d.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("ramesh jka");
	        Thread.sleep(1000);
	        d.findElement(By.xpath("//input[@value='Male']")).click();
	        Thread.sleep(1000);
	        d.findElement(By.xpath("//input[@formcontrolname='mobileNo']")).sendKeys("9730020955");
	        Thread.sleep(1000);
	        d.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/div[2]/div/div[2]/form/div/div[4]/button[2]")).click();
	        Thread.sleep(1000);
	      
	      }@Test(priority=3)
	      public  void EnterOtp() throws Exception
	      {
	    	  String s=JOptionPane.showInputDialog("Enter OTP"); 
	    	 	d.findElement(By.xpath("//input[@formcontrolname='otp']")).sendKeys(s);
	    	     Thread .sleep(1000);
	    	     d.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/div[2]/div/div[2]/form/div/div[2]/button[2]")).click();
	 	        Thread.sleep(2000);  
	 	       d.findElement(By.xpath("//*[@id=\"OTPSentModalId\"]/div/div/div/div/button")).click();
		        Thread.sleep(4000); 
	      }
	    
	       @AfterTest
	        public void closingBrwser()
	        {
	        	System.out.println("Closed Sucessfully");
	        	
	        	d.close();
	        }
	    
	 	

}
