package claimant;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newclaimant 
{public static void main(String[] args) throws Exception
{ System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\Downloads\\chromedriver_win32 (1)\\crom_drvr-2\\chromedriver.exe\\");
WebDriver driver= new ChromeDriver();
//System.setProperty("webdriver.edge.driver","C:\\Users\\niting\\Downloads\\edgedriver_win64\\edgedrvr\\msedgedriver.exe\\");
//WebDriver driver= new EdgeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
driver.get("http://trti.mahamining.com/login");
Thread .sleep(1000);
// click claimant registration
driver.findElement(By.id("home_cregistration")).click();
Thread .sleep(1000);
driver.findElement(By.id("AreYouFromScheduledTribeYes")).click();
Thread .sleep(1000);
//Click to select tribe
driver.findElement(By.xpath("//*[@id=\"conditionsMdoalId\"]/form/div/div/div[2]/div[2]/div[2]/div/ngx-select/div/div[2]/div")).click();
driver.findElement(By.xpath("//*[@id=\"conditionsMdoalId\"]/form/div/div/div[2]/div[2]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[26]/a/span")).click();
//Click on submit button
driver.findElement(By.xpath("//*[@id=\"conditionsMdoalId\"]/form/div/div/div[3]/div/div/button")).click();
//Enter claimant details
driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']")).sendKeys(" Ram pawar");
Thread .sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abc12@gmail.com");
Thread .sleep(1000);
driver.findElement(By.xpath("//input[@id='genderMale']")).click();
Thread .sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Select Date Of Birth']")).click();
Thread .sleep(1000);
driver.findElement(By.xpath("//*[@id=\"main\"]/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[2]/td[4]/span")).click();
Thread .sleep(1000);
//driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).sendKeys("9730020958");
//Thread .sleep(1000);
//driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[3]/div[1]/div/button")).click();
//Thread .sleep(1000);
//driver.findElement(By.xpath("//*[@id=\"OTPSentModalId\"]/div/div/div/div/button")).click();
////Enter otp
//driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys("");
//Thread .sleep(18000);
//driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[3]/div[2]/div/button")).click();
//Thread .sleep(1000);
//ENTER ADDRESS
driver.findElement(By.xpath("//textarea[@placeholder='Enter Address']")).sendKeys("swarget415 punemanapa 411019.");
Thread .sleep(1000);
//select division field
driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[5]/div[2]/div/ngx-select/div/div[2]/div/span[1]")).click();
Thread .sleep(1000);
driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[5]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a")).click();
Thread .sleep(1000);
//click on district
driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[5]/div[3]/div/ngx-select/div/div[2]/div/span[1]")).click();
Thread .sleep(1000);
driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[5]/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a")).click();
Thread .sleep(1000);
//select00 subdivision
Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[5]/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")));  
dropdown.selectByVisibleText("Amravati");  
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[5]/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a")).click();
Thread .sleep(1000);
//select taluka
driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[5]/div[5]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
Thread .sleep(1000);
driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[5]/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
Thread .sleep(1000);
//select palika
driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[5]/div[6]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[5]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[7]/a/span")).click();
Thread.sleep(3000);
//select town/village
driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[5]/div[7]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
Thread .sleep(2000);
driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[5]/div[7]/div/ngx-select/div/ngx-select-choices/ul/li[10]/a/span")).click();
Thread .sleep(1000); 
// choose login credentials
driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("Rampawar12");
Thread .sleep(1000);
driver.findElement(By.xpath("//*[@id=\"main\"]/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[2]/div[6]/div[2]/div[1]/div[1]/div/div/button")).click();
Thread .sleep(3000); 
// create password credentials
driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Rampawar@12");
Thread .sleep(3000);
driver.findElement(By.xpath("//input[@placeholder='Enter Confirm Password']")).sendKeys("Rampawar@12");
Thread .sleep(5000);
driver.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/app-claimant-registration/div[1]/div/div/form/div/div[3]/button")).click();
Thread .sleep(3000);
//Click on home tab
driver.findElement(By.id("home_home")).click();
Thread .sleep(1000);
//Claimant login
driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("Rampawar12");
Thread .sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Rampawar@12");
Thread .sleep(3000);	
driver.findElement(By.id("home_claimant_login")).click();
Thread .sleep(1000);

Thread .sleep(7000);
driver.close();    
}
}