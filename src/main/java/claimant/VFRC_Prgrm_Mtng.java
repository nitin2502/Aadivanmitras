package claimant;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
public class VFRC_Prgrm_Mtng {

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
  	Thread .sleep(1000);
  	
  	// click on prgrm meeting
  	d.findElement(By.xpath("//*[@id=\"heading4\"]/button/div/div[2]")).click();		  
	Thread .sleep(1000);
	d.findElement(By.xpath("//*[@id=\"collapse4\"]/div/ul/li[1]/a")).click();		  
	Thread .sleep(1000);
  	
  	//click on create Pm
	d.get("http://trti.mahamining.com/createVerificationProgram/2/CFR_Add");
  	
  	// metng dtl
	  // enter meeting subject  
	   d.findElement(By.xpath("//*[@id=\"content1\"]/div/form/div[1]/div/ngx-select/div/div[2]/div")).click();
	   Thread.sleep(2000);
	   d.findElement(By.xpath("//*[@id=\"content1\"]/div/form/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
	   Thread.sleep(2000);
   
	   //Enter meeting discription 
	   d.findElement(By.xpath("//*[@id=\"content1\"]/div/form/div[2]/div/ngx-select/div/div[2]/div")).click();
	   Thread.sleep(2000);
	   d.findElement(By.xpath("//*[@id=\"content1\"]/div/form/div[2]/div/ngx-select/div/ngx-select-choices/ul/li/a/span")).click();
	   Thread.sleep(2000);

   //select date 
	   d.findElement(By.xpath("//input[@formcontrolname='formDate']")).sendKeys("12/10/2023");
	   Thread.sleep(2000);
	   d.findElement(By.xpath("//input[@formcontrolname='toDate']")).sendKeys("12/12/2023");
	   Thread.sleep(2000);
	   
	   // select time 
	   d.findElement(By.xpath("//input[@formcontrolname='formTime']")).sendKeys("12:10PM");
	   Thread.sleep(2000);
	   d.findElement(By.xpath("//input[@formcontrolname='toTime']")).sendKeys("08:45PM");
	   Thread.sleep(2000);
	   

	   // select meeting member
	   d.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[5]/div/input")).click();
	   Thread.sleep(2000);
	   d.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-verification-program/div[1]/div/div/div/div[2]/div/table/tbody/tr[2]/td[5]/div/input")).click();
	   

	   //click on create button
	   d.findElement(By.xpath("//*[@id=\"content\"]/app-create-verification-program/div[1]/div/div/div/div[3]/button")).click();
	      Thread.sleep(4000); 
	
  	
  	
	}

}
