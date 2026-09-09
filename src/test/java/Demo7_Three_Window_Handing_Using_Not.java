// Three WIndow Handling using NOT Operator

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7_Three_Window_Handing_Using_Not {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		Thread.sleep(2000);
		// Once you open the application capture the windowID
		String parentWindowID = driver.getWindowHandle();
		
		driver.findElement(By.name("fname")).sendKeys("Saikiran");
		driver.findElement(By.name("lname")).sendKeys("Biradar");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("SauceDemo Link")).click();
		
		Thread.sleep(2000);
		
		String sauceDemoWindowId = "";
		
		// AS it will open another window for Sauce Demo
		// Now Capture all window IDs
		Set<String> allWindowIDs = driver.getWindowHandles();
		
		for (String windowId : allWindowIDs) {
			
			if(! windowId.equals(parentWindowID)) {
				
				sauceDemoWindowId = windowId;
			}
			
		}
		
		driver.switchTo().window(sauceDemoWindowId);
		
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		
		
		// Switch back to the main window
		driver.switchTo().window(parentWindowID);
		
		driver.findElement(By.name("address")).sendKeys("BTM layout");
		
		Thread.sleep(2000);
		
		// Click on ORANGE HRM Link
		driver.findElement(By.linkText("Visit Orange HRM")).click();
		
		Thread.sleep(2000);
		
		String orangeHRMWindowID = "";
		
		Set<String> allThreeWindowIDs = driver.getWindowHandles();
		
		for(String windowId : allThreeWindowIDs) {
			
			if(! windowId.equals(parentWindowID) || windowId.equals(sauceDemoWindowId)) {
				
				orangeHRMWindowID = windowId;
				
			}
		}
		
		driver.switchTo().window(orangeHRMWindowID);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
