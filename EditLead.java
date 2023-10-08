package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("leaf");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Rug");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("create lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rugmasnair@gmail.com");
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select dd = new Select(State);
		 dd.selectByVisibleText("New York");
		 driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateLeadForm_description")).clear();
		 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Lead is edited");
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 System.out.println(driver.getTitle());
		 driver.close();
		 
		
		
		
		
		
		
		
		
		

	}

}
