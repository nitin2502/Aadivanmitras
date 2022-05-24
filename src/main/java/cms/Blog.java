package cms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Blog  extends Chromedriverbase 
{
@Test
public void Test1() throws Exception

{  driver().get("http://trti.mahamining.com//");
driver().manage().window().maximize();
driver().findElement(By.xpath("//*[@id=\"home_login\"]")).click();
Thread .sleep(1000);
//Admin login
driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
Thread .sleep(1000);
driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
Thread .sleep(1000);	
driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[4]/button")).click();
Thread .sleep(1000);
//click on blog tab
driver().findElement(By.xpath("//*[@id=\"headingCms\"]/button")).click();
Thread .sleep(1000);
driver().findElement(By.xpath("//*[@id=\"collapseCms\"]/div/ul/li[2]/a")).click();
Thread .sleep(1000);
//fill gr title
driver().findElement(By.xpath("//input[@placeholder='Enter Blog Title']")).sendKeys("Demotitle 1");
Thread .sleep(1000);     
 driver().findElement(By.xpath("//textarea[@placeholder='Enter Blog Description']")).sendKeys("This is demo 456 purpose");
	
	  driver().findElement(By.xpath("//*[@id=\"content\"]/app-blog-register/div[1]/div/div/div[1]/form/div/div/div[1]/div[3]/div/div/label")).sendKeys("C:/Users/niting/img/UserSdlc04.png");
	  Thread .sleep(5000);
    // windows file upload with file path

    driver().findElement(By.xpath("//*[@id=\"content\"]/app-blog-register/div[1]/div/div/div[1]/form/div/div/div[2]/button[2]")).click();

}
}