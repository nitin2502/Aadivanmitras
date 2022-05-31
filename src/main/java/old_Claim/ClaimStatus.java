package old_Claim;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ClaimStatus extends Thanedlc 

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
    //Select claim status Approved
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[2]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread.sleep(2000); 
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
    Thread.sleep(4000);
    //Select claim status Rejcted
    
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[2]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread.sleep(2000); 
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
    Thread.sleep(4000);
    
      // create case
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[14]/div/button")).click();  
      Thread .sleep(3000);
    
   // close the driver
  	 driver().close();
      
  }
  


}
