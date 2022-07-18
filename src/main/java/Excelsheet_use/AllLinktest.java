package Excelsheet_use;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import old_Claim_IFR.Thanedlc;

public class AllLinktest extends Thanedlc
{

	
	
	{
		 
		 //Get list of web-elements with tagName  - a
		 List<WebElement> allLinks = driver().findElements(By.tagName("a"));
		 
		 //Traversing through the list and printing its text along with link address
		 for(WebElement link:allLinks){
		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
		 }
		 
		 //Commenting driver.quit() for user to easily verify the links
		 //driver.quit();
		 } 
		 
		

	}


