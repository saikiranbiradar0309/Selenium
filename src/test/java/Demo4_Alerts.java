import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4_Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		/*
		 
		// Simple or Notification Alert
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		
		String message = alt.getText();
		
		System.out.println(message);
		
		alt.accept();
		
		*/
		
		
		/*
		 
		// Confirm Alert
		
		driver.findElement(By.id("confirmButton")).click();
		
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		
		String message = alt.getText();
		
		System.out.println(message);
		
		Thread.sleep(3000);
		
		alt.dismiss();
		
		*/
		
		
		// Prompt alert
		
		driver.findElement(By.id("promtButton")).click();
		
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		
		String message = alt.getText();
		
		System.out.println(message);
		
		Thread.sleep(3000);
		
		alt.sendKeys("Saikiran");
		
		Thread.sleep(4000);
		
		alt.accept();
		
		}
}
