/**
 * 
 */
package NewClaimant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author niting
 *
 */
public class loginrun 
{


	WebDriver d;
	@BeforeTest
	public void setupbrowser( String Link)
	{
		
	     WebDriverManager.edgedriver().setup();
	        d =new EdgeDriver();
	        d.get(Link);;
	        System.out.println(d.getTitle());
	        
	   	     System.out.println(d.getCurrentUrl());
	   	     
	   	     System.out.println(d.hashCode());
	   	     
	   	     System.out.println(d.getClass());
	   	     
	   	     System.out.println(d.equals(Link));
	   	     
	   	 
	}
	public void login(String username ,String pwd) 
	
	{
	d.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys(username);
            
	d.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys(pwd);
	
	
	}
	
	@Test
	public static void main(String[] args) 
	{
		loginrun k=new loginrun();
		k.setupbrowser(  "http://trti.mahamining.com/login");
		k.login("admin", "admin");
		
	}
	
}
