package old_Claim;

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
	  driver().get("http://trti.mahamining.com/oldIfrClaimUploadDocument/51");
	  Thread .sleep(3000);
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[3]/div/div[1]/label")).click();
	  Thread .sleep(10000);
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[5]/table/tbody/tr[1]/td[3]/div[1]/label")).click();
	  Thread .sleep(2000);
	  driver().findElement(By.xpath("//input[@placeholder='dd-mm-yyyy']")).sendKeys("02-10-2021");
	  Thread .sleep(2000);
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[5]/table/tbody/tr[1]/td[4]/div/div/input")).sendKeys("02-10-2021");
	  Thread .sleep(2000);
	  
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[5]/table/tbody/tr[1]/td[5]/div/label")).click();
	  Thread .sleep(10000);
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-upload-document/div[1]/div/div/div/div/div[6]/button")).click();
	  Thread .sleep(2000);
  }
  


}
