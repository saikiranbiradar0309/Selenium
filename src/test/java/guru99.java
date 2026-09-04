import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class guru99 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("Saikiran");
		
		driver.findElement(By.name("lastName")).sendKeys("Biradar");
		
		driver.findElement(By.name("phone")).sendKeys("6123456789");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("userName")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("BTM Layout Bengaluru");
		
		driver.findElement(By.name("city")).sendKeys("Bengaluru");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("state")).sendKeys("Karnataka");
		
		driver.findElement(By.name("postalCode")).sendKeys("560068");
		
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select selectCountry = new Select(country);
		
		selectCountry.selectByValue("INDIA");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Abc@123");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("Abc@123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		
		driver.close();
		
	}

}
