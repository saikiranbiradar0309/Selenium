import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5_ChildFrames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/frame.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Shinde Niranjan");
		
		Thread.sleep(2000);
		
		
		// First Frame
		WebElement mainframe = driver.findElement(By.xpath("//iframe[@id='mainframe']"));
		driver.switchTo().frame(mainframe);
		
		driver.findElement(By.xpath("//input[@id='add']")).sendKeys("Bengaluru");
		
		Thread.sleep(2000);
		
		
		// Switch to Default Frame
		//driver.switchTo().defaultContent();
		
		
		// IMPORTANT: Here We are not using switchTo().defaultContent() Because
		// Here there is not Second Frame, The another frame is child 
		
		Thread.sleep(2000);
		
		// Switch to Child Frame
		WebElement childBox = driver.findElement(By.xpath("//iframe[@id='child1']"));
		driver.switchTo().frame(childBox);
		
		driver.findElement(By.xpath("//input[@id='GitHub']")).click();

	}

}
