package Program_meeting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import old_Claim_IFR.Thanedlc;

public class Edit_meeting extends Thanedlc
{  
   @Test
public void Program_meeting () throws Exception 
   {
	   
	   	   
	  driver().get("http://trti.mahamining.com/createVerificationProgram/68/CFR_Update");
	    Thread.sleep(3000);
	
	   //update Date
	   driver().findElement(By.xpath("//input[@formcontrolname='formDate']")).sendKeys("06/30/2022");
	   Thread.sleep(2000);
	   driver().findElement(By.xpath("//input[@formcontrolname='toDate']")).sendKeys("06/30/2022");
	   Thread.sleep(2000);
	   
	  
	   // select meeting member
	   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[8]/td[5]/div/input")).click();
	   Thread.sleep(2000);
	  
	   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[4]/td[5]/div/input")).click();
	   Thread.sleep(2000);
	   
	   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[8]/td[5]/div/input")).click();
	   Thread.sleep(2000);
	  
	   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[4]/td[5]/div/input")).click();
	   Thread.sleep(2000);
	   
	   
	   driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[5]/td[5]/div/input")).click();
	   Thread.sleep(2000);
	   
	  
	   // click on update button 
	   driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-verification-program/div[1]/div/div/div/div[3]/button")).click();
	   Thread.sleep(3000);
	  
	   
	   //click on delete button
	   driver().findElement(By.xpath("//*[@id=\"content\"]/app-notices/div/div/div[2]/table/tbody/tr[6]/td[10]/div/button/i")).click();
	   Thread.sleep(3000);
	   
	   
	   
	   
	   driver().close();
	   
   }    
			
   }

