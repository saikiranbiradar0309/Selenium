import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyAcademy {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("name")).sendKeys("Saikiran");
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.id("confirmbtn")).click();
		
		Alert abc = driver.switchTo().alert();
		
		String academy = abc.getText();
		
		System.out.println(academy);
		
		Thread.sleep(3000);
		
		abc.accept();
				

	}

}
