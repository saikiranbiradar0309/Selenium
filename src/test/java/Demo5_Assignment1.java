import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5_Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://praf002.github.io/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Dattatry");
		
		Thread.sleep(2000);
		
		// First Frame
		WebElement mobileFrame = driver.findElement(By.xpath("//iframe[@id='mobileFrame']"));
		driver.switchTo().frame(mobileFrame);
		
		driver.findElement(By.xpath("//input[@name='mob']")).sendKeys("9123325643");
		
		
		Thread.sleep(2000);
		
		
		// Switch to Child
		WebElement checkBoxChild = driver.findElement(By.xpath("//iframe[@id='showcheckbox']"));
		driver.switchTo().frame(checkBoxChild);
		
		driver.findElement(By.xpath("//input[@id='TestNG']")).click();
		
		
		Thread.sleep(2000);
		
		
		// Switch to Default Frame
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(3000);
		
		
		// Second Frame
		WebElement addressFrame = driver.findElement(By.xpath("//iframe[@id='addressframe']"));
		driver.switchTo().frame(addressFrame);
		
		driver.findElement(By.xpath("//input[@name='add']")).sendKeys("Bhalki");
		
		Thread.sleep(2000);
		
		
		// Switch to Child
		WebElement toolFrame = driver.findElement(By.xpath("//iframe[@id='toolframe']"));
		driver.switchTo().frame(toolFrame);
		
		Thread.sleep(2000);
		
		
		// Select DropDown
		WebElement toolDropDown =driver.findElement(By.xpath("//select[@id='course']"));
		Select sel = new Select(toolDropDown);
		
		sel.selectByVisibleText("BDD Framework");
		
		
		Thread.sleep(2000);
		
		// Switch to Another Child
		WebElement seleniumFrame = driver.findElement(By.xpath("//iframe[@id='seleniumFrame']"));
		driver.switchTo().frame(seleniumFrame);
		
		driver.findElement(By.linkText("Selenium")).click();

	}

}
