import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5_TwoFrames {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/twoFrame.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Saikiran Biradar");
		
		Thread.sleep(2000);
		
		// First Frame
		WebElement iframeCheckBox = driver.findElement(By.xpath("//iframe[@id='chk']"));
		driver.switchTo().frame(iframeCheckBox);
		
		driver.findElement(By.xpath("//input[@id='Cucumber']")).click();
		
		
		// IMPORTANT: Come back to main page
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(2000);
		
		// Second Frame
		WebElement iframeToolName = driver.findElement(By.xpath("//iframe[@id='topic']"));
		driver.switchTo().frame(iframeToolName);
		
		
		// DropDown
		WebElement ToolDropDown = driver.findElement(By.xpath("//select[@name='course']"));
		Select sel = new Select(ToolDropDown);
		
		sel.selectByVisibleText("Java Script Executor");

	}

}
