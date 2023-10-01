package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 ChromeDriver driver = new ChromeDriver();
 driver.get("https://en-gb.facebook.com");
 driver.manage().window().maximize();
 Thread.sleep(2000);
 driver.findElement(By.linkText("Create new account")).click();
 Thread.sleep(2000);
 driver.findElement(By.name("firstname")).sendKeys("Rugs");
 driver.findElement(By.name("lastname")).sendKeys("S");
 driver.findElement(By.name("reg_email__")).sendKeys("rugmasnair@gmail.com");
 driver.findElement(By.id("password_step_input")).sendKeys("rugma@2000");
 
 
 
 WebElement day=driver.findElement(By.name("birthday_day"));
 Select dd_day = new Select(day);
 dd_day.selectByIndex(1);
 
 WebElement month=driver.findElement(By.name("birthday_month"));
 Select dd_month = new Select(month);
 dd_month.selectByVisibleText("Jan");
 
 WebElement dob_year=driver.findElement(By.name("birthday_year"));
 Select dd_year = new Select(dob_year);
 dd_year.selectByValue("2000");
 
 driver.findElement(By.partialLinkText("Female")).click();
 
 //Radio button is not getting clicked.
 
 
 
 
	}
}
