package old_Claim_CFR;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import old_Claim_IFR.Thanedlc;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Register_old_cfr_Negetive_test extends Thanedlc 

{    
  @Test()
  public void Registerold() throws Exception
  
     
  { 
	  
	  //1. selecting same claim no
	  // click on old cfr regi
	  driver().findElement(By.xpath("//*[@id=\"heading2\"]/button/div/div[2]")).click();
	    Thread.sleep(2000);
	    driver().findElement(By.xpath("//*[@id=\"collapse2\"]/div/ul/li[1]/a")).click();
	    Thread.sleep(2000);  
	    
	
	    //select claim no
	    driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("1706/ar4");
	    Thread.sleep(2000);
	 
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[4]/div/div/button")).click();
	    Thread.sleep(3000);
	    
	      // create case
	    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[13]/div/button[2]")).click();  
	      Thread .sleep(2000);
	      driver().navigate().refresh();
	     
	  
	      
	    //2.Enter diffrent type of claim No  
	       
		    driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("1706/ar4");
		    Thread.sleep(2000);
		    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[4]/div/div/button")).click();
		    Thread.sleep(3000);
		    driver().navigate().refresh();
		    
		    driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("11111");
		    Thread.sleep(2000);
		    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[4]/div/div/button")).click();
		    Thread.sleep(3000);
		    driver().navigate().refresh();
		    
		    
		    driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("texted");
		    Thread.sleep(2000);
		    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[4]/div/div/button")).click();
		    Thread.sleep(3000);
		    driver().navigate().refresh();
		    
		    driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("asd/1245");
		    Thread.sleep(2000);
		    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[4]/div/div/button")).click();
		    Thread.sleep(3000);
		    driver().navigate().refresh();
		    
		    driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("asd/1245");
		    Thread.sleep(2000);
		    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[4]/div/div/button")).click();
		    Thread.sleep(3000);
		    driver().navigate().refresh();
		    
		    driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("asd1245");
		    Thread.sleep(2000);
		    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[4]/div/div/button")).click();
		    Thread.sleep(3000);
		    driver().navigate().refresh();
		    
		    driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("asd-1245");
		    Thread.sleep(2000);
		    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[4]/div/div/button")).click();
		    Thread.sleep(3000);
		    driver().navigate().refresh();
		    
		    
		    driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("asd-124/5");
		    Thread.sleep(2000);
		    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[4]/div/div/button")).click();
		    Thread.sleep(3000);
		    driver().navigate().refresh();
		    
		    //3. select diff claim status
		  
		    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Status']")).click();
		    Thread.sleep(2000); 
		    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
		    Thread.sleep(2000);
		    driver().navigate().refresh();
		    
		    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Status']")).click();
		    Thread.sleep(2000); 
		    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
		    Thread.sleep(2000);  
		    driver().navigate().refresh();
		    
		    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Status']")).click();
		    Thread.sleep(2000); 
		    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
		    Thread.sleep(2000);
		    driver().navigate().refresh();
		    
		    //4.Without enter any input in bounadary in claimed space
		    driver().findElement(By.xpath("//input[@placeholder='To The East']")).sendKeys("");  
		      Thread .sleep(2000); 
		      driver().findElement(By.xpath("//input[@placeholder='To The West']")).sendKeys("as12dff");  
		      Thread .sleep(2000); 
		      driver().findElement(By.xpath("//input[@placeholder='To The North']")).sendKeys("");  
		      Thread .sleep(2000); 
		      driver().findElement(By.xpath("//input[@placeholder='To The South']")).sendKeys("abc/*d123/-555");  
		      Thread .sleep(2000); 

		    driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[13]/div/button[2]")).click();  
		      Thread .sleep(2000);
		      driver().navigate().refresh();
		   
	        //5.without enter Encrochment type details 
		      
		      driver().findElement(By.xpath("//input[@maxlength='6']")).sendKeys("200");  
		      Thread .sleep(2000);
		     
		      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[6]/div/div/div[2]/div/div/input")).sendKeys("20.20");  
		      Thread .sleep(2000);
		 
		      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[7]/div/div/div[2]/div/div/input")).sendKeys("202.360");  
		      Thread .sleep(2000);
		     
		      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[8]/div/div/div[2]/div/div/input")).sendKeys("2222");  
		      Thread .sleep(2000);
		      
		      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[9]/div/div/div[2]/div/div/input")).sendKeys("");  
		      Thread .sleep(2000);
		    

		      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[13]/div/button[2]")).click();  
		      Thread .sleep(2000);
		      driver().navigate().refresh();
	  
	  // 6. radio button seelecion
		      //radio seleaction
		      driver().findElement(By.name("roCWH")).click();
		      Thread.sleep(2000);
		      driver().findElement(By.name("roPVTG")).click();
		      Thread.sleep(2000);
		      //select tribe
		      driver().findElement(By.xpath("//ngx-select[@placeholder='Select Tribe']")).click();
		      Thread.sleep(2000); 
		      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[1]/div[8]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a")).click();
		      Thread.sleep(2000);
		      driver().findElement(By.name("roNCNP")).click();
		      Thread.sleep(2000);
		      driver().findElement(By.name("roPESA")).click();
		      Thread.sleep(2000);
		      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[13]/div/button[2]")).click();  
		      Thread .sleep(2000);
		      driver().navigate().refresh();
		     
		      //7.selecting only area details 
		      //area details
		      
		      driver().findElement(By.xpath("//ngx-select[@placeholder='Select Subdivision']")).click();
		      Thread.sleep(2000); 
		      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[2]/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a")).click();
		      Thread.sleep(2000);
		      //selct taluka
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
		      driver().findElement(By.xpath("//input[@placeholder='Enter Pada']")).sendKeys("pada list");  
		      Thread .sleep(2000); 
		      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[13]/div/button[2]")).click();  
		      Thread .sleep(2000);
		      driver().navigate().refresh();
	  
	  // 8. click on create case button
		      
		      driver().findElement(By.xpath("//*[@id=\"content\"]/app-create-old-cfr-case/div[1]/div/div/div/div/div/div/form/div/div[13]/div/button[2]")).click();  
		      Thread .sleep(2000);
		      driver().navigate().refresh();
		      
		    driver().close();
              
		    
		    
		    
		    //
              
          
  }
  
 
}
