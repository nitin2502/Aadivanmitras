package Program_meeting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import old_Claim_IFR.Thanedlc;

public class Create_Program_meetings extends Thanedlc

{  
   @Test()
public void Program_meeting () throws Exception 

   
   {
	  	   
	  //click on PM 
	   driver().findElement(By.xpath(" //*[@id=\"heading3\"]/button/div/div[2]")).click();
	   Thread.sleep(2000);
	 
	   // Click on create MB
	   driver().findElement(By.xpath("//*[@id=\"collapse3\"]/div/ul/li[1]/a")).click();
	   Thread.sleep(2000);

	   driver().findElement(By.xpath("//*[@id=\"content\"]/app-notice-register/div/div/div/div/div[2]/table/tbody/tr[1]/td[9]/a/button")).click();
	   Thread.sleep(2000);
   
	   
	   
	   
	   
	   
	   /*
	   // enter meeting subject  
	   driver().findElement(By.xpath("//ngx-select[@placeholder='Select Meeting Subject']")).click();
	   Thread.sleep(2000);
	   driver().findElement(By.xpath("//*[@id=\"content1\"]/div/form/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[1]/a/span")).click();
	   Thread.sleep(2000);
      
	   //Enter meeting discription 
	   driver().findElement(By.xpath("//ngx-select[@placeholder='Select Meeting Description']")).click();
	   Thread.sleep(2000);
	   driver().findElement(By.xpath("//*[@id=\"content1\"]/div/form/div[2]/div/ngx-select/div/ngx-select-choices/ul/li/a/span")).click();
	   Thread.sleep(2000);
   
      //select date 
	   driver().findElement(By.xpath("//input[@formcontrolname='formDate']")).sendKeys("12/7/2022");
	   Thread.sleep(2000);
	   driver().findElement(By.xpath("//input[@formcontrolname='toDate']")).sendKeys("12/7/2022");
	   Thread.sleep(2000);
	   
	   // select time 
	   driver().findElement(By.xpath("//input[@formcontrolname='formTime']")).sendKeys("12:10PM");
	   Thread.sleep(2000);
	   driver().findElement(By.xpath("//input[@formcontrolname='toTime']")).sendKeys("08:45PM");
	   Thread.sleep(2000);
	   
	
	   
	   // select meeting member
	   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[2]/td[5]/div/input")).click();
	   Thread.sleep(2000);
	   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[3]/td[5]/div/input")).click();
	   Thread.sleep(2000);
	   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[9]/td[5]/div/input")).click();
	   Thread.sleep(2000);
 
	   //click on create button
	   driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-verification-program/div[1]/div/div/div/div[3]/button")).click();
	   Thread.sleep(4000); 
	   
	   */
	   
	  //1. without enter any data click on create meeting button
	   //click on create button
	   driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-verification-program/div[1]/div/div/div/div[3]/button")).click();
	   Thread.sleep(3000);
	    driver().navigate().refresh();
	   
	    //2.WITHOUT ENTER MEETing sub &description click on crete button 
	    //select date 
		   driver().findElement(By.xpath("//input[@formcontrolname='formDate']")).sendKeys("12/7/2022");
		   Thread.sleep(2000);
		   driver().findElement(By.xpath("//input[@formcontrolname='toDate']")).sendKeys("12/7/2022");
		   Thread.sleep(2000);
		   // select time 
		   driver().findElement(By.xpath("//input[@formcontrolname='formTime']")).sendKeys("12:10PM");
		   Thread.sleep(2000);
		   driver().findElement(By.xpath("//input[@formcontrolname='toTime']")).sendKeys("08:45PM");
		   Thread.sleep(2000);
		   // select meeting member
		   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[2]/td[5]/div/input")).click();
		   Thread.sleep(2000);
		   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[3]/td[5]/div/input")).click();
		   Thread.sleep(2000);
		   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[9]/td[5]/div/input")).click();
		   Thread.sleep(2000);
	       driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-verification-program/div[1]/div/div/div/div[3]/button")).click();
		   Thread.sleep(3000);
		    driver().navigate().refresh();
	   
		    //3.Without enter date & time click on create button
		    // enter meeting subject  
			   driver().findElement(By.xpath("//ngx-select[@placeholder='Select Meeting Subject']")).click();
			   Thread.sleep(2000);
			   driver().findElement(By.xpath("//*[@id=\"content1\"]/div/form/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[1]/a/span")).click();
			   Thread.sleep(2000);
		      
			   //Enter meeting description 
			   driver().findElement(By.xpath("//ngx-select[@placeholder='Select Meeting Description']")).click();
			   Thread.sleep(2000);
			   driver().findElement(By.xpath("//*[@id=\"content1\"]/div/form/div[2]/div/ngx-select/div/ngx-select-choices/ul/li/a/span")).click();
			   Thread.sleep(2000);
			   // select meeting member
			   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[2]/td[5]/div/input")).click();
			   Thread.sleep(2000);
			   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[3]/td[5]/div/input")).click();
			   Thread.sleep(2000);
			   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[9]/td[5]/div/input")).click();
			   Thread.sleep(2000);
		 
			   //click on create button
			   driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-verification-program/div[1]/div/div/div/div[3]/button")).click();
			   Thread.sleep(3000); 
			   driver().navigate().refresh();
	   
	             //4. without select meeting member click on create button
			    // enter meeting subject  
				   driver().findElement(By.xpath("//ngx-select[@placeholder='Select Meeting Subject']")).click();
				   Thread.sleep(2000);
				   driver().findElement(By.xpath("//*[@id=\"content1\"]/div/form/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[1]/a/span")).click();
				   Thread.sleep(2000);
			      
				   //Enter meeting discription 
				   driver().findElement(By.xpath("//ngx-select[@placeholder='Select Meeting Description']")).click();
				   Thread.sleep(2000);
				   driver().findElement(By.xpath("//*[@id=\"content1\"]/div/form/div[2]/div/ngx-select/div/ngx-select-choices/ul/li/a/span")).click();
				   Thread.sleep(2000);
				 
				   //select date 
				   driver().findElement(By.xpath("//input[@formcontrolname='formDate']")).sendKeys("12/7/2022");
				   Thread.sleep(2000);
				   driver().findElement(By.xpath("//input[@formcontrolname='toDate']")).sendKeys("12/7/2022");
				   Thread.sleep(2000);
				   // select time 
				   driver().findElement(By.xpath("//input[@formcontrolname='formTime']")).sendKeys("12:10PM");
				   Thread.sleep(2000);
				   
				   driver().findElement(By.xpath("//input[@formcontrolname='toTime']")).sendKeys("08:45PM");
				   Thread.sleep(2000);
				   
				   //click on create button
				   driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-verification-program/div[1]/div/div/div/div[3]/button")).click();
				   Thread.sleep(3000); 
				   driver().navigate().refresh();
	   
				   //5.only selecting meeting member click on ceate button
				   // select meeting member
				   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[2]/td[5]/div/input")).click();
				   Thread.sleep(2000);
				   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[3]/td[5]/div/input")).click();
				   Thread.sleep(2000);
				   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[9]/td[5]/div/input")).click();
				   Thread.sleep(2000);
				   //click on create button
				   driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-verification-program/div[1]/div/div/div/div[3]/button")).click();
				   Thread.sleep(3000); 
				   driver().navigate().refresh();
				   
              //6.only entering meeting details &  click on create button
				   // enter meeting subject  
				   driver().findElement(By.xpath("//ngx-select[@placeholder='Select Meeting Subject']")).click();
				   Thread.sleep(2000);
				   driver().findElement(By.xpath("//*[@id=\"content1\"]/div/form/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[1]/a/span")).click();
				   Thread.sleep(2000);
				   //Enter meeting description 
				   driver().findElement(By.xpath("//ngx-select[@placeholder='Select Meeting Description']")).click();
				   Thread.sleep(2000);
				   driver().findElement(By.xpath("//*[@id=\"content1\"]/div/form/div[2]/div/ngx-select/div/ngx-select-choices/ul/li/a/span")).click();
				   Thread.sleep(2000);	
				   //click on create button
				   driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-verification-program/div[1]/div/div/div/div[3]/button")).click();
				   Thread.sleep(3000); 
				   driver().navigate().refresh();
				   
				 		   
	  driver().getWindowHandles();
	  Thread.sleep(2000);
	   //click on search button
	   driver().findElement(By.xpath("//*[@id=\"content\"]/app-notices/div/div/div[1]/form/div/div[8]/input")).sendKeys("5");
	   Thread.sleep(2000);
	
	   // click on edit button
	   driver().findElement(By.xpath("//*[@id=\"content\"]/app-notices/div/div/div[2]/table/tbody/tr[10]/td[10]/div/a[1]/button")).click();
	   Thread.sleep(2000); 
	  /* 
	   //update Date
	   driver().findElement(By.xpath("//input[@formcontrolname='formDate']")).sendKeys("10/8/2022");
	   Thread.sleep(2000);
	   driver().findElement(By.xpath("//input[@formcontrolname='toDate']")).sendKeys("10/8/2022");
	   Thread.sleep(2000);
	   
	   */
	   // select meeting member
	   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[8]/td[5]/div/input")).click();
	   Thread.sleep(2000);
	  
	   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[4]/td[5]/div/input")).click();
	   Thread.sleep(2000);
	   
	   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[5]/td[5]/div/input")).click();
	   Thread.sleep(2000);
	   
	   // click on update button 
	   driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-verification-program/div[1]/div/div/div/div[3]/button")).click();
	   Thread.sleep(5000);
	   
	   // click on delete button
	   driver().findElement(By.xpath("//*[@id=\"content\"]/app-notices/div/div/div[2]/table/tbody/tr[10]/td[10]/div/button/i")).click();
	   Thread.sleep(2000);
	
	  
	    // Click on view button
	   driver().findElement(By.xpath("//*[@id=\"content\"]/app-notices/div/div/div[2]/table/tbody/tr[10]/td[10]/div/a[2]/button/i")).click();
	   Thread.sleep(2000);
	   
       driver().close();
   
   
   }    
			
   }

