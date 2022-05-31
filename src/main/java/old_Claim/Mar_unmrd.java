package old_Claim;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Mar_unmrd extends Thanedlc 

{    
  @Test()
  public void Registerold() throws Exception
     
  { 
	  Thread.sleep(3000);
	  // click on old ifr regi
    driver().findElement(By.xpath("//*[@id=\"heading1\"]/button/div/div[2]")).click();
    Thread.sleep(2000);
    driver().findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[1]/a")).click();
    Thread.sleep(2000);  
    
    //martial status
       //unmarried
       driver().findElement(By.id("maritalstatus2")).click();  
       Thread .sleep(4000);
       //click on married
       driver().findElement(By.id("maritalstatus1")).click();  
       Thread .sleep(2000);
      //spouse name 
       driver().findElement(By.xpath("//input[@placeholder='Spouse Name']")).sendKeys("Laxmi");  
       Thread .sleep(2000);
       //spousecategory
       driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[13]/div/ngx-select/div/div[2]/div")).click();  
       Thread .sleep(3000);
       driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[13]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();  
       Thread .sleep(3000);
     //spouse  caste
       driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[14]/div/ngx-select/div/div[2]/div/span[1]/span")).click();  
       Thread .sleep(3000);
       driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[14]/div/ngx-select/div/ngx-select-choices/ul/li[9]/a/span")).click();  
        Thread .sleep(3000);
       
        // create case
        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[14]/div/button")).click();  
        Thread .sleep(3000);
    
      driver().navigate().refresh();
     
   // close the driver
  	 driver().close();
      
  }
  

  
}
