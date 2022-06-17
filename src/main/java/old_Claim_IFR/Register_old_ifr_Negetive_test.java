package old_Claim_IFR;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Register_old_ifr_Negetive_test extends Thanedlc 

{    
  @Test()
  public void Registerold() throws Exception
  
     
  {  //9. selecting same claim no
	  // click on old ifr regi
	    driver().findElement(By.xpath("//*[@id=\"heading1\"]/button/div/div[2]")).click();
	    Thread.sleep(2000);
	    driver().findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[1]/a")).click();
	    Thread.sleep(2000);  
	    
	  //select claim no
	    driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("8513/ba");
	    Thread.sleep(3000);
	 
        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[4]/div/div/button")).click();
        Thread.sleep(4000);
	    
	      // create case
	      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[14]/div/button")).click();  
	      Thread .sleep(3000);
	      driver().navigate().refresh();
	
	  Thread.sleep(3000);
	  // click on old ifr regi
    driver().findElement(By.xpath("//*[@id=\"heading1\"]/button/div/div[2]")).click();
    Thread.sleep(2000);
    driver().findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[1]/a")).click();
    Thread.sleep(2000);  
    
  //select claim no
    driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("11111");
    Thread.sleep(3000);
      // create case
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[14]/div/button")).click();  
      Thread .sleep(3000);
      driver().navigate().refresh();
    //2.test2
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
      
        //3.test3
        driver().navigate().refresh();
        
        //survey no / gat no 
        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[5]/div[2]/div/div/div[2]/div/input")).sendKeys("123/A,125/b");  
        Thread .sleep(2000);   
        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[6]/div/div/div[2]/div/input")).sendKeys("5");  
        Thread .sleep(2000);
        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[7]/div/div/div[2]/div/div/input")).sendKeys("3");  
        Thread .sleep(2000);
        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[8]/div/div/div[2]/div/div/input")).sendKeys("2.2");  
        Thread .sleep(2000);
        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[9]/div/div/div[2]/div/div/input")).sendKeys("2.1");  
        Thread .sleep(2000);
        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[10]/div/div/div[2]/div/div/input")).sendKeys("4.1234");  
        Thread .sleep(2000);
        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[11]/div/div/div[2]/div/div/input")).sendKeys("3.3");  
        Thread .sleep(2000);
        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[12]/div/div/div[2]/div/div/input")).sendKeys("5.6");  
        Thread .sleep(2000);
          // create case
        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[14]/div/button")).click();  
        Thread .sleep(3000);
 
         //4.test 
         driver().navigate().refresh();
          
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
            driver().navigate().refresh(); 
            //5.test

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
                
         
              //7.test App/rejected selection

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
              driver().navigate().refresh(); 
          
         
         //9.test  Diff claim no
            driver().navigate().refresh(); 
            driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("11111");
            Thread.sleep(2000);
            
              // create case
              driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[14]/div/button")).click();  
              Thread .sleep(3000);
              driver().navigate().refresh();
              driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("00011115555555555555");
              Thread.sleep(2000);
           
              driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[4]/div/div/button")).click();
              Thread.sleep(4000);
              driver().navigate().refresh();
              driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("qwertyuiop");
              Thread.sleep(2000);
              driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[4]/div/div/button")).click();
              Thread.sleep(4000);
              driver().navigate().refresh();
              driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("abcd90/*-");
              Thread.sleep(2000);
              driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[4]/div/div/button")).click();
              Thread.sleep(2000);
              driver().navigate().refresh();
  
              driver().close();
              //
              
          
  }
  
 
}
