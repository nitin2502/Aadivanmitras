package old_Claim_CFR;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import old_Claim_IFR.Thanedlc;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Register_old_CFR_Rejected extends Thanedlc 

{    
  @Test()
  public void Registerold() throws Exception
  
     
  { 
	  Thread.sleep(3000);
	  // click on old cfr regi
    driver().findElement(By.xpath("//*[@id=\"heading2\"]/button/div/div[2]")).click();
    Thread.sleep(2000);
    driver().findElement(By.xpath("//*[@id=\"collapse2\"]/div/ul/li[1]/a")).click();
    Thread.sleep(2000);  
    
    
   // claim status
    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Status']")).click();
    Thread.sleep(2000); 
    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
    Thread.sleep(2000);
   //select request
    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Type']")).click();
    Thread.sleep(2000); 
    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
    Thread.sleep(2000);
  //select claim no
    driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("1706/R");
    Thread.sleep(2000);
    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[4]/div/div/button")).click();
    Thread.sleep(3000);
    
    //claim date
    driver().findElement(By.xpath("//input[@placeholder='Claim Date']")).sendKeys("12/05/2017");  
    Thread .sleep(2000);
    //rejection date
    driver().findElement(By.xpath("//input[@placeholder='Rejection Date']")).sendKeys("12/05/2021");  
    Thread .sleep(2000);  
    
    
     //Rejected at Committee Level*
    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Committee Level']")).click();
    Thread.sleep(2000);
    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[7]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
    Thread.sleep(3000);
    
   // Select Reason for Rejection
    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Reason for Rejection']")).click();
    Thread.sleep(2000);
    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[8]/div/div/ngx-select/div/ngx-select-choices/ul/li/a/span")).click();
    Thread.sleep(3000);
  
    //radio seleaction
    driver().findElement(By.name("roCWH")).click();
    Thread.sleep(2000);
    driver().findElement(By.name("roPVTG")).click();
    Thread.sleep(2000);
    //select tribe
    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Tribe']")).click();
    Thread.sleep(2000); 
    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[11]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
    Thread.sleep(2000);
    driver().findElement(By.name("roNCNP")).click();
    Thread.sleep(2000);
    driver().findElement(By.name("roPESA")).click();
    Thread.sleep(2000);
    //area details
    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Subdivision']")).click();
    Thread.sleep(2000); 
    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[2]/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a")).click();
    Thread.sleep(2000);
    //select taluka
    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Taluka']")).click();
    Thread.sleep(2000); 
    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[2]/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a")).click();
    Thread.sleep(2000);
   //select Revenue /village
    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Town/Village']")).click();
    Thread.sleep(2000); 
    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[2]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
    Thread.sleep(2000);
   //select panchayat
    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Grampanchayat']")).click();
    Thread.sleep(2000); 
    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[2]/div[7]/ngx-select/div/ngx-select-choices/ul/li[4]/a")).click();
    Thread.sleep(2000);
    //pada
    driver().findElement(By.xpath("//input[@placeholder='Enter Pada']")).sendKeys("padasqw");  
    Thread .sleep(2000); 
    // enter aDDRESS
    driver().findElement(By.xpath("//textarea[@placeholder='Enter Address']")).sendKeys("Chinchwad , pune. pin-413209   rejected due to ducument 725(a), 725(B ) not updated ");  
    Thread .sleep(2000); 
    // basic details                                       
    //Claimant name
    driver().findElement(By.xpath("//input[@placeholder='Name of CFR Village']")).sendKeys(" TestCFRVILLAGE ");  
    Thread .sleep(2000); 
    
  
  //Encroachment Details
  //compartment no
      driver().findElement(By.xpath("//input[@placeholder='Compartment No']")).sendKeys("12345");  
      Thread .sleep(2000);
      
      //survey no / gat no 
      driver().findElement(By.xpath("//input[@placeholder='Enter Survey No./Gat No.']")).sendKeys("12/abd,552/dbd");  
      Thread .sleep(2000);
      
      
      
      driver().findElement(By.xpath("//input[@maxlength='6']")).sendKeys("200");  
      Thread .sleep(2000);
     
      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[6]/div/div/div[2]/div/div/input")).sendKeys("20.20");  
      Thread .sleep(2000);
 
      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[7]/div/div/div[2]/div/div/input")).sendKeys("202.360");  
      Thread .sleep(2000);
     
      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[8]/div/div/div[2]/div/div/input")).sendKeys("2222");  
      Thread .sleep(2000);
      
      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[9]/div/div/div[2]/div/div/input")).sendKeys("1");  
      Thread .sleep(2000);
    
      
   
      //Boundary of Claimed Space
      driver().findElement(By.xpath("//input[@placeholder='To The East']")).sendKeys("ground");  
      Thread .sleep(2000); 
      driver().findElement(By.xpath("//input[@placeholder='To The West']")).sendKeys("Home");  
      Thread .sleep(2000); 
      driver().findElement(By.xpath("//input[@placeholder='To The North']")).sendKeys("Mandir");  
      Thread .sleep(2000); 
      driver().findElement(By.xpath("//input[@placeholder='To The South']")).sendKeys("Dhanore ");  
      Thread .sleep(2000); 
      
      //remark
      driver().findElement(By.xpath("//textarea[@placeholder='Remark']")).sendKeys("Your claim id not considersed because u are not submitted Claim within year limit (2000-2025)");  
      Thread .sleep(2000);
      //remark2
   
      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[13]/div/div/textarea")).sendKeys(" considersed because u are not submitted Claim within year limit (2000-2025)");  
      Thread .sleep(2000);
      
      // create case
      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[14]/div/button[2]")).click();  
      Thread .sleep(2000);
      driver().findElement(By.xpath("//*[@id=\"ConfirmModal\"]/div/div/div[2]/button[2]")).click();  
      Thread .sleep(2000);
      driver().findElement(By.xpath(" //*[@id=\"ConfirmDocumentModal\"]/div/div/div[2]/button[1]")).click();  
      Thread .sleep(3000);
      
      
      
  
      //click on claim list
      driver().findElement(By.xpath("//*[@id=\"collapse2\"]/div/ul/li[3]/a")).click();  
      Thread .sleep(2000);
      driver().findElement(By.xpath("//input[@placeholder='Enter CFR Village Name/Claim No.']")).sendKeys("1706/R");  
      Thread .sleep(3000);
      driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-cfr-claim-list/div/div/div/div/div/div[1]/form/div/div[8]/div/button")).click();  
      Thread .sleep(2000);
      driver().findElement(By.xpath("//a[@class='btn btn-light rounded ng-star-inserted']")).click();  
      Thread .sleep(30000);
       
      Screenshot k= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver());

  	ImageIO.write(k.getImage(), "png", new File("C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Screenshot\\RegisterOld07.png"));
     Thread .sleep(2000);
   // close the driver
  	 driver().close();
      
  }
  

  
}
