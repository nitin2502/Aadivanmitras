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
public class VFRC_updt_atndnc {

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
  	
  	d.get("http://trti.mahamining.com/ProgramMeetingDetails/6");
  	//meeting conducted status
  	 d.findElement(By.xpath("//*[@id=\"inlineRadio1\"]")).click();
     Thread .sleep(1000);
	
	// select Attendence
     d.findElement(By.xpath("//*[@id=\"sectionToPrint\"]/div/div/table/tbody/tr[1]/td[5]/select")).click();
     Thread .sleep(1000);
   	d.findElement(By.xpath("//*[@id=\"sectionToPrint\"]/div/div/table/tbody/tr[1]/td[5]/select/option[2]")).click();
   	Thread .sleep(3000);
	
   	// upload Attendencee
    d.findElement(By.xpath("//*[@id=\"sectionToPrint\"]/div/div/div[3]/div/div/label")).click();
    Thread .sleep(9000);
	
	//remark
    d.findElement(By.xpath("//*[@id=\"sectionToPrint\"]/div/div/div[4]/textarea")).sendKeys("1245abgh");
    Thread .sleep(1000);
	
	// update attendence
    d.findElement(By.xpath("//*[@id=\"content\"]/app-notice-detail/div[1]/div/div[2]/button")).click();
   	Thread .sleep(3000);
    

    
	}

}
