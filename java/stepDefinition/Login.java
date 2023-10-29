package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{

 String leadID;

// @Given("Launch the browser")
 //public void  launchBrowser() {
	 //driver=new ChromeDriver();
	 //driver.manage().window().maximize();
 //}
 
// @Given("Load the Url")
 //public void loadUrl() {
	// driver.get("http://leaftaps.com/opentaps/");
// }
 
 @Given("Enter the Username as {string}")
 public void enterUsername(String username) {
	 driver.findElement(By.id("username")).sendKeys(username);
 }
 
 @Given("Enter the password as {string}")
 public void enterPassword(String password) {
	 driver.findElement(By.id("password")).sendKeys(password);
 }
 
 @When("click on the Login page")
 
 public void clickLogin() {
	 driver.findElement(By.className("decorativeSubmit")).click();
 }
 
 @Then("Welcome page is displayed")
 public void verifyWelcomePage() {
	 System.out.println(driver.getTitle());
 }
 @But("Error message is displayed")
 public void verifyErrorMesage() {
	 String errormessage= driver.findElement(By.xpath("//div[@class='serviceError']")).getText();
	 System.out.println(errormessage);
 }
 
 @When("click on {string} link")
 public void click_on_crm_sfa_link(String linktext) {
	 driver.findElement(By.linkText(linktext)).click();
		
     
 }
 
     
 
 @When("Enter the company name as {string}")
 public void enter_the_company_name_as(String companyName) {
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		
		
     
 }
 @When("Enter the first name as {string}")
 public void enter_the_first_name_as(String firstName) {
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);   
 }
 @When("Enter the last name as {string}")
 public void enter_the_last_name_as(String lastName) {
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName); 
 }
 @When("click on submit button")
 public void click_on_submit_button() {
	 driver.findElement(By.name("submitButton")).click();
 }
 @Then("viewpage is displayed.")
 public void viewpage_is_displayed() {
     System.out.println(driver.getTitle());
 }
 
 @When("click on Phone tab")
 public void click_on_phone_tab() {
	 driver.findElement(By.xpath("//span[text()='Phone']")).click();
 }
 @When("Enter the phone number as {string}")
 public void enter_the_phone_number_as(String phoneNumber) {
	 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
 }
 @When("click on Find Leads button")
 public void click_on_find_leads_button() {
	 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
 }
 
 
 @When("Click on the first LeadID")
 public void click_on_the_lead_id() {
	 String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
 }
 @When("Enter LeadId")
 public void enter_lead_id() {
	 String leadID= this.leadID;
	 driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
 }
 @Then("Lead is deleted")
 public void lead_is_deleted() {
	 String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}

     
 }
}
 


