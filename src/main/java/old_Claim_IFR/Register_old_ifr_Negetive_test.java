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
  
     
  { 
	
	  //1. selecting same claim no

	  Thread.sleep(3000);
	  // click on old ifr regi
    driver().findElement(By.xpath("//*[@id=\"heading2\"]/button/div/div[2]")).click();
    Thread.sleep(1000);
    driver().findElement(By.xpath("//*[@id=\"collapse2\"]/div/ul/li[1]/a")).click();
    Thread.sleep(1000);  
	    
	   //select claim no
	    driver().findElement(By.xpath("//input[@placeholder='दावा क्रमांक']")).sendKeys("16/8TUE");
	    Thread.sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[4]/div/div/button")).click();
	    Thread.sleep(1000);
	  
	      // create case
	      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[14]/div/button")).click();  
	      Thread .sleep(1000);
	      driver().navigate().refresh();

		  Thread.sleep(3000);
		  // click on old ifr regi
	    driver().findElement(By.xpath("//*[@id=\"heading2\"]/button/div/div[2]")).click();
	    Thread.sleep(1000);
	    driver().findElement(By.xpath("//*[@id=\"collapse2\"]/div/ul/li[1]/a")).click();
	    Thread.sleep(1000);    
    
  //select claim no
    driver().findElement(By.xpath("//input[@placeholder='दावा क्रमांक']")).sendKeys("16/8TUE");
    Thread.sleep(1000);
      // create case
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[14]/div/button")).click();  
      Thread .sleep(3000);
      driver().navigate().refresh();
    //2.test2
    //dependant family member
      driver().findElement(By.xpath("//input[@placeholder='नाव प्रविष्ट करा']")).sendKeys("Ramrao");  
      Thread .sleep(1000); 
      //selectgender
      driver().findElement(By.id("genderFamily1")).click();  
      Thread .sleep(1000); 
      //enterage
      driver().findElement(By.xpath("//input[@placeholder='वय प्रविष्ट करा']")).sendKeys("18");  
      Thread .sleep(2000);  
   //relationclimant
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/div[2]/div/span[1]/span")).click();  
      Thread .sleep(1000);
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();  
       Thread .sleep(1000);  
   //add
       driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[5]/button")).click();  
       Thread .sleep(3000);
       //2nd member
       driver().findElement(By.xpath("//input[@placeholder='नाव प्रविष्ट करा']")).sendKeys("SOMamrao");  
       Thread .sleep(1000); 
       //selectgender
       driver().findElement(By.id("genderFamily1")).click();  
       Thread .sleep(1000); 
       //enterage
       driver().findElement(By.xpath("//input[@placeholder='वय प्रविष्ट करा']")).sendKeys("25");  
       Thread .sleep(1000);  
       //relationclimant
       driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/div[2]/div/span[1]/span")).click();  
       Thread .sleep(1000);
       driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();  
        Thread .sleep(1000);  
    //add
        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[5]/button")).click();  
        Thread .sleep(1000);
      //delete reletionship
        driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[6]/table/tbody/tr/td[6]/a/i")).click();  
        Thread .sleep(3000);
        // create case
	      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[14]/div/button")).click();  
	      Thread .sleep(1000);
	      driver().navigate().refresh();
    
      
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
         driver().findElement(By.xpath("//input[@placeholder='पूर्वेकडे']")).sendKeys("123");  
         Thread .sleep(2000); 
         driver().findElement(By.xpath("//input[@placeholder='पश्चिमेकडे']")).sendKeys("asdff");  
         Thread .sleep(2000); 
         driver().findElement(By.xpath("//input[@placeholder='उत्तरेकडे']")).sendKeys("123/-zx");  
         Thread .sleep(2000); 
         driver().findElement(By.xpath("//input[@placeholder='दक्षिणेकडे']")).sendKeys("abcd123/-555");  
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
             //claimant category
               driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[9]/div/ngx-select/div/div[2]/div/span[1]/span")).click();  
               Thread .sleep(1000);
               driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[9]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();  
               Thread .sleep(1000);
               
             //claimant caste
               driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[10]/div/ngx-select/div/div[2]/div/span[1]/span")).click();  
               Thread .sleep(1000);
               driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[10]/div/ngx-select/div/ngx-select-choices/ul/li[6]/a/span")).click();  
               Thread .sleep(1000);
             
                // create case
                driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[14]/div/button")).click();  
                Thread .sleep(3000);
                driver().navigate().refresh(); 
                
         
              //7.test App/rejected selection


          	  Thread.sleep(3000);
          	  // click on old ifr regi
              driver().findElement(By.xpath("//*[@id=\"heading2\"]/button/div/div[2]")).click();
              Thread.sleep(1000);
              driver().findElement(By.xpath("//*[@id=\"collapse2\"]/div/ul/li[1]/a")).click();
              Thread.sleep(1000);  
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
            driver().findElement(By.xpath("//input[@placeholder='दावा क्रमांक']")).sendKeys("16/8TUE");
    	    Thread.sleep(1000);
            
              // create case
              driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[14]/div/button")).click();  
              Thread .sleep(3000);
              driver().navigate().refresh();
              driver().findElement(By.xpath("//input[@placeholder='दावा क्रमांक']")).sendKeys("1111");
      	    Thread.sleep(1000);
           
              driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[4]/div/div/button")).click();
              Thread.sleep(4000);
              driver().navigate().refresh();
              driver().findElement(By.xpath("//input[@placeholder='दावा क्रमांक']")).sendKeys("ffgggg");
      	    Thread.sleep(1000);
              driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[4]/div/div/button")).click();
              Thread.sleep(4000);
              driver().navigate().refresh();
              driver().findElement(By.xpath("//input[@placeholder='दावा क्रमांक']")).sendKeys("/**-/*");
      	    Thread.sleep(1000);
      	   driver().findElement(By.xpath("//input[@placeholder='दावा क्रमांक']")).clear();
     	    Thread.sleep(1000);
              driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[4]/div/div/button")).click();
              Thread.sleep(2000);
              driver().navigate().refresh();
  
              driver().close();
              
              
          
  }
  
 
}
