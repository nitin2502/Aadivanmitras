package old_Claim;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import masterint.Crossbrowser;

public class Oldifrclaim  extends Thanedlc 
{   @Test(priority=1)
public  void AdminTC1() throws Exception
	{  
//click on old IFR 
driver().findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[3]/h2/button/div/div[2]")).click();
Thread .sleep(1000);
driver().findElement(By.xpath("//*[@id=\"collapse2\"]/div/ul/li[3]/a")).click();
Thread .sleep(1000);
driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-list/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[11]/a/i")).click();
Thread .sleep(8000);
	}
  @ Test(priority=2)
 public void uploadClaim() throws InterruptedException
  {
 driver().findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[3]/h2/button/div/div[2]")).click();
Thread .sleep(1000); driver().findElement(By.xpath("//*[@id=\"collapse2\"]/div/ul/li[2]/a")).click();Thread .sleep(1000);
driver().findElement(By.xpath("//*[@id=\"content\"]/app-upload-old-ifr-claims/div[1]/div/div/div/div/div[1]/div/div[2]/button")).click();
Thread .sleep(2000);
//click on approved button
driver().findElement(By.xpath("//*[@id=\"inlineRadio1\"]")).click();
Thread .sleep(2000);
driver().findElement(By.xpath("//*[@id=\"UploadModal\"]/div/div/div[2]/div/div[2]/a[1]")).click();
Thread .sleep(2000);	
WebElement r= driver().findElement(By.xpath("//*[@id=\"UploadModal\"]/div/div/div[2]/div/ngx-file-drag-drop/span"));
r.click();
driver().findElement(By.xpath("//*[@id=\"UploadModal\"]/div/div/div[3]/button[1]")).click();
Thread .sleep(4000);
driver().findElement(By.xpath("//*[@id=\"content\"]/app-upload-old-ifr-claims/div[1]/div/div/div/div/div[2]/table/tbody/tr[2]/td[10]/div/button[1]/a/i")).click();  
Thread .sleep(6000);

  }
  @ Test(priority=3)
  public void CreateCASE() throws InterruptedException, IOException
  {  driver().get("http://trti.mahamining.com/createCase/393");
          Thread .sleep(4000);
          //select town
          driver().findElement(By.xpath("//ngx-select[@placeholder='Select Town/Village']")).click();  
         Thread .sleep(3000);   
         driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[6]/a/span")).click();  
         Thread .sleep(3000);   
	   //Claimant name
         driver().findElement(By.xpath("//input[@placeholder='Claimant Name (English)']")).sendKeys("Hariba");  
         Thread .sleep(3000); 
      //selectgender
         driver().findElement(By.id("gender1")).click();  
         Thread .sleep(3000); 
       //dateof birth    
         driver().findElement(By.xpath("//input[@placeholder='Date of Birth']")).sendKeys("11-05-2022");  
         Thread .sleep(3000);  
        
        //mob no
         driver().findElement(By.id("mobile_id")).sendKeys("9638527412");  
         Thread .sleep(3000); 
       //claimant category
         driver().findElement(By.xpath("//ngx-select[@placeholder='Select Category']")).click();  
         Thread .sleep(3000);
         driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[8]/div/ngx-select/div/ngx-select-choices/ul/li[8]/a/span")).click();  
         Thread .sleep(3000);
      //martial status
         driver().findElement(By.id("maritalstatus2")).click();  
         Thread .sleep(3000);
       //click on cancel button
         driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[11]/div/button[1]")).click();  
         Thread .sleep(5000);
  
  }
  @ Test(priority=4)
  public void CreateCASE2() throws InterruptedException, IOException
  {  driver().get("http://trti.mahamining.com/createCase/394");
          Thread .sleep(4000);
          //select town
          driver().findElement(By.xpath("//ngx-select[@placeholder='Select Town/Village']")).click();  
         Thread .sleep(3000);   
         driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[6]/a/span")).click();  
         Thread .sleep(3000);   
	   //Claimant name
         driver().findElement(By.xpath("//input[@placeholder='Claimant Name (English)']")).sendKeys("dhondiba");  
         Thread .sleep(3000); 
      //selectgender
         driver().findElement(By.id("gender1")).click();  
         Thread .sleep(3000); 
       //dateof birth    
         driver().findElement(By.xpath("//input[@placeholder='Date of Birth']")).sendKeys("12-05-2022");  
         Thread .sleep(3000);  
        
        //mob no
         driver().findElement(By.id("mobile_id")).sendKeys("9638521590");  
         Thread .sleep(3000); 
       //claimant category
         driver().findElement(By.xpath("//ngx-select[@placeholder='Select Category']")).click();  
         Thread .sleep(3000);
         driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[8]/div/ngx-select/div/ngx-select-choices/ul/li[8]/a/span")).click();  
         Thread .sleep(3000);
      //martial status
         driver().findElement(By.id("maritalstatus2")).click();  
         Thread .sleep(3000);
       //click on create case button
         driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[11]/div/button[2]")).click();  
         Thread .sleep(9000);
 }
  @ Test(priority=5)
  public void CreateCASE3() throws InterruptedException, IOException
  {  driver().get("http://trti.mahamining.com/createCase/395");
          Thread .sleep(4000);
          //select town
          driver().findElement(By.xpath("//ngx-select[@placeholder='Select Town/Village']")).click();  
         Thread .sleep(3000);   
         driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[6]/a/span")).click();  
         Thread .sleep(3000);   
	   //Claimant name
         driver().findElement(By.xpath("//input[@placeholder='Claimant Name (English)']")).sendKeys("dhondiba");  
         Thread .sleep(3000); 
      //selectgender
         driver().findElement(By.id("gender1")).click();  
         Thread .sleep(3000); 
       //dateof birth    
         driver().findElement(By.xpath("//input[@placeholder='Date of Birth']")).sendKeys("12-05-2022");  
         Thread .sleep(3000);  
        
        //mob no
         driver().findElement(By.id("mobile_id")).sendKeys("9638521590");  
         Thread .sleep(3000); 
       //claimant category
         driver().findElement(By.xpath("//ngx-select[@placeholder='Select Category']")).click();  
         Thread .sleep(3000);
         driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[8]/div/ngx-select/div/ngx-select-choices/ul/li[8]/a/span")).click();  
         Thread .sleep(3000);
      //martial status
         driver().findElement(By.id("maritalstatus2")).click();  
         Thread .sleep(3000);
       //click on create case button
         driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[11]/div/button[2]")).click();  
         Thread .sleep(3000);
         driver().findElement(By.xpath("//*[@id=\"ConfirmModal\"]/div/div/div[2]/button[2]")).click();  
         Thread .sleep(3000);
  
  }
     @ Test(priority=5)
  public void uploaddocu() throws InterruptedException, IOException
  {  
	 
  // enter document no
     driver().get("http://trti.mahamining.com/oldIfrClaimUploadDocument/8");
     Thread .sleep(3000);
     driver().findElement(By.xpath("//input[@placeholder='Document No']")).sendKeys("12345");  
     Thread .sleep(3000);
     driver().findElement(By.xpath("//input[@placeholder='dd-mm-yyyy']")).sendKeys("11-05-2022");  
     Thread .sleep(3000);
     driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[2]/table/tbody/tr[1]/td[5]/div/label")).click();  
     Thread .sleep(5000);
     driver().switchTo().alert().accept();
     
	
  }
       
  
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
