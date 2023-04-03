package stepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterMapStepDefinition {
	//data table with maps : for parameterization of test cases
	
	WebDriver driver;
	
	 @Given ("user is on login page")
	 public void user_is_already_on_login_page() {
		 System.setProperty("webdriver.chrome.driver","C:\\QA\\Seleniumjars\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://shopping.panasonic.ca/login.aspx?rf=%2fdefault.aspx%3flang%3den");	 
	 }
	 
	 @When("the title of login page is Login - Panasonic eStore")
	 public void title_of_login_page_is_login_panasonic_e_store() {
	String title=driver.getTitle();
	System.out.println(title);
	 Assert.assertEquals("Login - Panasonic eStore", title);
	 }

	 @Then("user writes username and password")
	 public void user_writes_username_and_password(DataTable credentials) { 
			for (Map<String, String> data : credentials.asMaps(String.class, String.class)){
		    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtUserIDLogin")).sendKeys(data.get("username"));
		    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtPasswordLogin")).sendKeys(data.get("password"));
		}
	 }
	 
	 @Then("user press on login button")
	 public void user_enters_on_login_button() {
	    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_imgLoginSubmit")).click();
	 }
	
	@Then("user clicks on your account")
	public void user_clicks_on_your_account(){
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   driver.findElement(By.id("ctl00_lnkGlobalYourAccount")).click();
	}
	@Then("user clicks on your registration")
	public void user_clicks_on_your_registration() {
	 driver.findElement(By.linkText("Product Registration")).click();  
	}
	@Then("user clicks on your register your product")
	public void user_clicks_on_your_register_your_product() {
	    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_lnkNewRegistration")).click();
	}
	@Then("user enter product registration details")
	public void user_enter_and_and(DataTable deal) {
		for (Map<String, String> data : deal.asMaps(String.class, String.class)){
			  driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtModelNumber")).sendKeys(data.get("model"));
			  driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtPurchaseDate")).sendKeys(data.get("purshasedate"));
			  driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtDealerName")).sendKeys(data.get("dealer"));
			  driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_imgSubmit")).click();	
			  driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_lnkNewRegistration")).click();
		}
		
}
	@Then("user close the browser")
	public void user_close_the_browser() {
	    driver.quit();
	}

}
