package NewClaimant;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CFRregister 

{
	WebDriver d;
	
    @Test(priority=1)
    public void Driversetup()
    {
    	WebDriverManager.chromedriver().setup();
    	d=new ChromeDriver();
//    	String url ="http://trti.mahamining.com/login";
    	String url ="https://aadivanmitra.org/login";
    	d.get(url);
    	d.manage().window().maximize();
    	System.out.println("Test  running in Chrome");
    	
    }
    @Test(priority=2)
    public void loginvfrc() throws Exception
  {
    	
//    	d.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("112test");
    	d.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("Nit4141");
//		d.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("2test@8888");
    	d.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("t4141@0209");	
	    
    	String s=JOptionPane.showInputDialog("कॅप्चा प्रविष्ट करा");
	    
		d.findElement(By.xpath("//input[@placeholder='कॅप्चा प्रविष्ट करा']")).sendKeys(s);
	  
		d.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
		System.out.println("User Logged sucessfully ");
    	
    } 
    @Test(priority=3)
    public void ClaimDetails() throws Exception
  
    {   Thread.sleep(1000);
    	d.findElement(By.xpath("//*[@id=\"heading2\"]/button/div/div[2]")).click();
    	Thread.sleep(1000);
    	d.findElement(By.xpath("//*[@id=\"collapse2\"]/div/ul/li[1]/a")).click();
    	Thread.sleep(1000);
    	d.findElement(By.name("roCWH")).click();
    	Thread.sleep(1000);
    	d.findElement(By.xpath("//*[@id=\"content\"]/app-cfr-register/div[1]/div/div/div/div/div/div/form/div/div[1]/div[2]/div/div/div[2]/input")).click();
    	Thread.sleep(1000);
    	d.findElement(By.name("roNCNP")).click();
    	Thread.sleep(1000);
    	d.findElement(By.name("roPESA")).click();
    	System.out.println("User Filled claim Details sucessfully ");
    }
    @Test(priority=4)
    public void Areadetails() throws Exception
    {  Thread.sleep(1000); 
       //select Revenue /village
        d.findElement(By.xpath("//ngx-select[@formcontrolname='villageId']")).click();
        Thread.sleep(2000); 
        d.findElement(By.xpath("//*[@id=\"content\"]/app-cfr-register/div[1]/div/div/div/div/div/div/form/div/div[2]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[12]/a/span")).click();
        Thread.sleep(1000);
       //select panchayat
        d.findElement(By.xpath("//ngx-select[@formcontrolname='grampanchayatId']")).click();
        Thread.sleep(1000); 
        d.findElement(By.xpath("//*[@id=\"content\"]/app-cfr-register/div[1]/div/div/div/div/div/div/form/div/div[2]/div[7]/ngx-select/div/ngx-select-choices/ul/li[7]/a/span")).click();
        Thread.sleep(1000);
        //pada
        d.findElement(By.xpath("//input[@formcontrolname='padaName']")).sendKeys("pada list");  
        Thread .sleep(1000); 
        // Enter aDDRESS
        d.findElement(By.xpath("//textarea[@maxlength='200']")).sendKeys("Swarget , pune. pin-413209   rejected due to ducument 75(a), 75(B ) not updated ");  
        Thread .sleep(1000); 
        System.out.println("Area details filled sucessfully ");
    }
     @Test(priority=5)
         public void BasicDetails() throws Exception
         {
    	   Thread .sleep(1000);
    	   d.findElement(By.id("claimantNameEng")).sendKeys("SouthWest CFR");
           Thread.sleep(1000); 
           d.findElement(By.xpath("//ngx-select[@formcontrolname='eligibilityCriteria'][1]")).click();
           Thread.sleep(1000);
           d.findElement(By.xpath("//*[@id=\"content\"]/app-cfr-register/div[1]/div/div/div/div/div/div/form/div/div[3]/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[1]/a/span")).click();
           Thread.sleep(1000);
           d.findElement(By.xpath("//input[@formcontrolname='compartmentNo']")).sendKeys("123/abd");  
	        Thread .sleep(1000);
	        //survey no 
	        d.findElement(By.xpath("//input[@formcontrolname='surveyNo_GatNo']")).sendKeys("123/A,125/b");  
	        Thread .sleep(1000);      
	        d.findElement(By.xpath("//input[@formcontrolname='claimantsArea']")).sendKeys("1.5");  
	        Thread .sleep(1000); 
	        //Boundary of Claimed Space
	        d.findElement(By.xpath("//input[@formcontrolname='to_The_East']")).sendKeys("Mandir");  
	        Thread .sleep(1000); 
	        d.findElement(By.xpath("//input[@formcontrolname='to_The_West']")).sendKeys("school");  
	        Thread .sleep(1000); 
	        d.findElement(By.xpath("//input[@formcontrolname='to_The_North']")).sendKeys("playground");  
	        Thread .sleep(1000); 
	        d.findElement(By.xpath("//input[@formcontrolname='to_The_South']")).sendKeys("River");  
	        Thread .sleep(1000);   
	        System.out.println("Basic details filled sucessfully ");
         }
        
        @Test(priority=6)
        public void OtherDetails() throws Exception
        {
        	 d.findElement(By.xpath("//input[@formcontrolname='surveyCompleted']")).click();
 	        Thread .sleep(1000); 
 	         d.findElement(By.xpath("//input[@formcontrolname='managementPlanCreated']")).click();
 	         Thread .sleep(1000); 
 	         d.findElement(By.xpath("//textarea[@formcontrolname='remark']")).sendKeys("Processing due to inavalibility of document");
 	         Thread .sleep(1000); 
 	        System.out.println("Other details filled sucessfully ");
        }
    
        @Test(priority=7)
        public void CreateCase() throws Exception
        {
        	 d.findElement(By.xpath("//*[@id=\"content\"]/app-cfr-register/div[1]/div/div/div/div/div/div/form/div/div[9]/div/button[2]")).click();  
 	        Thread .sleep(1000); 
 	       d.findElement(By.xpath("//*[@id=\"ConfirmModal\"]/div/div/div[2]/button[2]")).click();  
	        Thread .sleep(1000);
 	   
 	        d.findElement(By.xpath(" //*[@id=\"ConfirmDocumentModal\"]/div/div/div[2]/button[1]")).click();  
 	        Thread .sleep(5000);
 	       System.out.println("Case Created sucessfully ");
        } 
     
      //   @AfterTest
        public void closingBrwser()
        {
        	System.out.println("Closed Window Sucessfully");
        	d.close();
        }
}
