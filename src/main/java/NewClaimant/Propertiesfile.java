package NewClaimant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Propertiesfile {

	public static void main(String[] args) throws Exception {
		WebDriver d;
		WebDriverManager.edgedriver().setup();
		d=new EdgeDriver();
		Properties p = new Properties();
		InputStream stream = new FileInputStream("C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\src\\main\\java\\NewClaimant\\login.properties");
		//load all objects
		p.load(stream);   
		d.get(p.getProperty("url"));
		d.findElement(By.xpath(p.getProperty("username"))).sendKeys(p.getProperty("user"));
		d.findElement(By.xpath(p.getProperty("pwd"))).sendKeys(p.getProperty("pswd"));
		d.findElement(By.xpath(p.getProperty("login"))).click();

	
		
	  
	
	
	}

}
