package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddEntitlement extends HrBaseSetup {
		@Test
		public static void EntilemetAdd() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//click up to add entitlement
			driver.findElement(By.xpath("//a[contains(@class, 'oxd-main-menu-item') and span[text()='Leave']]")).click();
			driver.findElement(By.xpath("//span[contains(text(), 'Entitlements')]")).click();
			driver.findElement(By.xpath("//a[text()='Add Entitlements']")).click();
			
			//add entilement form fill
			//select individual employee
			driver.findElement(By.xpath("//label[input[@type='radio' and @value='0']]")).click();
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("lucky shrestha");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.RETURN);
			
			//selecting leave type and number of days to be add in entitlements
			 

			 By dropdownXPath = By.xpath("//div[contains(@class, 'oxd-select-text')]");
		     WebElement dropdown = driver.findElement(dropdownXPath);
		     dropdown.click();
		     Thread.sleep(2000); // Wait for options to appear
		        
		      // Select the 4th option by clicking it directly
		     By optionXPath = By.xpath("(//div[@role='option'])[5]"); // Select the 4th option
		     WebElement option = driver.findElement(optionXPath);   
		     option.click();        
		     //adding days of entittlement
		     driver.findElement(By.xpath("(//input[contains(@class, 'oxd-input')])[2]")).sendKeys("25.00");
		     
		     //click on save
		     driver.findElement(By.xpath("//button[@type='submit']")).click();
		     
		     //confirmation 
		     driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-button-margin']")).click();
		     
		     
			
		}

}
