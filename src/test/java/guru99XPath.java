import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99XPath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Saikiran");
		
		
	}

}
