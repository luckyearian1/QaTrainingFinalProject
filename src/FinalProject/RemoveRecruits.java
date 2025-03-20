package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class RemoveRecruits extends HrBaseSetup {
	@Test
	public static void RecruitRemove() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']")).click();        

	        // Click to open the dropdown
	        By dropdownXPath = By.xpath("(//div[contains(@class, 'oxd-select-text-input')])[1]");
	        driver.findElement(dropdownXPath).click();
	        Thread.sleep(2000); // Wait for options to appear
	        
	        // Loop to move down 19 times
	        for (int i = 0; i < 19; i++) {
	            driver.findElement(dropdownXPath).sendKeys(Keys.ARROW_DOWN);
	            Thread.sleep(200); // Small delay for stability
	        }

	        // Press ENTER to select the option
	        driver.findElement(dropdownXPath).sendKeys(Keys.RETURN);
	        
	        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("ram");	
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.ARROW_DOWN);		
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.RETURN);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			//click on delete
			driver.findElement(By.xpath("//button[contains(@class, 'oxd-icon-button')]//i[contains(@class, 'bi-trash')]\r\n")).click();
			
			//confirm delete
			driver.findElement(By.xpath("//button[contains(@class, 'oxd-button') and contains(@class, 'oxd-button--label-danger')]")).click();
		

		

		
	}
}
