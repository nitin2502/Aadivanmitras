package old_Claim;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class boundary extends Thanedlc 

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
     
    //Boundary of Claimed Space
    driver().findElement(By.xpath("//input[@placeholder='To The East']")).sendKeys("");  
    Thread .sleep(2000); 
    driver().findElement(By.xpath("//input[@placeholder='To The West']")).sendKeys("");  
    Thread .sleep(2000); 
    driver().findElement(By.xpath("//input[@placeholder='To The North']")).sendKeys("");  
    Thread .sleep(2000); 
    driver().findElement(By.xpath("//input[@placeholder='To The South']")).sendKeys("");  
    Thread .sleep(2000); 
      // create case
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[14]/div/button")).click();  
      Thread .sleep(3000);
    
   // close the driver
  	 driver().close();
      
  }
  

  
}
