package old_Claim_CFR;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import old_Claim_IFR.Thanedlc;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Upload_old_CFR_Claim extends Thanedlc 

{    
  @Test()
  public void Uploadold() throws Exception
  {  
	//click on old IFR 
	  driver().findElement(By.xpath("//*[@id=\"heading2\"]/button/div/div[2]")).click();
	  Thread .sleep(1000);
	  driver().findElement(By.xpath("//*[@id=\"collapse2\"]/div/ul/li[2]/a")).click();
	  Thread .sleep(1000);
	  driver().navigate().refresh();
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-upload-old-cfr-claims/div[1]/div/div/div/div/div[1]/div/div[2]/button")).click();
	  Thread .sleep(3000);
	  driver().findElement(By.id("inlineRadio1")).click();
	  Thread .sleep(4000);
    //upload approved file
	  driver().findElement(By.id("inlineRadio2")).click();
	  Thread .sleep(3000);
	  driver().findElement(By.xpath("//*[@id=\"UploadModal\"]/div/div/div[2]/div/ngx-file-drag-drop/span")).click();
	  Thread .sleep(10000);
    //submit file
	  driver().findElement(By.xpath("//*[@id=\"UploadModal\"]/div/div/div[3]/button[2]")).click();
	  Thread .sleep(5000);
	 
 
  
  }
  

  
}
