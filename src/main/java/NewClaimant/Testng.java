package NewClaimant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Testng 

{
	protected ThreadLocal<ChromeDriver>d=new ThreadLocal<>();
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		 d.set(new ChromeDriver());
		 d().get("http://trti.mahamining.com/login");
		
		
	}
	
	public WebDriver d()
	{
		
		return d.get();
	}

}