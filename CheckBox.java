package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		String message = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		System.out.println(message+ " is displayed");
		
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.name("j_idt87:ajaxTriState_input")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']")).click();
		
		String message2 = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		System.out.println(message2+ "is displayed");
		
		boolean checkbox = driver.findElement(By.name("j_idt87:j_idt102_input")).isEnabled();
		if (checkbox==false)
		{System.out.println("The checkbox is disabled");
		
		}
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		Thread.sleep(2000);
	
	     driver.findElement(By.xpath("//li[@data-item-value='Berlin']")).click();
	    driver.findElement(By.xpath("//li[@data-item-value='Paris']")).click();
	}

}
