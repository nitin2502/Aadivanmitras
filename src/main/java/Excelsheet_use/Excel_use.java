package Excelsheet_use;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Excel_use
{
	File f;
	FileInputStream fis;
	XSSFWorkbook w;
	XSSFSheet s;
	XSSFRow r;
	XSSFCell c;
	int ro,co;
	WebDriver d;
	

@BeforeMethod
public void beforeMethod() throws Exception {
	  f= new File("C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Excelfile\\Book1.xlsx");
	  fis= new FileInputStream(f);
	  w= new XSSFWorkbook(fis);
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\chromedriver.exe");
	 d=new ChromeDriver();
	 d.manage().window().maximize();
	 d.get("http://demo.consultbuddy.com/consultant-registration");
}
  @Test
  public void f() {
	  s=w.getSheetAt(0);
	  for(ro=0;ro<=4;ro++) 	 { 		
		  r=s.getRow(ro); 
	  for(co=0;co<=4;co++) 		
	  { 			
		  c=r.getCell(co); 
		if(co==0) {
		  String name1=c.getStringCellValue();
	  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name1);
		}
		else {
			
		}
		if(co==10) {
			String name2=c.getStringCellValue();
			  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name2);
			
		}
		else {}
		if(co==5) {
			String name2=c.getStringCellValue();
			  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name2);
		}
	  }
	
	  }
	  }
	  
  @AfterMethod
  public void afterMethod() throws Exception {
	  Thread.sleep(5000);
	  d.close();
  
  }

}  
	
	

