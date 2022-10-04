package NewClaimant;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class invoke extends Testng
{
   public void Class() throws Exception
   {
	   String s=JOptionPane.showInputDialog("Enter Captcha"); 
	   d().findElement(By.xpath("//input[@formcontrolname='recaptchaReactive'][1]")).sendKeys(s);
	   Thread .sleep(1000);
	   d().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
	   Thread.sleep(3000);

	   
	   
   }
}
