package claimant;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Claimnt_registration {

	public static void main(String[] args) throws Exception
	{  System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\Downloads\\chromedriver_win32 (1)\\crom_drvr-2\\chromedriver.exe\\");
	     WebDriver driver= new ChromeDriver();
	     driver.get("http://trti.mahamining.com/login");
		driver.manage().window().maximize();
		Thread .sleep(1000);
		// click claimant registration
		driver.findElement(By.id("home_cregistration")).click();
		Thread .sleep(1000);
		driver.findElement(By.id("AreYouFromScheduledTribeYes")).click();
		Thread .sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/app-claimant-registration/div[3]/form/div/div/div[2]/div[2]/div[2]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/app-claimant-registration/div[3]/form/div/div/div[2]/div[2]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"conditionsMdoalId\"]/form/div/div/div[3]/div/div/button")).click();
		// Enter data into the field
		driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']")).sendKeys("Nitin Ghorpade");
		Thread .sleep(1000);
		driver.findElement(By.id("genderMale")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nitinghorpade2502@gmail.com");
		Thread .sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[2]/div[2]/div/input")).click();
		Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[3]/td[4]/span")).click();
		Thread .sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).sendKeys("7776808501");
		Thread .sleep(1000);
	
		driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[4]/div/div/textarea")).sendKeys("sadashivv peth, pune-411019,");
		Thread .sleep(1000);
	
		driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("NitinghrrG");
		Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[6]/div[2]/div[1]/div[1]/div/div/button")).click();
		Thread .sleep(1000);
		// create password credentials
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("NitinGg@2534");
		Thread .sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Confirm Password']")).sendKeys("NitinG@2534");
		Thread .sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[3]/button")).click();	
		//Thread .sleep(3000);
		File  scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(scr, new File("Z:\\Scrnshot\\Regi02.png"));
	
	//driver.close();
	Thread .sleep(3000);
	//driver.close();    
	}  
	
	
	
	
}
 