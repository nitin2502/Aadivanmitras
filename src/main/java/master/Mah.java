package master;

import java.io.File;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Mah {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\chromedriver.exe");
	    WebDriver d= new ChromeDriver();
	    d.get("http://demo.mahamining.com/");
        Thread.sleep(2000);
        d.manage().window().maximize();
        Thread.sleep(2000);
        d.navigate().refresh();
        Thread.sleep(2000);
        d.findElement(By.id("lnkLoginNew")).click();
        Thread.sleep(2000);
        d.findElement(By.id("username")).sendKeys("admin");
        d.findElement(By.id("password")).sendKeys("goldmine");
        Thread.sleep(2000);
    	  String s=JOptionPane.showInputDialog("enter your captcha");
    	
    	d.findElement(By.xpath("//input[@placeholder='Enter Captcha']")).sendKeys(s);
	      Thread .sleep(1000);
	      
    	   d.findElement(By.xpath("/html/body/div[4]/div[2]/div[6]/div/input")).click();
    	 Thread .sleep(1000);
    	
    d.findElement(By.id("loginuser")).click();
    Thread.sleep(3000);
    d.findElement(By.xpath("/html/body/div[2]/div/nav/div/div[3]/div/div[1]/div/ul/li[5]/a/i/img")).click();
    Thread.sleep(3000);
    d.findElement(By.xpath("/html/body/div[2]/div/nav/div/div[3]/div/div[1]/div/ul/li[5]/div/ul/li[1]/a")).click();
    Thread.sleep(3000);
    d.findElement(By.className("UserTypeId")).click();
    Thread.sleep(3000);
    d.findElement(By.xpath("//*[@id=\"dataFormContainer\"]/div[1]/div[2]/select/option[5]")).click();
    Thread.sleep(2000);
    d.findElement(By.xpath("//*[@id=\"dataFormContainer\"]/div[2]/div[2]/select/option[1]")).click();
    Thread.sleep(2000);
	  d.findElement(By.xpath("//*[@id=\"dataFormContainer\"]/div[8]/div[2]/select/option[1]")).click();
	  Thread.sleep(2000);
	  d.findElement(By.name("divisionid")).click();
	  Thread.sleep(2000);
	 //district
	  d.findElement(By.xpath("//*[@id=\"dataFormContainer\"]/div[9]/div[2]/select/option[4]")).click();
	 Thread.sleep(2000);
	//owner/lessee
	 d.findElement(By.xpath("//*[@id=\"dataFormContainer\"]/div[10]/div[2]/select/option[5]")).click();
	 Thread.sleep(3000);
	
	 d.findElement(By.name("ownerID")).click();
	 Thread.sleep(3000);

	 d.findElement(By.xpath("//*[@id=\"dataFormContainer\"]/div[15]/div[2]/div/select/option[4]")).click();
	 Thread.sleep(3000);
	Thread .sleep(15000);
	//d.close();
	
	}
}
