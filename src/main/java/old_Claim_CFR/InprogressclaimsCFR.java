package old_Claim_CFR;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import old_Claim_IFR.Thanedlc;

public class InprogressclaimsCFR extends Thanedlc
{
	 @Test()
	  public void Inprogress() throws Exception
	  
	     
	  { 
		 
		 Thread.sleep(4000);
			// click on English  language 
			  driver().findElement(By.xpath("//*[@id=\"languagebox\"]/div/label[2]")).click();
			    Thread.sleep(1000); 
			    
		  // click on old cfr regi
	    driver().findElement(By.xpath("//*[@id=\"heading2\"]/button/div/div[2]")).click();
	    Thread.sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"collapse2\"]/div/ul/li[1]/a")).click();
	    Thread.sleep(1000);  
	  
	    
	    
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[2]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	    Thread.sleep(1000); 
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
	    Thread.sleep(1000);
	   //select request
	    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Type']")).click();
	    Thread.sleep(1000); 
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
	    Thread.sleep(1000);
	  //select claim no
	    driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("17000/R");
	    Thread.sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[4]/div/div/button")).click();
	    Thread.sleep(3000);
	    
	    //claim date
	    driver().findElement(By.xpath("//input[@placeholder='Claim Date']")).sendKeys("12/05/2017");  
	    Thread .sleep(1000);
	 
	    /*
	    //claim present level
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[6]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	    Thread.sleep(2000);
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
	    Thread.sleep(3000);
	    */
	
	    
	    //radio seleaction
	    driver().findElement(By.name("roCWH")).click();
	    Thread.sleep(1000);
	    driver().findElement(By.name("roPVTG")).click();
	    Thread.sleep(1000);
	    //select tribe
	    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Tribe']")).click();
	    Thread.sleep(1000); 
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[9]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
	    Thread.sleep(1000);
	    driver().findElement(By.name("roNCNP")).click();
	    Thread.sleep(1000);
	    driver().findElement(By.name("roPESA")).click();
	    Thread.sleep(1000);
	   
	    //area details
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[2]/div[4]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	    Thread.sleep(1000); 
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[2]/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a")).click();
	    Thread.sleep(1000);
	    //selct taluka
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[2]/div[5]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	    Thread.sleep(1000); 
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[2]/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
	    Thread.sleep(1000);
	   //select Revenue /village
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[2]/div[6]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	    Thread.sleep(1000); 
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[2]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
	    Thread.sleep(1000);
	   //select panchayat
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[2]/div[7]/ngx-select/div/div[2]/div/span[1]/span")).click();
	    Thread.sleep(1000); 
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[2]/div[7]/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
	    Thread.sleep(1000);
	    //pada
	    driver().findElement(By.xpath("//input[@placeholder='Pada']")).sendKeys("pada list");  
	    Thread .sleep(1000); 
	    // enter aDDRESS
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[2]/div[9]/div/div/textarea")).sendKeys("Swarget , pune. pin-413209   rejected due to ducument 75(a), 75(B ) not updated ");  
	    Thread .sleep(1000); 
	    
	    // basic details
	    //Claimant name                                       
	    driver().findElement(By.xpath("//input[@placeholder='Name of CFR Village']")).sendKeys(" TestCFRVILLAGE ");  
	    Thread .sleep(1000); 
	    
	  

	    //Select criteria
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[3]/div[3]/div/ngx-select/div/div[2]/div/span[1]/span")).click();  
	    Thread .sleep(1000); 
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[3]/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();  
	    Thread .sleep(1000); 
	 
	    //Encroachment Details
	  //compartment no
	      driver().findElement(By.xpath("//input[@placeholder='Compartment No ']")).sendKeys("5555");  
	      Thread .sleep(1000);
	      
	      //survey no / gat no 
	      driver().findElement(By.xpath("//input[@placeholder=' Survey No/Gat No']")).sendKeys("123/abd,552/dbd");  
	      Thread .sleep(1000);
	      
	      
	      
	      driver().findElement(By.xpath("//input[@maxlength='6']")).sendKeys("200");  
	      Thread .sleep(1000);
	     
	      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[6]/div/div/div[2]/div/div/input")).sendKeys("20.20");  
	      Thread .sleep(1000);
	 
	      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[7]/div/div/div[2]/div/div/input")).sendKeys("202.360");  
	      Thread .sleep(1000);
	     
	      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[8]/div/div/div[2]/div/div/input")).sendKeys("2222");  
	      Thread .sleep(000);
	      
	      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[9]/div/div/div[2]/div/div/input")).sendKeys("1");  
	      Thread .sleep(1000);
	    
	      
	   
	      //Boundary of Claimed Space
	      driver().findElement(By.xpath("//input[@placeholder='To The East']")).sendKeys("1m23");  
	      Thread .sleep(1000); 
	      driver().findElement(By.xpath("//input[@placeholder='To The West']")).sendKeys("as12dff");  
	      Thread .sleep(1000); 
	      driver().findElement(By.xpath("//input[@placeholder='To The North']")).sendKeys("123vg/-zx");  
	      Thread .sleep(1000); 
	      driver().findElement(By.xpath("//input[@placeholder='To The South']")).sendKeys("abc/*d123/-555");  
	      Thread .sleep(1000); 
	      
	      //remark
	      driver().findElement(By.xpath("//textarea[@placeholder='Remark']")).sendKeys("Your claim id not considered because u are not submitted Claim within year limit (2000-2025)");  
	      Thread .sleep(2000);
	      
	      // create case
	      // create case
	      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[13]/div/button[2]")).click();  
	      Thread .sleep(1000);
	      driver().findElement(By.xpath("//*[@id=\"ConfirmModal\"]/div/div/div[2]/button[2]")).click();  
	      Thread .sleep(1000);
	      driver().close();
	      
	  }
	
}
