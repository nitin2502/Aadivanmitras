package claimant;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VFRC_committee_upld_document

{
    
	public static void main(String[] args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\chromedriver.exe");
    WebDriver d= new ChromeDriver();
    //open Browser
	d.manage().window().maximize();
    d.get("http://trti.mahamining.com/login");
	Thread .sleep(1000);
    // VFRC Login
	d.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("Nitin555");		  
	Thread .sleep(1000);
	d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("tin555@0209");		  
	Thread .sleep(1000);
    String s=JOptionPane.showInputDialog(" Please Enter Captcha");
    d.findElement(By.xpath("//input[@placeholder='Enter Captcha']")).sendKeys(s);
    Thread .sleep(1000);
  	d.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
  	Thread .sleep(5000);
  	
  	// click on Accept button 
  	d.findElement(By.xpath("//*[@id=\"content\"]/app-vfrc-dashboard/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[6]/span/button")).click();
  	Thread .sleep(3000);
  	
  	
 // upload document
 	 d.get("http://trti.mahamining.com/uploadClaimantDocument/13");
   
 // Click on upload button
 	
 	d.findElement(By.xpath("//*[@id=\"content\"]/app-upload-claimant-documents/div[1]/div/div/div/div/div[2]/table/tbody/tr[3]/td[5]/div/label")).click();
 	Thread .sleep(6000);
 	
 	d.findElement(By.xpath("//*[@id=\"content\"]/app-upload-claimant-documents/div[1]/div/div/div/div/div[3]/button")).click();
 	Thread .sleep(5000);
 	
	
	}	
}
