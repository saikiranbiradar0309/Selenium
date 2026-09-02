import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseEvents {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		Actions obj = new Actions(driver);
		
		WebElement wb = driver.findElement(By.id("doubleClickBtn"));
		
		// For DoubleCLick we use doubleClick
		obj.doubleClick(wb).perform();
		
		WebElement wb1 = driver.findElement(By.id("rightClickBtn"));
		
		// For right Click we use contextClick
		obj.contextClick(wb1).perform();
	}
}
