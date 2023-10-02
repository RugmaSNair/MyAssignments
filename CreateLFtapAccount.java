package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLFtapAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		//1. Enter a username and password
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//2. Click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//3. Click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//4. Click on the Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//5. Click on the Create Account button
		driver.findElement(By.linkText("Create Account")).click();
		
		//6. Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("bcd");
		
		//7. Enter a description as Selenium Automation Tester
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//8. Select "Computer Software" as the industry
		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select dd=new Select(Industry);
		dd.selectByVisibleText("Computer Software");
		
		
		//9. Select "S-Corporation" as ownership using SelectByVisibleText;
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select own = new Select(Ownership);
		own.selectByVisibleText("S-Corporation");
		
		//10. Select "Employee" as the source using SelectByValue
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select emp = new Select(source);
		emp.selectByValue("LEAD_EMPLOYEE");
		
		
		//11. Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		
		WebElement campaign=driver.findElement(By.id("marketingCampaignId"));
		Select camp = new Select(campaign);
		camp.selectByIndex(6);
		
		
		
		//12. Select "Texas" as the state using SelectByValue
		WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select st=new Select(state);
		st.selectByValue("TX");
		
		//13. Click the "Create Account Button"
		driver.findElement(By.className("smallSubmit")).click();
		
		//14. Verify that the account name is displayed correctly
		
		
		
		//15. Close the browser window
		driver.close();
		
		
				

	}




	}


