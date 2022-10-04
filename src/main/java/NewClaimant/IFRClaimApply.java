package NewClaimant;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFRClaimApply 
{
	
	WebDriver d;
	   @BeforeTest
	  public void Managedriver()
	  
	  
	   
	 {   
		 System.out.println("starting Sucessfully");
		 
	 // setting the chromedriver 
		
		WebDriverManager.chromedriver().setup();
		 d= new ChromeDriver();
		 String url="https://aadivanmitra.org/home";
		// String url="http://trti.mahamining.com/home";
		 d.get(url);
		 d.manage().window().maximize();
		 // Examine Actual v/s Expected title
		 String ExpectedTitle ="AadiVanMitra";
		 String actualtitle   = d.getTitle();
		 Assert.assertEquals(actualtitle, ExpectedTitle);
		  
	 }
	    @Test(priority=1)
	    public void ClaimantLogin () throws Exception
	    
	    {  //Login details
	    	d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/app-web-header/div[1]/div[2]/div/div/nav/div/div/ul/li[8]/a")).click();
	    	Thread.sleep(1000);
	    	d.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/app-web-header/div[1]/div[2]/div/div/nav/div/div/ul/li[8]/ul/li[1]/a")).click();
	    	Thread.sleep(1000);
	    	d.findElement(By.xpath("//input[@formcontrolname='username'][1]")).sendKeys("RAME81724");
	    	Thread.sleep(1000);
	    	d.findElement(By.xpath("//input[@formcontrolname='password'][1]")).sendKeys("FD1BE13F");
	    	Thread.sleep(1000);
	    	String s=JOptionPane.showInputDialog("Enter Captcha"); 
	    	d.findElement(By.xpath("//input[@formcontrolname='recaptchaReactive'][1]")).sendKeys(s);
	    	Thread .sleep(1000);
	    	d.findElement(By.xpath("//*[@id=\"ClaimantLogin\"]/div/div/div[2]/form/div/div[5]/button")).click();
	    	Thread.sleep(3000);
    	     
	    }@Test(priority=2)
	    public void ApplyNewClaim() throws Exception
	      {  //Enter Claimant details

	    	d.findElement(By.xpath("//a[@routerlink='../ifrRegister'][1]")).click();
	    	Thread .sleep(1000);	

	    	//claim details
	    	d.findElement(By.xpath("//input[@formcontrolname='aadharNo']")).sendKeys("596271010532");
	    	Thread .sleep(1000);	
	    	d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[1]/div/div/button")).click();
	    	Thread .sleep(1000);	

	    	//Basic details
	    	//Claimant name(English)
	    	d.findElement(By.xpath("//input[@formcontrolname='claimantName']")).sendKeys("Somnath");
	    	Thread .sleep(1000); 
	    	//Claimant name(English)
	    	d.findElement(By.xpath("//input[@formcontrolname='claimantNameMarathi']")).sendKeys("दावेदा");
	    	Thread .sleep(1000); 
	    	//father name
	    	d.findElement(By.xpath("//input[@formcontrolname='fatherName']")).sendKeys("Rrrr");
	    	Thread .sleep(1000);
	    	//Enter Mob no
	    	d.findElement(By.xpath("//input[@formcontrolname='mobileNo']")).sendKeys("9730020955");  
	    	Thread .sleep(1000); 

	    	//email
	    	d.findElement(By.xpath("//input[@formcontrolname='email'][1]")).sendKeys("xyzd123@gmail.com");  
	    	Thread .sleep(1000); 

	    	//claimant category
	    	d.findElement(By.xpath("//ngx-select[@formcontrolname='claimantCategory']")).click();  
	    	Thread .sleep(1000);
	    	d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[2]/div[8]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();  
	    	Thread .sleep(1000);
	    	//claimant caste
	    	d.findElement(By.xpath("//ngx-select[@formcontrolname='claimantCaste']")).click();  
	    	Thread .sleep(1000);
	    	d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[2]/div[9]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();  
	    	Thread .sleep(1000);

	    	//martial status
	    	//unmarried
	    	d.findElement(By.id("maritalstatus2")).click();  
	    	Thread .sleep(1000);
	    	//click on married
	    	d.findElement(By.id("maritalstatus1")).click();  
	    	Thread .sleep(1000);
	    	//spouse name 
	    	d.findElement(By.xpath("//input[@formcontrolname='spouseName']")).sendKeys("Zansi");  
	    	Thread .sleep(2000);

	    	//spousecategory
	    	d.findElement(By.xpath("//ngx-select[@formcontrolname='spouseCategory']")).click();  
	    	Thread .sleep(1000);
	       d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[2]/div[12]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();  
	        Thread .sleep(1000);
	      //spouse  caste
	       d.findElement(By.xpath("//ngx-select[@formcontrolname='spouseCaste']")).click();  
	        Thread .sleep(1000);
	       d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[2]/div[13]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();  
	         Thread .sleep(1000);
	       /*
	         
	         //dependant family member3
	         d.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("seeta");  
	         Thread .sleep(2000); 
	         //selectgender
	         d.findElement(By.id("genderFamily2")).click();  
	         Thread .sleep(2000); 
	         //enterage
	         d.findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys("55");  
	         Thread .sleep(2000);  
	      //relationclimant
	         d.findElement(By.xpath("//ngx-select[@placeholder='Select Relationship']")).click();  
	         Thread .sleep(1000);
	         d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();  
	          Thread .sleep(1000);  
	      //add
	          d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[5]/button")).click();  
	          Thread .sleep(1000);
	         */
	    	
	    	//radio selection
	        d.findElement(By.name("roCWH")).click();
	        Thread.sleep(1000);
	        d.findElement(By.name("roNCNP")).click();
	        Thread.sleep(1000);
	        d.findElement(By.name("roPESA")).click();
	        Thread.sleep(1000);	
	        
	        //area details
	        d.findElement(By.xpath("//ngx-select[@formcontrolname='subDivisionId']")).click();
	        Thread.sleep(1000); 
	        d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[1]/a/span")).click();
	        Thread.sleep(1000);
	        
	        //selct taluka
	        d.findElement(By.xpath("//ngx-select[@formcontrolname='talukaId']")).click();
	        Thread.sleep(1000); 
	        d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
	        Thread.sleep(1000);
	        
	       //select Revenue /village
	        d.findElement(By.xpath("//ngx-select[@formcontrolname='villageId']")).click();
	        Thread.sleep(1000); 
	        d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
	        Thread.sleep(1000);
	       //select panchayat
	        d.findElement(By.xpath("//ngx-select[@formcontrolname='grampanchayatId']")).click();
	        Thread.sleep(1000); 
	        d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[7]/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
	        Thread.sleep(1000);
	        //pada
	        d.findElement(By.xpath("//input[@formcontrolname='pada_Name']")).sendKeys("pada list");  
	        Thread .sleep(1000); 
	        // enter aDDRESS
	        d.findElement(By.xpath("//textarea[@formcontrolname='address']")).sendKeys("Swarget , pune. pin-413209   rejected due to ducument 75(a), 75(B ) not updated ");  
	        Thread .sleep(1000); 
	 
	          
	    //Encroachment Details
	        d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[5]/div[1]/div[1]/div/div[2]/div/ngx-select/div/div[2]/div")).click();  
	        Thread .sleep(1000);
	        d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[5]/div[1]/div[1]/div/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();  
	         Thread .sleep(1000);
	                            
	    //compartment no
	        d.findElement(By.xpath("//input[@formcontrolname='compartmentNo']")).sendKeys("123/abd");  
	        Thread .sleep(1000);
	        
	        //survey no 
	        d.findElement(By.xpath("//input[@formcontrolname='surveyNo']")).sendKeys("123/A,125/b");  
	        Thread .sleep(1000);      
	         
	        //ToTAL AREA
	        d.findElement(By.xpath("//input[@formcontrolname='surveyArea']")).sendKeys("1.5");  
	        Thread .sleep(1000); 
	       
	        //CLAIMED AREA 
	        d.findElement(By.xpath("//input[@formcontrolname='claimantsArea']")).sendKeys("33");  
	        Thread .sleep(1000); 
	          
	        //Boundary of Claimed Space
	        d.findElement(By.xpath("//input[@formcontrolname='to_the_East']")).sendKeys("Mandir");  
	        Thread .sleep(1000); 
	        d.findElement(By.xpath("//input[@formcontrolname='to_the_West']")).sendKeys("school");  
	        Thread .sleep(1000); 
	        d.findElement(By.xpath("//input[@formcontrolname='to_the_North']")).sendKeys("playground");  
	        Thread .sleep(1000); 
	        d.findElement(By.xpath("//input[@formcontrolname='to_the_South']")).sendKeys("River");  
	        Thread .sleep(1000);   
	        
	        // Click on create case button
	        d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[9]/div/button[2]")).click();  
	        Thread .sleep(1000); 
	    
	        d.findElement(By.xpath("//*[@id=\"ConfirmModal\"]/div/div/div[2]/button[2]")).click();  
	        Thread .sleep(1000);
	        d.findElement(By.xpath(" //*[@id=\"ConfirmDocumentModal\"]/div/div/div[2]/button[1]")).click();  
	        Thread .sleep(5000);
	    	
	        }
	     //  @AfterTest
	        public void closingBrwser()
	        {
	        	System.out.println("Closed Sucessfully");
	        	
	        	d.close();
	        }
	    
	 	

}
