package Program_meeting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import old_Claim_IFR.Thanedlc;

public class View_meeting2 extends Thanedlc

{  
   @Test
public void Program_meeting () throws Exception 
   {
	   
	   	   
	  driver().get("http://trti.mahamining.com/ProgramMeetingDetails/68");
	  Thread.sleep(3000);
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-notices/div/div/div[2]/table/tbody/tr[7]/td[10]/div/a[2]/i")).click();
	  Thread.sleep(8000);                              
	   driver().navigate().refresh();
	  // selection of radio button
	  driver().findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-notice-detail/div[1]/div/div[1]/div/div/h6[3]/div/div/div[1]/input")).click();
	  Thread.sleep(3000);    
	  
	  // Fill attendence
	  driver().findElement(By.xpath("//*[@id=\"sectionToPrint\"]/div/div/table/tbody/tr[1]/td[5]/select/option[1]")).click();
	  Thread.sleep(3000); 
	  driver().findElement(By.xpath("//*[@id=\"sectionToPrint\"]/div/div/table/tbody/tr[1]/td[5]/select/option[2]")).click();
	  Thread.sleep(3000); 
	  
	  //click on file upload button
	   
	  
	  
	  
	  
	  

	   driver().close();
	   
   }    
			
   }

