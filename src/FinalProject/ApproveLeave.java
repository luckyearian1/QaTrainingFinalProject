package FinalProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ApproveLeave extends HrBaseSetup {
		@Test
		public static void LeaveApprove() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//click on leave
			driver.findElement(By.xpath("//a[span[text()='Leave']]")).click();
			//click on leave list
			driver.findElement(By.xpath("//a[text()='Leave List']")).click();
			//search with employee name
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("lucky shrestha");
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.RETURN);
			//click on search
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			//approve leave
			driver.findElement(By.xpath("//button[text()=' Approve ']")).click();
			
			//reject leave
			
			//driver.findElement(By.xpath("//button[text()=' Reject ']")).click();

			
		}

}
