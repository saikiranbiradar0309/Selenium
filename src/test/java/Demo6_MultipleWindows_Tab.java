import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6_MultipleWindows_Tab {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		Thread.sleep(2000);
		
		
		// Capture Current Window ID
		String parentWindowID = driver.getWindowHandle();
		
		
		// Adding Basic Details
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Saikiran");
		
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Biradar");
		
		
		Thread.sleep(2000);
		
		//  FInd the link with Free CRM Link and click on it
		driver.findElement(By.linkText("Free CRM Link")).click();
		
		
		// capture all window Ids using getWindowHandles()  method
		Set<String> allWindowIDs = driver.getWindowHandles();
		
		
		
		for(String windowId : allWindowIDs) {
			
			//switch focus to both windows
			driver.switchTo().window(windowId);
			
			//capture window title
			String title = driver.getTitle();
			
			//capture window title contains expected window title is present or not?
			if(title.contains("FreeCRM")) {
				
				//break the loop (Don't execute next iterations)
				break;
			}
			
			
		}
		
		
		Thread.sleep(2000);
		
		// Locate and enter values
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("biradarsaikiran4@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc@123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		Thread.sleep(2000);
		
		// Switch back to main window
		driver.switchTo().window(parentWindowID);
		
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("BTM layout Bengaluru");

	}

}
