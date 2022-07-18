package claimant;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upload_claimant_document extends Ifr_login

{
    
  @Test()
  public void Uploadold() throws Exception
  {
	// upload document
	  driver().get("http://trti.mahamining.com/uploadClaimantDocument/13");
  
	  
	// Click on upload button
	
	driver().findElement(By.xpath("//*[@id=\"content\"]/app-upload-claimant-documents/div[1]/div/div/div/div/div[2]/table/tbody/tr[1]/td[5]/div/label")).click();
	Thread .sleep(6000);
	
	driver().findElement(By.xpath("//*[@id=\"content\"]/app-upload-claimant-documents/div[1]/div/div/div/div/div[2]/table/tbody/tr[2]/td[5]/div/label")).click();
	Thread .sleep(6000);
	
	driver().findElement(By.xpath("//*[@id=\"content\"]/app-upload-claimant-documents/div[1]/div/div/div/div/div[2]/table/tbody/tr[3]/td[5]/div/label")).click();
	Thread .sleep(6000);
	
	driver().findElement(By.xpath("//*[@id=\"content\"]/app-upload-claimant-documents/div[1]/div/div/div/div/div[2]/table/tbody/tr[4]/td[5]/div/label")).click();
	Thread .sleep(6000);
	
	driver().findElement(By.xpath("//*[@id=\"content\"]/app-upload-claimant-documents/div[1]/div/div/div/div/div[3]/button")).click();
	Thread .sleep(5000);
	
	
	}	
}
