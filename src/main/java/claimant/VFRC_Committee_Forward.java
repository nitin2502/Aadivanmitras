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
public class VFRC_Committee_Forward {

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
  	Thread .sleep(3000);
  	
  	d.get("http://trti.mahamining.com/ProgramMeetings");
  	d.findElement(By.xpath(" //*[@id=\"content\"]/app-notices/div[1]/div/div[2]/table/tbody/tr/td[11]/div/button/i")).click();	
	Thread .sleep(1000);
  
  	// select claim status 
  	d.findElement(By.xpath("//ngx-select [@placeholder='Select Claim Status']")).click();	
	Thread .sleep(1000);
 	d.findElement(By.xpath("//*[@id=\"UpdateProgramMeetingModal\"]/div/div/form/div[1]/div/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();	
	Thread .sleep(1000);
  	
  	//Approved claim area
	d.findElement(By.xpath("//input[@placeholder='Approved Claim Area']")).sendKeys("1.23");	
	Thread .sleep(1000);
	
	// select forward claims to committee
	d.findElement(By.xpath("//ngx-select [@placeholder='Select Committee Level']")).click();	
	Thread .sleep(1000);
 	d.findElement(By.xpath("//*[@id=\"UpdateProgramMeetingModal\"]/div/div/form/div[1]/div/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();	
	Thread .sleep(1000);
	
// enter remark 
	d.findElement(By.xpath("//textarea [@placeholder='Remark']")).sendKeys("invalid documentation ");	
	Thread .sleep(1000);
	
//Click on submit button 
	//d.findElement(By.xpath("//*[@id="UpdateProgramMeetingModal"]/div/div/form/div[2]/div/div[2]/button")).click();	
	Thread .sleep(1000);
	
  	
	}

}
