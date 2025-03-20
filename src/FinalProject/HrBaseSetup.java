package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HrBaseSetup {
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static ChromeDriver driver;

	@BeforeSuite	
		public static void DriverSetup() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			login();
						
		}
		public static void login() {
			String Username="Admin";
			String Password="admin123";
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.name("username")).sendKeys(Username);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")).click();
			
		}
		@AfterSuite
		public static void close() throws InterruptedException {
			Thread.sleep(7000);
			driver.close();
		}
	
}
