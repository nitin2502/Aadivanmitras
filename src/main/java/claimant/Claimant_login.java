package claimant;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
public class Claimant_login {

	public static void main(String[] args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\Downloads\\chromedriver_win32 (1)\\crom_drvr-2\\chromedriver.exe\\");
    WebDriver driver= new ChromeDriver();
    //open Browser
    driver.get("http://trti.mahamining.com/home");
	driver.manage().window().maximize();
	Thread .sleep(1000);
	driver.findElement(By.id("home_home")).click();
	//verified Claimant
//	driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("Sadashiv12");
//	Thread .sleep(1000);
//	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Sadashiv@12");
//	Thread .sleep(1000);	
//	driver.findElement(By.id("home_login")).click();
	driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("SourabhM");
	Thread .sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("SourabhM@12");
	Thread .sleep(1000);	
	driver.findElement(By.id("home_login")).click();
	
	
	}

}
