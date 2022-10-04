package master;
import java.io.File;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class User_VFRC {
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
	     String alertMessage="";
	  
	    driver.get("http://trti.mahamining.com/login");
		driver.manage().window().maximize();
		//admin login
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
	   Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
	    Thread .sleep(1000);
	   String s=JOptionPane.showInputDialog("enter your captcha");
	    
	  	driver.findElement(By.xpath("//input[@placeholder='कॅप्चा प्रविष्ट करा']")).sendKeys(s);
	      Thread .sleep(1000);
	    
	  	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
	  	Thread .sleep(1000);
	  	
	 
	  	
	  //Selection of master
  		driver.findElement(By.xpath("//*[@id=\"heading1\"]/button/div/div[2]")).click();
  		Thread .sleep(1000);
		
  		
  		
  		
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/div/div/ul/li[4]/a")).click();
		Thread .sleep(1000);
		//select committee
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[6]/a/span")).click();
		Thread .sleep(1000);
		
		Actions a = new Actions(driver);
	  	  //scroll down a page
	  	  a.sendKeys(Keys.PAGE_DOWN).build().perform();
	  	  //scroll up a page
	  	  
	  	  
		//select division
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[6]/a/span")).click();
		Thread .sleep(1000); 
		//select district
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[4]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
		Thread .sleep(1000); 
		//slect subdivisin
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[5]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
		Thread .sleep(1000); 
		//select taluka
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[6]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[1]/a/span")).click();
		Thread .sleep(1000);
		
	
		
		//select VFRC
		//click on add button
	     driver.findElement(By.id("home_crsu")).click();
		Thread .sleep(1000); 	//Every time change vfrc name
	    driver.findElement(By.xpath("//input[@placeholder='VFRC प्रविष्ट करा']")).sendKeys("sangol");
	   Thread .sleep(1000); 	
	   driver.findElement(By.xpath("//input[@placeholder='शहर/गाव निवडा']")).click();
		Thread .sleep(1000); 
		
	
		driver.findElement(By.xpath("//*[@id=\"conditionsMdoalId\"]/form/div/div/div[2]/app-shared-manage-vfrc/form/div[1]/div[1]/div/div/div[7]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"conditionsMdoalId\"]/form/div/div/div[2]/app-shared-manage-vfrc/form/div[2]/div/button[2]")).click();
		Thread .sleep(1000); 
		
		
		driver.findElement(By.xpath("//*[@id=\"conditionsMdoalId\"]/form/div/div/div[1]/button")).click();
		Thread .sleep(1000); 

		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[7]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[7]/div/ngx-select/div/ngx-select-choices/ul/li/a/span")).click();
		Thread .sleep(1000);
		
		
		
		//select designation
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[9]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[9]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
		Thread .sleep(1000); 
		
		
		//fill details
				driver.findElement(By.xpath("//input[@placeholder='पूर्ण नाव प्रविष्ट करा (इंग्रजी)']")).sendKeys("RAma name");
				Thread .sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='पूर्ण नाव प्रविष्ट करा (मराठी)']")).sendKeys("प्रविष्ट करा");
				Thread .sleep(1000);	
				driver.findElement(By.xpath("//input[@placeholder='मोबाईल नंबर टाका']")).sendKeys("9365955555");
				Thread .sleep(1000);	
				driver.findElement(By.xpath("//input[@placeholder='ईमेल प्रविष्ट करा']")).sendKeys("abcd2506@gmail.com");
				Thread .sleep(1000);	
				driver.findElement(By.xpath("//input[@placeholder='वापरकर्त्याचे नाव प्रविष्ट करा']")).sendKeys("abcdefghh");
				Thread .sleep(1000);	
				driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[14]/div/div/button")).click();
				Thread .sleep(1000);	
			
				
			
				driver.findElement(By.xpath("//textarea[@placeholder='पत्ता प्रविष्ट करा']")).sendKeys("abcdgh ,415,dsp road pune");
				Thread .sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
				Thread .sleep(3000);
				driver.navigate().refresh();
				Thread .sleep(1000);
				//update record
				driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[1]/i")).click();
				Thread .sleep(1000);
				//clear record
				driver.findElement(By.xpath("//input[@placeholder='मोबाईल नंबर टाका']")).clear();
				Thread .sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='मोबाईल नंबर टाका']")).sendKeys("9730020111");
				Thread .sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='ईमेल प्रविष्ट करा']")).clear();
				Thread .sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='ईमेल प्रविष्ट करा']")).sendKeys("xyxzckk@gmail.com");
				Thread .sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
				Thread .sleep(1000);
				//delete record
				driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[2]/i")).click();
				Thread .sleep(1000);
				alertMessage = driver.switchTo().alert().getText();
				driver.switchTo().alert().accept();
				System.out.println(alertMessage);
				Thread .sleep(1000);
				// takes screenshot
				//only mobNo change user register from can accept all details
				 File  scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					Files.copy(scr, new File("C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Screenshot\\UserVFRC02.png"));
		
		// browser close
		 Thread .sleep(2000);
	  driver.close();   
	}

}
