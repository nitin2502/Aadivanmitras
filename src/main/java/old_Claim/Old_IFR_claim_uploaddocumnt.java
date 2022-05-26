package old_Claim;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Old_IFR_claim_uploaddocumnt extends Thanedlc 

{    
  @Test()
  public void Uploadold() throws Exception
  {  
	//click on old IFr list
	  driver().findElement(By.xpath("//*[@id=\"heading1\"]/button/div/div[2]")).click();
	  Thread .sleep(1000);
	  driver().findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[3]/a")).click();
	  Thread .sleep(1000);
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-list/div/div/div/div/div/div[2]/table/tbody/tr[8]/td[10]/a/i")).click();
	  Thread .sleep(3000);
	  driver().findElement(By.xpath("//input[@id='Certificate']")).click();
	  Thread .sleep(10000);
	
	 
	  
	  
	  
  }
  

  
}
