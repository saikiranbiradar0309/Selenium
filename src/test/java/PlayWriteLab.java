import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PlayWriteLab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://playwrightlab.github.io/");
		
		Thread.sleep(3000);
		
		WebElement wb1 = driver.findElement(By.id("cascadeContinent"));
		
		Select sl1 = new Select(wb1);
		
		sl1.selectByIndex(1);
		
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.id("cascadeCountry"));
		
		Select sl2 = new Select(country);
		
		sl2.selectByVisibleText("India");
		
		WebElement city = driver.findElement(By.id("cascadeCity"));
		
		Select sl3 = new Select(city);
		
		sl3.selectByValue("delhi");

	}

}
