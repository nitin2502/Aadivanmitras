package master;

import java.io.File;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class User_SDLC {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://trti.mahamining.com/login");
		driver.manage().window().maximize();
		
		Thread .sleep(1000);	
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
		//Click on master and user tab
		
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/div/div/ul/li[4]/a")).click();
		Thread .sleep(1000);
		//select committee
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();
		Thread .sleep(1000); 
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
		//select designation
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[6]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[1]/a/span")).click();
		Thread .sleep(1000);
		//fill details
		driver.findElement(By.xpath("//input[@placeholder='पूर्ण नाव प्रविष्ट करा (इंग्रजी)']")).sendKeys("RAma name");
		Thread .sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='पूर्ण नाव प्रविष्ट करा (मराठी)']")).sendKeys("प्रविष्ट करा");
		Thread .sleep(1000);	
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//input[@placeholder='मोबाईल नंबर टाका']")).sendKeys("9730020000");
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//input[@placeholder='ईमेल प्रविष्ट करा']")).sendKeys("abcd2506@gmail.com");
		Thread .sleep(1000);	
	
		driver.findElement(By.xpath("//input[@placeholder='वापरकर्त्याचे नाव प्रविष्ट करा']")).sendKeys("abcdefghh");
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//button[@class='btn btn-main'][1]")).click();
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//textarea[@placeholder='पत्ता प्रविष्ट करा']")).sendKeys("abcdgh ,415,dsp road pune");
		Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
		Thread .sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//update record
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[1]/i")).click();
		Thread .sleep(1000);
		
		//clear record
		driver.findElement(By.xpath("//input[@placeholder='मोबाईल नंबर टाका']")).clear();
		Thread .sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='मोबाईल नंबर टाका']")).sendKeys("9365000415");
		Thread .sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='ईमेल प्रविष्ट करा']")).clear();
		Thread .sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='ईमेल प्रविष्ट करा']")).sendKeys("khjjioio@gmail.com");
		Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
		Thread .sleep(1000);
		//delete record
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[2]/i")).click();
		Thread .sleep(1000);
		driver.switchTo().alert().accept();
		Thread .sleep(3000);
		// takes screenshot
		 File  scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(scr, new File("C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Screenshot\\UserSdlc003.png"));
		// browser close
		Thread .sleep(3000);
		driver.close();   
		
		
		
		
		
	}

	private static WebElement drivr() {
		// TODO Auto-generated method stub
		return null;
	}

}
