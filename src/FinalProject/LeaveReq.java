package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LeaveReq extends EmpBaseSetup {
		@Test
	public static void ReqLeave() throws InterruptedException {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//click on leave
				driver.findElement(By.xpath("//span[text()='Leave']")).click();
				//click on apply
				driver.findElement(By.xpath("//a[text()='Apply']")).click();
				//select leave type
				
				 By dropdownXPath = By.xpath("//div[text()='-- Select --']");
			     WebElement dropdown = driver.findElement(dropdownXPath);
			     dropdown.click();
			     Thread.sleep(2000); // Wait for options to appear
			        
			      // Select the 4th option by clicking it directly
			     By optionXPath = By.xpath("(//div[@role='option'])[2]"); // Select the 4th option
			     WebElement option = driver.findElement(optionXPath);   
			     option.click(); 
			     
			     
		     
		     
		     // First date field
		        WebElement startDate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]"));
		        startDate.click();
		        startDate.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);  // Select all + Clear
		        startDate.sendKeys("2025-25-03");
		        startDate.sendKeys(Keys.TAB);  // Move out of input field

		        // Small delay for UI update
		        Thread.sleep(500); 

		        // Second date field
		        WebElement endDate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));

		        // Stronger clearing method: Click, Clear, and Use JavaScript Executor
		        endDate.click();
		        endDate.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);  // Try normal clear
		        Thread.sleep(300);
		        
		        // Forcefully clear using JavaScript
		        ((JavascriptExecutor) driver).executeScript("arguments[0].value='';", endDate);
		        Thread.sleep(300);

		        // Enter the second date
		        endDate.sendKeys("2025-28-03");
		        endDate.sendKeys(Keys.TAB);
		        
		        //some reason for leave
		        driver.findElement(By.xpath("//textarea")).sendKeys("some private reason");
		        
		        //click on apply 
		        driver.findElement(By.xpath("//button[@type='submit']")).click();
		        
		      //to check my leaves req 
			     driver.findElement(By.xpath("//a[text()='My Leave']")).click();
		        
		        
		}

}
