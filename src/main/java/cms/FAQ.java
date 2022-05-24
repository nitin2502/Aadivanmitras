package cms;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FAQ{

@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException, IOException
{System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\Downloads\\chromedriver_win32 (1)\\crom_drvr-2\\chromedriver.exe\\");
WebDriver driver= new ChromeDriver();
driver.get("http://trti-uat.mahamining.com/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


// identify element
WebElement m=driver.findElement(By.xpath("//input[@type='file']"));

// windows file upload with file path
m.sendKeys("C:\\Users\\Pictures\\Logo.jpg");
}
}
