package claimant;
import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Prgrm_meeting_filter_Admin {
	public static void main(String[] args) throws InterruptedException, IOException    {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://trti.mahamining.com/login");
		driver.manage().window().maximize();
		
		//admin login
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
	    Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
	    Thread .sleep(1000);
	    //click on login button
	    String s=JOptionPane.showInputDialog("enter your captcha");
	    
		driver.findElement(By.xpath("//input[@placeholder='Enter Captcha']")).sendKeys(s);
	    Thread .sleep(1000);
	  
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
		Thread .sleep(1000);
		// click on PM
		driver.findElement(By.xpath("//*[@id=\"heading6\"]/button/div/div[2]")).click();
	    Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"collapse6\"]/div/ul/li[1]/a")).click();
	    Thread .sleep(1000);
		//select division
	    driver.findElement(By.xpath("//ngx-select[@placeholder='Select Division']")).click();
	    Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-notice-register/div/div/div/div/div[1]/form/div/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[7]/a/span")).click();
		Thread .sleep(1000);
		//select district
	    driver.findElement(By.xpath("//ngx-select[@placeholder='Select District']")).click();
	    Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-notice-register/div/div/div/div/div[1]/form/div/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[6]/a/span")).click();
		Thread .sleep(1000);
		
		//select subdivision
	    driver.findElement(By.xpath("//ngx-select[@placeholder='Select Subdivision']")).click();
	    Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-notice-register/div/div/div/div/div[1]/form/div/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
		Thread .sleep(1000);
		
		//select Taluka
	    driver.findElement(By.xpath("//ngx-select[@placeholder='Select Taluka']")).click();
	    Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-notice-register/div/div/div/div/div[1]/form/div/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
		Thread .sleep(1000);
		
		// Enter Claim No 
	    driver.findElement(By.xpath("//input[@placeholder='Claimant Name/Claim No.']")).sendKeys("Nitin");
	    Thread .sleep(1000);
		
	    // click on search button 
	    driver.findElement(By.xpath("//*[@id=\"content\"]/app-notice-register/div/div/div/div/div[1]/form/div/div[9]/button/i")).click(); 
	    Thread .sleep(1000);
	  
	}
}