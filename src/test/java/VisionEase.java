import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VisionEase {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://visionease.com/about-us/contact/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("input_3_1")).sendKeys("Saikiran");
		
		driver.findElement(By.name("input_2")).sendKeys("CloudNexora");
		
		driver.findElement(By.id("input_3_9")).sendKeys("8123443212");
		
		driver.findElement(By.name("input_10")).sendKeys("abc@gmail.com");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("input_3_11")).sendKeys("Nothing");
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
