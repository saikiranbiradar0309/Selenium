import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://copyright.gov.in/UserRegistration/frmNewUser.aspx");
		
		Thread.sleep(3000);
		
		WebElement titleWb = driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlTitle"));
		
		Select sel1 = new Select(titleWb);
		
		sel1.selectByIndex(1);
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtFName")).sendKeys("Saikiran");
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtLName")).sendKeys("Biradar");
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtAddress")).sendKeys("BTM layout Bengaluru");
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtCity")).sendKeys("Bengaluru");
		
		WebElement countryWb = driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlCountry"));
		
		Select sel2 = new Select(countryWb);
		
		sel2.selectByContainsVisibleText("India");
		
		Thread.sleep(3000);
		
		WebElement stateWb = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlState"));
		
		Select sel3 = new Select(stateWb);
		
		sel3.selectByValue("21");
		
		/*WebElement districtWb = driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlDistrict"));
		
		Select sel4 = new Select(districtWb);
		
		sel4.selectByContainsVisibleText("BENGALURU"); */
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtNationality")).sendKeys("INDIAN");
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtPinCode")).sendKeys("560068");
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtEmail")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtPhoneNumber")).sendKeys("9123456789");
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtMobileNum")).sendKeys("9123456789");
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtUserId")).sendKeys("saikiran8050");
		
		
		
	}
}
