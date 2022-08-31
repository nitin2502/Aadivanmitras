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
public class Claimant_login {

	public static void main(String[] args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\chromedriver.exe");
    WebDriver d= new ChromeDriver();
    //open Browser
	d.manage().window().maximize();
    d.get("http://trti.mahamining.com/home");
	Thread .sleep(1000);
	d.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("NITI87471");
	Thread .sleep(1000);
	d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("DF11F3F3");
	Thread .sleep(1000);	
	d.findElement(By.id("home_claimant_login")).click();
	Thread .sleep(1000);	
	//  Click on new forest right claim
	d.findElement(By.xpath("//*[@id=\"content\"]/app-claimant-dashboard/div[1]/div/div/div[2]/div/a")).click();
	Thread .sleep(1000);	
	//claim details
	d.findElement(By.xpath("//input[@placeholder='Aadhar Number']")).sendKeys("596271010532");
	Thread .sleep(1000);	
	d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[1]/div/div/button")).click();
	Thread .sleep(1000);	
	
	//radio selection
    d.findElement(By.name("roCWH")).click();
    Thread.sleep(1000);
    d.findElement(By.name("roNCNP")).click();
    Thread.sleep(1000);
    d.findElement(By.name("roPESA")).click();
    Thread.sleep(1000);	
	
    //Area details
    d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[4]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread.sleep(2000);
    d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
    Thread.sleep(2000);
    //selct taluka
    d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[5]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread.sleep(2000);
    d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
    Thread.sleep(2000);
   //select town /village
    d.findElement(By.xpath("//ngx-select[@placeholder='Select Village']")).click();
    Thread.sleep(2000);
    d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[117]/a/span")).click();
    Thread.sleep(2000);
   //select panchayat
    d.findElement(By.xpath("//ngx-select[@placeholder='Select Grampanchayat']")).click();
    Thread.sleep(2000); 
    d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[7]/ngx-select/div/ngx-select-choices/ul/li[106]/a/span")).click();
    Thread.sleep(2000);
    //Pada
    d.findElement(By.xpath("//input[@placeholder='Enter Pada']")).sendKeys("ketur,vangi");  
    Thread .sleep(2000); 
    // Enter aDDRESS
    d.findElement(By.xpath("//textarea[@placeholder='Enter Address']")).sendKeys("    Swarget , pune. pin-413209   rejected due to Document 75(a), 75(B ) not updated ");  
    Thread .sleep(2000); 
    
    //Basic details
    //Claimant name(marathi)
    d.findElement(By.xpath("//input[@placeholder='Claimant Name (Marathi)']")).sendKeys("सौमनाज");
    Thread .sleep(2000); 
    //father name
    d.findElement(By.xpath("//input[@placeholder='Father Name']")).sendKeys("R");
    Thread .sleep(2000); 
    
    //mob no
    d.findElement(By.id("mobile_id")).sendKeys("9638521590");  
    Thread .sleep(2000); 
    //email
    d.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("xyzd123@gmail.com");  
    Thread .sleep(2000); 
    
    //claimant category
   d.findElement(By.xpath("//ngx-select[@placeholder='Select Category']")).click();  
    Thread .sleep(1000);
   d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[8]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();  
    Thread .sleep(1000);
  //claimant caste
   d.findElement(By.xpath("//ngx-select[@placeholder='Select Caste']")).click();  
    Thread .sleep(1000);
   d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[9]/div/ngx-select/div/ngx-select-choices/ul/li[8]/a/span")).click();  
    Thread .sleep(1000);
    
 //martial status
    //unmarried
   d.findElement(By.id("maritalstatus2")).click();  
    Thread .sleep(2000);
    //click on married
   d.findElement(By.id("maritalstatus1")).click();  
    Thread .sleep(2000);
   //spouse name 
   d.findElement(By.xpath("//input[@placeholder='Spouse Name']")).sendKeys("Zansi");  
    Thread .sleep(2000);
   
    //spousecategory
   d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[12]/div/ngx-select/div/div[2]/div/span[1]/span")).click();  
    Thread .sleep(1000);
   d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[12]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();  
    Thread .sleep(1000);
  //spouse  caste
   d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[13]/div/ngx-select/div/div[2]/div")).click();  
    Thread .sleep(1000);
   d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[13]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();  
     Thread .sleep(1000);
   
     
     //dependant family member3
     d.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("seeta");  
     Thread .sleep(2000); 
     //selectgender
     d.findElement(By.id("genderFamily2")).click();  
     Thread .sleep(2000); 
     //enterage
     d.findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys("55");  
     Thread .sleep(2000);  
  //relationclimant
     d.findElement(By.xpath("//ngx-select[@placeholder='Select Relationship']")).click();  
     Thread .sleep(1000);
     d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();  
      Thread .sleep(1000);  
  //add
      d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[5]/button")).click();  
      Thread .sleep(1000);
     
      
//Encroachment Details
    d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[5]/div[1]/div[1]/div/div[2]/div/ngx-select/div/div[2]/div")).click();  
    Thread .sleep(1000);
    d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[5]/div[1]/div[1]/div/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();  
     Thread .sleep(1000);
                        
//compartment no
    d.findElement(By.xpath("//input[@placeholder='Compartment No']")).sendKeys("123/abd");  
    Thread .sleep(2000);
    
    //survey no 
    d.findElement(By.xpath("//input[@placeholder='Enter Survey No./Gat No.']")).sendKeys("123/A,125/b");  
    Thread .sleep(2000);      
     
    //ToTAL AREA
    d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[6]/div/div/div[2]/div/div/input")).sendKeys("1.5");  
    Thread .sleep(2000); 
   
    //CLAIMED AREA 
    d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[7]/div/div/div[2]/div/div/input")).sendKeys("33");  
    Thread .sleep(2000); 
      
    //Boundary of Claimed Space
    d.findElement(By.xpath("//input[@placeholder='To The East']")).sendKeys("Mandir");  
    Thread .sleep(2000); 
    d.findElement(By.xpath("//input[@placeholder='To The West']")).sendKeys("school");  
    Thread .sleep(2000); 
    d.findElement(By.xpath("//input[@placeholder='To The North']")).sendKeys("playground");  
    Thread .sleep(2000); 
    d.findElement(By.xpath("//input[@placeholder='To The South']")).sendKeys("River");  
    Thread .sleep(2000);   
    
    // Click on create case button
    d.findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[9]/div/button[2]")).click();  
    Thread .sleep(1000); 
  
  
   

    d.findElement(By.xpath("//*[@id=\"ConfirmModal\"]/div/div/div[2]/button[2]")).click();  
    Thread .sleep(2000);
     d.findElement(By.xpath(" //*[@id=\"ConfirmDocumentModal\"]/div/div/div[2]/button[1]")).click();  
    Thread .sleep(5000);
    
    
    d.switchTo().newWindow(WindowType.WINDOW);
    d.get("https://trti.mahamining.com/login");

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
    
    
    
   
    
    
    
	}

}
