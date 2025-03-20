package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmployee extends HrBaseSetup {
	@Test
	public static void EmpAdd() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Lucky");
		driver.findElement(By.name("lastName")).sendKeys("Shrestha");
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		
		
	}

}
