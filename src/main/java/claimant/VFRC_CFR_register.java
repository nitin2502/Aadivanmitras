package claimant;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VFRC_CFR_register
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
	d.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("NitinG333");		  
	Thread .sleep(1000);
	d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("tinG333@0209");		  
	Thread .sleep(1000);
    String s=JOptionPane.showInputDialog(" Please Enter Captcha");
    d.findElement(By.xpath("//input[@placeholder='Enter Captcha']")).sendKeys(s);
    Thread .sleep(1000);
  	d.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
  	Thread .sleep(1000);
	
  	// Click on CFR register
  	d.findElement(By.xpath("//*[@id=\"heading2\"]/button/div/div[2]")).click();
  	Thread .sleep(1000);
  	d.findElement(By.xpath("//*[@id=\"collapse2\"]/div/ul/li[1]/a")).click();
  	Thread .sleep(1000);
	
  	// claim Details 
  //radio selection
    d.findElement(By.name("roCWH")).click();
    Thread.sleep(1000);
    d.findElement(By.name("roPVTG")).click();
    Thread.sleep(1000);
    d.findElement(By.xpath("//*[@id=\"content\"]/app-cfr-register/div[1]/div/div/div/div/div/div/form/div/div[1]/div[3]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread.sleep(1000);
    d.findElement(By.xpath("//*[@id=\"content\"]/app-cfr-register/div[1]/div/div/div/div/div/div/form/div/div[1]/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
    Thread.sleep(1000);
    
    d.findElement(By.name("roNCNP")).click();
    Thread.sleep(1000);	
    d.findElement(By.name("roPESA")).click();
    Thread.sleep(1000);	
	
  	//Area details
  
   //select town /village
    d.findElement(By.xpath("//*[@id=\"content\"]/app-cfr-register/div[1]/div/div/div/div/div/div/form/div/div[2]/div[6]/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread.sleep(2000);
    d.findElement(By.xpath("//*[@id=\"content\"]/app-cfr-register/div[1]/div/div/div/div/div/div/form/div/div[2]/div[6]/ngx-select/div/ngx-select-choices/ul/li[117]/a/span")).click();
    Thread.sleep(2000);
   //select panchayat
    d.findElement(By.xpath("//*[@id=\"content\"]/app-cfr-register/div[1]/div/div/div/div/div/div/form/div/div[2]/div[7]/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread.sleep(2000); 
    d.findElement(By.xpath("//*[@id=\"content\"]/app-cfr-register/div[1]/div/div/div/div/div/div/form/div/div[2]/div[7]/ngx-select/div/ngx-select-choices/ul/li[106]/a/span")).click();
    Thread.sleep(2000);
    //Pada
    d.findElement(By.xpath("//input[@placeholder='Enter Pada']")).sendKeys("ketur,vangi");  
    Thread .sleep(2000); 
    // Enter aDDRESS
    d.findElement(By.xpath("//textarea[@placeholder='Enter Address']")).sendKeys("   Swarget , pune. pin-413209   rejected due to Document 75(a), 75(B ) not updated ");  
    Thread .sleep(2000); 
  	
  	// basic details
    d.findElement(By.xpath("//input[@placeholder='Name of CFR Village']")).sendKeys("CFR Test");  
    Thread .sleep(2000);
    
    // Claimed area details 
    d.findElement(By.xpath("//input[@placeholder='Compartment No']")).sendKeys("12345");  
    Thread .sleep(1000);
    
    d.findElement(By.xpath("//input[@placeholder='Enter Survey No./Gat No.']")).sendKeys("123/ab,542/Cad");  
    Thread .sleep(1000);
	
    d.findElement(By.xpath("//*[@id=\"content\"]/app-cfr-register/div[1]/div/div/div/div/div/div/form/div/div[5]/div/div/div[2]/div/div/input")).sendKeys("1.5");  
    Thread .sleep(1000);
  
  
    //Boundary of Claimed Space
    d.findElement(By.xpath("//input[@placeholder='To The East']")).sendKeys("Mandir");  
    Thread .sleep(1000); 
    d.findElement(By.xpath("//input[@placeholder='To The West']")).sendKeys("school");  
    Thread .sleep(1000); 
    d.findElement(By.xpath("//input[@placeholder='To The North']")).sendKeys("playground");  
    Thread .sleep(1000); 
    d.findElement(By.xpath("//input[@placeholder='To The South']")).sendKeys("River");  
    Thread .sleep(1000);   
    
    // Remark
    d.findElement(By.xpath("//textarea[@placeholder='Remark']")).sendKeys("12345");  
    Thread .sleep(1000);
    
    // Click on create case button
    d.findElement(By.xpath("//*[@id=\"content\"]/app-cfr-register/div[1]/div/div/div/div/div/div/form/div/div[10]/div/button[2]")).click();  
    Thread .sleep(1000); 
   
    d.findElement(By.xpath("//*[@id=\"ConfirmModal\"]/div/div/div[2]/button[2]")).click();  
    Thread .sleep(2000);
     d.findElement(By.xpath(" //*[@id=\"ConfirmDocumentModal\"]/div/div/div[2]/button[1]")).click();  
    Thread .sleep(5000);
   
   
    
	}
}
