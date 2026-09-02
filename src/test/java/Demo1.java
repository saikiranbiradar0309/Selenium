import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
		
		// in driver.get method we can add any URL you want to visit
		//driver.get("https://www.amazon.in");
		
		// Getting the page title with getTitle
		String googleTitle = driver.getTitle();
		System.out.println("Google Title: " + googleTitle);
		
		
		// Get Current URL with getCurrentURL
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		// Navigates from google to naukri.com
		driver.navigate().to("https://www.naukri.com");
		
		
		// When we used navigate to we moved from google to naukri so when we 
		// use navigate back what it will do is first we will go from google to naukri
		// then we will navigate back from naukri to google
		driver.navigate().back();
		
		
		// When we used navigate to we moved from google to naukri so when we 
		// use navigate back what it will do is first we will go from google to naukri
		// then we will navigate back from naukri to google and after that 
		// google to naukri
		driver.navigate().forward();
		
		
		// It will make sure the application will sleep for 6 Sec
		// NOTE: If you're using sleep always use the class with 
		// throws InterruptedException
		Thread.sleep(6000);
		
		
		// It will refresh our page
		driver.navigate().refresh();
		
		
		// minimizes the browser
		driver.manage().window().minimize();
		
		// maximizes the browser
		driver.manage().window().maximize();
		
		// makes the browser full screen
		driver.manage().window().fullscreen();
		
		
		//Closes the current browser window/tab controlled by WebDriver.
		//driver.close();
		
		//Terminates the WebDriver session and closes all browser windows/tabs associated with it.
		driver.quit();
		}
}
