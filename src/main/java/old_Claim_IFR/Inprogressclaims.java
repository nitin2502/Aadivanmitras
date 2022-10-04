package old_Claim_IFR;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import old_Claim_IFR.Thanedlc;

public class Inprogressclaims extends Thanedlc
{
	 @Test()
	  public void Inprogress() throws Exception
	  
	     
	  {
		  
	  Thread.sleep(3000);
	  // click on old ifr regi
    driver().findElement(By.xpath("//*[@id=\"heading2\"]/button/div/div[2]")).click();
    Thread.sleep(1000);
    driver().findElement(By.xpath("//*[@id=\"collapse2\"]/div/ul/li[1]/a")).click();
    Thread.sleep(1000);  
	    
	   // claim details
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[2]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	    Thread.sleep(1000); 
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
	    Thread.sleep(1000);
	   //select request
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[3]/div/ngx-select/div/div[2]/div")).click();
	    Thread.sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[1]/a/span")).click();
	    Thread.sleep(1000);
	  //select claim no
	    driver().findElement(By.xpath("//input[@placeholder='दावा क्रमांक']")).sendKeys("27/2022");
	    Thread.sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[4]/div/div/button")).click();
	    Thread.sleep(3000);
	    driver().findElement(By.xpath("//input[@placeholder='Claim Date']")).sendKeys("04/07/2010");  
	    Thread .sleep(1000); 
	    
	   /* 
	   //claim present level
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[6]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	    Thread.sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
	    Thread.sleep(1000);
	   
	    */
	    //radio selection
	    driver().findElement(By.id("roCWH1")).click();
	    Thread.sleep(1000);
	    driver().findElement(By.id("roNCNP1")).click();
	    Thread.sleep(1000);
	    driver().findElement(By.id("roPESA1")).click();
	    Thread.sleep(1000);
	    //area details
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[4]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	    Thread.sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
	    Thread.sleep(1000);
	    //selct taluka
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[5]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	    Thread.sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
	    Thread.sleep(1000);
	   //select town /village
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[6]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	    Thread.sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
	    Thread.sleep(1000);
	   //select panchayat
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[7]/ngx-select/div/div[2]/div")).click();
	    Thread.sleep(1000); 
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[7]/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
	    Thread.sleep(1000);
	    //pada
	    driver().findElement(By.xpath("//input[@placeholder='पाडा नाव प्रविष्ट करा']")).sendKeys("vasepur");  
	    Thread .sleep(1000); 
	    // enter aDDRESS
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[9]/div/div/textarea")).sendKeys("Swarget , pune. pin-413209   rejected due to ducument 75(a), 75(B ) not updated ");  
	    Thread .sleep(1000); 
	    // basic details                                       
	    //Claimant name
	    driver().findElement(By.xpath("//input[@placeholder='दावेदाराचे नाव (इंग्रजी)']")).sendKeys("dhondiba");  
	    Thread .sleep(1000); 
	    //Claimant name(marathi)
	    driver().findElement(By.xpath("//input[@placeholder=' दावेदाराचे नाव (मराठी)']")).sendKeys("सौमनाज");
	    Thread .sleep(1000); 
	    
	    //father name
	    Thread .sleep(1000); 
	    driver().findElement(By.xpath("//input[@placeholder='वडीलांचे नावं']")).sendKeys("shankara");
	    Thread .sleep(1000); 
	 //selectgender
	    driver().findElement(By.id("gender1")).click();  
	    Thread .sleep(1000); 
	  //dateof birth    
	    driver().findElement(By.xpath("//input[@placeholder='जन्मतारीख']")).sendKeys("12-05-2008");  
	    Thread .sleep(2000);  
	   //mob no
	    driver().findElement(By.id("mobile_id")).sendKeys("9638521590");  
	    Thread .sleep(1000); 
	    //email
	    driver().findElement(By.xpath("//input[@placeholder='ईमेल']")).sendKeys("xyzd123@gmail.com");  
	    Thread .sleep(1000); 
	    //Aadhar no
	    driver().findElement(By.xpath("//input[@placeholder='आधार क्र']")).sendKeys("963852741158");  
	    Thread .sleep(1000); 
	  //claimant category
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[9]/div/ngx-select/div/div[2]/div/span[1]/span")).click();  
	    Thread .sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[9]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();  
	    Thread .sleep(1000);
	  //claimant caste
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[10]/div/ngx-select/div/div[2]/div/span[1]/span")).click();  
	    Thread .sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[10]/div/ngx-select/div/ngx-select-choices/ul/li[6]/a/span")).click();  
	    Thread .sleep(1000);
	    
	 //martial status
	    //unmarried
	    driver().findElement(By.id("maritalstatus2")).click();  
	    Thread .sleep(1000);
	    //click on married
	    driver().findElement(By.id("maritalstatus1")).click();  
	    Thread .sleep(1000);
	   //spouse name 
	    driver().findElement(By.xpath("//input[@placeholder='जोडीदाराचे नाव']")).sendKeys("Zansi");  
	    Thread .sleep(1000);
	    
	    //spousecategory
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[13]/div/ngx-select/div/div[2]/div")).click();  
	    Thread .sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[13]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();  
	    Thread .sleep(1000);
	    //spouse  caste
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[14]/div/ngx-select/div/div[2]/div/span[1]/span")).click();  
	    Thread .sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[14]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();  
	     Thread .sleep(1000);
	 //dependant family member
	     driver().findElement(By.xpath("//input[@placeholder='नाव प्रविष्ट करा']")).sendKeys("Ramrao");  
	     Thread .sleep(1000); 
	     //selectgender
	     driver().findElement(By.id("genderFamily1")).click();  
	     Thread .sleep(1000); 
	     //enterage
	     driver().findElement(By.xpath("//input[@placeholder='वय प्रविष्ट करा']")).sendKeys("18");  
	     Thread .sleep(1000);  
	     //relationclimant
	     driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/div[2]/div/span[1]/span")).click();  
	     Thread .sleep(1000);
	     driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();  
	      Thread .sleep(1000);  
	      //add
	        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[5]/button")).click();  
	        Thread .sleep(1000);
	        
	  
	       //dependant family member3
	       driver().findElement(By.xpath("//input[@placeholder='नाव प्रविष्ट करा']")).sendKeys("seeta");  
	       Thread .sleep(1000); 
	       //selectgender
	       driver().findElement(By.id("genderFamily2")).click();  
	       Thread .sleep(1000); 
	       //enterage
	       driver().findElement(By.xpath("//input[@placeholder='वय प्रविष्ट करा']")).sendKeys("55");  
	       Thread .sleep(1000);  
	    
	       //relationclimant
		     driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/div[2]/div/span[1]/span")).click();  
		     Thread .sleep(1000);
		     driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();  
		      Thread .sleep(1000);    
	       
	    //add
	        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[5]/button")).click();  
	        Thread .sleep(1000);
	        
	        //Encroachment Details
	        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[5]/div[1]/div[1]/div/div[2]/div/ngx-select/div/div[2]/div/span[1]/span")).click();  
	        Thread .sleep(1000);
	        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[5]/div[1]/div[1]/div/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();  
	         Thread .sleep(1000);
	                          
	  //compartment no
	      driver().findElement(By.xpath("//input[@placeholder=' कंपार्टमेंट क्र']")).sendKeys("123/abd");  
	      Thread .sleep(1000);
	      
	      //survey no / gat no 
	      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[5]/div[2]/div/div/div[2]/div/input")).sendKeys("123/A,125/b");  
	      Thread .sleep(1000);  
	      
	      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[6]/div/div/div[2]/div/input")).sendKeys("0.0001");  
	      Thread .sleep(2000);
	      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[7]/div/div/div[2]/div/div/input")).sendKeys("3");  
	      Thread .sleep(1000);
	      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[8]/div/div/div[2]/div/div/input")).sendKeys("2");  
	      Thread .sleep(1000);
	      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[9]/div/div/div[2]/div/div/input")).sendKeys("1.0");  
	      Thread .sleep(1000);
	      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[10]/div/div/div[2]/div/div/input")).sendKeys("4.0");  
	      Thread .sleep(1000);
	      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[11]/div/div/div[2]/div/div/input")).sendKeys("3.2");  
	      Thread .sleep(1000);
	      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[12]/div/div/div[2]/div/div/input")).sendKeys("3.3");  
	      Thread .sleep(2000);
	   
	      
	      
	      //Boundary of Claimed Space
	        driver().findElement(By.xpath("//input[@formcontrolname='to_the_East']")).sendKeys("Mandir");  
	        Thread .sleep(1000); 
	        driver().findElement(By.xpath("//input[@formcontrolname='to_the_West']")).sendKeys("school");  
	        Thread .sleep(1000); 
	        driver().findElement(By.xpath("//input[@formcontrolname='to_the_North']")).sendKeys("playground");  
	        Thread .sleep(1000); 
	        driver().findElement(By.xpath("//input[@formcontrolname='to_tuhe_South']")).sendKeys("River");  
	        Thread .sleep(1000);   
	      //remark
	      driver().findElement(By.xpath("//textarea[@placeholder='शेरा']")).sendKeys("Your claim id not considersed because u are not submitted Claim within year limit (2000-2025)");  
	      Thread .sleep(1000);
	      
	      // create case
	      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[15]/div/button")).click();  
	      Thread .sleep(1000);
	      driver().findElement(By.xpath("//*[@id=\"ConfirmModal\"]/div/div/div[2]/button[2]")).click();  
	      Thread .sleep(000);
	      driver().findElement(By.xpath(" //*[@id=\"ConfirmDocumentModal\"]/div/div/div[2]/button[1]")).click();  
	      Thread .sleep(1000);
	      driver().findElement(By.xpath(" //button[@type='reset'][1]")).click();  
	      Thread .sleep(1000);
	       driver().close();
	  }
	
}
