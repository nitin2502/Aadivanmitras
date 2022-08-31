package old_Claim_IFR;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Old_IFR_claim_uploaddocumnt extends Thanedlc 

{    
  @Test()
  public void Uploadold() throws Exception
  {  
	
	  Thread.sleep(3000);
	  driver().get("http://trti.mahamining.com/oldIfrClaimUploadDocument/33");
	  Thread .sleep(3000);
	  
	 
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[3]/div/div[1]/label")).click();
	  Thread .sleep(10000);
	  driver().findElement(By.name("30-test")).click();
	  Thread .sleep(2000);
	  driver().findElement(By.xpath("//input[@placeholder='dd-mm-yyyy']")).sendKeys("02-10-1990");
	  Thread .sleep(2000);
	
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[5]/table/tbody/tr[3]/td[5]/div/label")).click();
	  Thread .sleep(10000);
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[6]/button")).click();
	  Thread .sleep(2000);
	  //click on claim list
     
      driver().findElement(By.xpath("//input[@placeholder='Enter Claimant Name/Claim No.']")).sendKeys("8513/ba");  
      Thread .sleep(3000);
      driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-list/div/div/div/div/div/div[1]/form/div/div[8]/div/button")).click();  
      Thread .sleep(2000);
      driver().findElement(By.xpath("//a[@class='btn btn-light rounded ng-star-inserted']")).click();  
      Thread .sleep(10000);
	  
	  driver().navigate().refresh();
	  
	  // without uploading mandatory document
	  
	  driver().findElement(By.name("30-test")).click();
	  Thread .sleep(2000);
	  driver().findElement(By.xpath("//input[@placeholder='dd-mm-yyyy']")).sendKeys("02-10-1990");
	  Thread .sleep(2000);
	
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[5]/table/tbody/tr[1]/td[5]/div/label")).click();
	  Thread .sleep(3000);
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[6]/button")).click();
	  Thread .sleep(2000);
	   driver().navigate().refresh();
	       
	    //Without selecting DocuMENT DATE
	       driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[3]/div/div[1]/label")).click();
	 	  Thread .sleep(10000);
	 	  driver().findElement(By.name("30-test")).click();
	 	  Thread .sleep(2000);
	 
	 	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[5]/table/tbody/tr[1]/td[5]/div/label")).click();
	 	  Thread .sleep(3000);
	 	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[6]/button")).click();
	 	  Thread .sleep(2000);
	 	  
	 	  
	 	 driver().navigate().refresh();
	  // without uploding Optional documents
	 	 driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[3]/div/div[1]/label")).click();
		  Thread .sleep(10000);
		  driver().findElement(By.name("30-test")).click();
		  Thread .sleep(2000);
		  driver().findElement(By.xpath("//input[@placeholder='dd-mm-yyyy']")).sendKeys("02-10-1990");
		  Thread .sleep(2000);

		  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[6]/button")).click();
		  Thread .sleep(2000);
			 driver().navigate().refresh();
	  // without upload any document
	       
			 driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[6]/button")).click();
			  Thread .sleep(2000);
		  
		  driver().quit();
  
  
  
  
  }
  


}
