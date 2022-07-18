package master;
import java.io.File;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class User_VFRC {
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://trti.mahamining.com/login");
		driver.manage().window().maximize();
		//admin login
	    driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("admin");
	   Thread .sleep(1000);
	   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
	   Thread .sleep(1000);	
	   String s=JOptionPane.showInputDialog("enter your captcha");
	    
	  	driver.findElement(By.xpath("//input[@placeholder='Enter Captcha']")).sendKeys(s);
	      Thread .sleep(1000);
	    
	  	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
	  	Thread .sleep(1000);
		//Click on master and user tab
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/h2/button")).click();
		Thread .sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/div/div/ul/li[4]/a")).click();
		Thread .sleep(1000);
		//select committee
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[7]/a/span")).click();
		Thread .sleep(1000); 
		//select division
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[7]/a/span")).click();
		Thread .sleep(1000); 
		//select district
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[4]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
		Thread .sleep(1000); 
		//slect subdivisin
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[5]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();
		Thread .sleep(1000); 
		//select taluka
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[6]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
		Thread .sleep(1000);
		//select VFRC
		//click on add button
		//driver.findElement(By.id("home_crsu")).click();
		//Thread .sleep(1000); 
//		//Every time change vfrc name
//		driver.findElement(By.xpath("//input[@placeholder='Enter VFRC']")).sendKeys("sangol");
//		Thread .sleep(1000); 	
//		driver.findElement(By.xpath("//input[@placeholder='Select Town/Village']")).click();
//		Thread .sleep(1000); 
//		driver.findElement(By.xpath("//*[@id=\"conditionsMdoalId\"]/form/div/div/div[2]/app-shared-manage-vfrc/form/div[1]/div[1]/div/div/div[7]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
//		Thread .sleep(1000); 
//		driver.findElement(By.xpath("//*[@id=\"conditionsMdoalId\"]/form/div/div/div[2]/app-shared-manage-vfrc/form/div[2]/div/button")).click();
//		Thread .sleep(1000); 
//	
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[7]/div/ngx-select/div/div[2]/div")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[7]/div/ngx-select/div/ngx-select-choices/ul/li/a/span")).click();
		Thread .sleep(1000);
	
		//select designation
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[9]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[9]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
		Thread .sleep(1000); 
		//fill details
				driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']")).sendKeys("No name");
				Thread .sleep(1000);	
				driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).sendKeys("9365989670");
				Thread .sleep(1000);	
				driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abcd2506@gmail.com");
				Thread .sleep(1000);	
				driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("abcdefghh");
				Thread .sleep(1000);	
				driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[13]/div/div/button")).click();
				Thread .sleep(1000);	
				driver.findElement(By.xpath("//textarea[@placeholder='Enter Address']")).sendKeys("abcdgh ,415,dsp road pune");
				Thread .sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
				Thread .sleep(3000);
				driver.navigate().refresh();
				Thread .sleep(1000);
				//update record
				driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[1]/i")).click();
				Thread .sleep(1000);
				//clear record
				driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).clear();
				Thread .sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).sendKeys("9730020959");
				Thread .sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).clear();
				Thread .sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("xyxzcvv@gmail.com");
				Thread .sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
				Thread .sleep(1000);
				//delete record
				driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[2]/i")).click();
				Thread .sleep(1000);
				driver.switchTo().alert().accept();
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
