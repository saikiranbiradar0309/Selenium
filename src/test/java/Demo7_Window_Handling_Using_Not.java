// Window Handling By Iterating the all WindowID and by checking existing windowID is
// present or not there

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7_Window_Handling_Using_Not {

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
		
	}

}
