package FinalProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AddRecruitment extends HrBaseSetup {
	@Test
	public static void RecruitmentAdd() throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']")).click();//click on recruitment
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();//click on add
		
		//fill the detail
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Manandhar");
		
		//select vacancy
		driver.findElement(By.xpath("//div[contains(@class, 'oxd-select-text-input')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class, 'oxd-select-text-input')]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[contains(@class, 'oxd-select-text-input')]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[contains(@class, 'oxd-select-text-input')]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[contains(@class, 'oxd-select-text-input')]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[contains(@class, 'oxd-select-text-input')]")).sendKeys(Keys.RETURN);
		
		//add email and contacts 
		driver.findElement(By.xpath("(//input[@placeholder='Type here'])[1]")).sendKeys("mahramkumar@gmail.com");
		driver.findElement(By.xpath("(//input[@placeholder='Type here'])[2]")).sendKeys("9849494949");
		
		//upload cv
		driver.findElement(By.cssSelector(".oxd-file-button")).click();
		StringSelection filepath = new StringSelection("D:\\demo.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		
		//automate keyboard action ctrl + v using robot to upload cv
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        driver.findElement(By.xpath("//button[contains(@class, 'oxd-button--secondary')]")).click();
		
		
		
		
	
		
		
		
		
	}

}
