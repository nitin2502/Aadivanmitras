package cms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Gr extends Chromedriverbase

{
   @Test
 public void Test1() throws Exception
 
 {System.out.println("Edgedriver");
	   driver().get("http://trti.mahamining.com//");
    driver().manage().window().maximize();
    driver().findElement(By.xpath("//*[@id=\"home_login\"]")).click();
	Thread .sleep(1000);
	//Admin login
	driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
   Thread .sleep(1000);
   driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
    Thread .sleep(1000);	
    driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[4]/button")).click();
	Thread .sleep(1000);
	  //click on cms tab 
	   driver().findElement(By.xpath("//*[@id=\"headingCms\"]/button")).click();
		Thread .sleep(1000);
		 driver().findElement(By.xpath("//*[@id=\"collapseCms\"]/div/ul/li[1]/a")).click();
			Thread .sleep(1000);   
			//fill gr field
			 driver().findElement(By.xpath("//input[@placeholder='Enter GR Title']")).sendKeys("Demotitle 1");
				Thread .sleep(1000);     
				 driver().findElement(By.xpath("//textarea[@placeholder='Enter GR Description']")).sendKeys("This is demo 456 purpose");
					Thread .sleep(1000);
					  WebElement m=driver().findElement(By.xpath("//input[@accept='.jpg,.jpeg,.png,.pdf']"));
						Thread .sleep(11000);
				      // windows file upload with file path
			
				      m.sendKeys("Z:\\Scrnshot\\Regi02.png");

					Thread .sleep(3000);
				 driver().findElement(By.xpath("//*[@id=\"content\"]/app-gr-register/div[1]/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
							Thread .sleep(1000);
 
 
 }





}
