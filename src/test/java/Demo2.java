import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Demo2 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		/*
		driver.get("https://www.saucedemo.com");
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		*/
		
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Saikiran");
		
		driver.findElement(By.id("lastName")).sendKeys("Biradar");
		
		driver.findElement(By.id("userEmail")).sendKeys("biradarsaikiran4@gmail.com");
		
		driver.findElement(By.id("gender-radio-1")).click();
		
		driver.findElement(By.id("userNumber")).sendKeys("6360652590");
		
		driver.findElement(By.id("hobbies-checkbox-3")).click();
		
		driver.findElement(By.id("currentAddress")).sendKeys("Bengaluru");
		
		WebElement state = driver.findElement(By.id("react-select-3-input"));
		
		Select sel  = new Select(state);
		
		sel.selectByIndex(0);
		
		
		driver.findElement(By.id("submit")).click();
		
		
	}
}
