package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class DeleteEmployee extends HrBaseSetup {
	@Test
	public static void EmployeeDelete() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		
		//search by id
//		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("0370");
//		driver.findElement(By.xpath("//button[@type='submit' and contains(@class, 'oxd-button--secondary')]")).click();
		
		
		//search by name
		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("lucky");
		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys(Keys.RETURN);
		//click on search
		driver.findElement(By.xpath("//button[@type='submit' and contains(@class, 'oxd-button--secondary')]")).click();
		Thread.sleep(2000);
		//click on delete
		driver.findElement(By.xpath("//button[contains(@class, 'oxd-icon-button')]//i[contains(@class, 'bi-trash')]\r\n")).click();
		//confirm delete
		driver.findElement(By.xpath("//button[contains(@class, 'oxd-button') and contains(@class, 'oxd-button--label-danger')]")).click();
		
	}

}
