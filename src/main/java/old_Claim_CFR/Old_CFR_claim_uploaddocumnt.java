package old_Claim_CFR;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import old_Claim_IFR.Thanedlc;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Old_CFR_claim_uploaddocumnt extends Thanedlc 

{    
  @Test()
  public void Uploadold() throws Exception
  {  
	
	  Thread.sleep(3000);
	  driver().get("http://trti.mahamining.com/oldCfrClaimUploadDocument/38");
	  Thread .sleep(3000);
	 
	  /*
	  
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-cfr-claim-upload-document/div[1]/div/div/div/div/div[3]/div/div[1]/label")).click();
	  Thread .sleep(10000);
	  driver().findElement(By.name("67-test")).click();
	  Thread .sleep(2000);
	  driver().findElement(By.xpath("//input[@placeholder='dd-mm-yyyy']")).sendKeys("02-10-1990");
	  Thread .sleep(2000);
	
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-cfr-claim-upload-document/div[1]/div/div/div/div/div[5]/table/tbody/tr[1]/td[5]/div/label")).click();
	  Thread .sleep(10000);
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-cfr-claim-upload-document/div[1]/div/div/div/div/div[6]/button")).click();
	  Thread .sleep(2000);
	  //click on claim list
     
      driver().findElement(By.xpath("//input[@placeholder='Enter CFR Village Name/Claim No.']")).sendKeys("11/ab");  
      Thread .sleep(3000);
      driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-cfr-claim-list/div/div/div/div/div/div[1]/form/div/div[8]/div/button")).click();  
      Thread .sleep(2000);
      driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-cfr-claim-list/div/div/div/div/div/div[2]/table/tbody/tr/td[10]/a/i")).click();  
    
      Thread .sleep(30000);
	 
	  */
	  
	  
	  // without uploading mandatory document
	  
	  driver().findElement(By.name("67-test")).click();
	  Thread .sleep(2000);
	  driver().findElement(By.xpath("//input[@placeholder='dd-mm-yyyy']")).sendKeys("02-10-1990");
	  Thread .sleep(2000);
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-cfr-claim-upload-document/div[1]/div/div/div/div/div[5]/table/tbody/tr[1]/td[5]/div/label")).click();
	  Thread .sleep(10000);
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-cfr-claim-upload-document/div[1]/div/div/div/div/div[6]/button")).click();
	  Thread .sleep(2000);
	   driver().navigate().refresh();
	       
	    //Without selecting DocuMENT DATE
	       driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-cfr-claim-upload-document/div[1]/div/div/div/div/div[3]/div/div[1]/label")).click();
	 	  Thread .sleep(10000);
	 	  driver().findElement(By.name("67-test")).click();
	 	  Thread .sleep(2000);
	 
	 	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-cfr-claim-upload-document/div[1]/div/div/div/div/div[5]/table/tbody/tr[1]/td[5]/div/label")).click();
	 	  Thread .sleep(3000);
	 	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-cfr-claim-upload-document/div[1]/div/div/div/div/div[6]/button")).click();
	 	  Thread .sleep(2000);
	 	  
	 	  
	 	 driver().navigate().refresh();
	  // without uploding Optional documents
	 	 driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-cfr-claim-upload-document/div[1]/div/div/div/div/div[3]/div/div[1]/label")).click();
		  Thread .sleep(10000);
		  driver().findElement(By.name("67-test")).click();
		  Thread .sleep(2000);
		  driver().findElement(By.xpath("//input[@placeholder='dd-mm-yyyy']")).sendKeys("02-10-1990");
		  Thread .sleep(2000);

		  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-cfr-claim-upload-document/div[1]/div/div/div/div/div[6]/button")).click();
		  Thread .sleep(2000);
			 driver().navigate().refresh();
	  // without upload any document
	       
			 driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-cfr-claim-upload-document/div[1]/div/div/div/div/div[6]/button")).click();
			  Thread .sleep(2000);
		  
		  
		  
		  
		 // driver().quit();
  
  
  
  
  }
  


}
