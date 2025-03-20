package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteUser extends HrBaseSetup {
	
	@Test
	public static void UserDelete() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Admin']")).click();//click on admin
		
		//search user
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("lucky");
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(2000);
		
		//click on delete
		driver.findElement(By.xpath("//button[contains(@class, 'oxd-icon-button')]//i[contains(@class, 'bi-trash')]\r\n")).click();
		
		//confirm delete
		driver.findElement(By.xpath("//button[contains(@class, 'oxd-button') and contains(@class, 'oxd-button--label-danger')]")).click();
	}
}
