package old_Claim;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class familyaddremove extends Thanedlc 

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
    

    //dependant family member
    driver().findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Ramrao");  
    Thread .sleep(2000); 
    //selectgender
    driver().findElement(By.id("genderFamily1")).click();  
    Thread .sleep(2000); 
    //enterage
    driver().findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys("18");  
    Thread .sleep(2000);  
 //relationclimant
    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Relationship']")).click();  
    Thread .sleep(3000);
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();  
     Thread .sleep(3000);  
 //add
     driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[5]/button")).click();  
     Thread .sleep(3000);
     //2nd member
     driver().findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("SOMamrao");  
     Thread .sleep(2000); 
     //selectgender
     driver().findElement(By.id("genderFamily1")).click();  
     Thread .sleep(2000); 
     //enterage
     driver().findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys("25");  
     Thread .sleep(2000);  
  //relationclimant
     driver().findElement(By.xpath("//ngx-select[@placeholder='Select Relationship']")).click();  
     Thread .sleep(3000);
     driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();  
      Thread .sleep(3000);  
  //add
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[5]/button")).click();  
      Thread .sleep(3000);
    //delete reletionship
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[6]/table/tbody/tr/td[6]/a/i")).click();  
      Thread .sleep(3000);
   
      //dependant family member3
      driver().findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("seeta");  
      Thread .sleep(2000); 
      //selectgender
      driver().findElement(By.id("genderFamily2")).click();  
      Thread .sleep(2000); 
      //enterage
      driver().findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys("55");  
      Thread .sleep(2000);  
   //relationclimant
      driver().findElement(By.xpath("//ngx-select[@placeholder='Select Relationship']")).click();  
      Thread .sleep(3000);
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/ngx-select-choices/ul/li[6]/a/span")).click();  
       Thread .sleep(3000);  
   //add
       driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[5]/button")).click();  
       Thread .sleep(3000);
 
      // create case
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[14]/div/button")).click();  
      Thread .sleep(3000);
    
   // close the driver
  	 driver().close();
      
  }
  

  
}
