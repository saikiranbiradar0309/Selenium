import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5_Frames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/mainFrame.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Biradar");
		
		Thread.sleep(2000);
		
		
		// Switch to Frame
		// 1. find the xpath of the frame
		// 2. call switchTo().frame()
		WebElement iframewb = driver.findElement(By.xpath("//iframe[@id='mainframe']"));
		driver.switchTo().frame(iframewb);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='Cucumber']")).click();
		
		
		
		
	}

}
