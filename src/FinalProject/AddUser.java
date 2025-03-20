package FinalProject;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AddUser extends HrBaseSetup {
	@Test
	public static void UserAdd() throws InterruptedException {
		String Username= "luckky";
		String Password="lucky123";
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Admin']")).click();//click on admin
		driver.findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary'])[1]")).click();//click on add
		//selecting roles
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).sendKeys(Keys.ARROW_DOWN);//only this for admin
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).sendKeys(Keys.ARROW_DOWN);//both for ess
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).sendKeys(Keys.RETURN);
		
		
		//selecting status 
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).sendKeys(Keys.ARROW_DOWN);//only this for enable
		//driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).sendKeys(Keys.ARROW_DOWN);//both for disable
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).sendKeys(Keys.RETURN);

		//add employee name
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("lucky Shrestha");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.ARROW_DOWN);		
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.RETURN);
		
		//enter username and password
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(Username);		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(Password);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(Password);
		
		//click save button
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		
		Thread.sleep(5000);
		
		//logout from current user
		driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"oxd-userdropdown-link\" and text()=\"Logout\"]")).click();
		
		//login with recently created user and check if its working!!!
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")).click();


	}
	

}
