//package stepDefinitions;
//
//import java.time.Duration;
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.datatable.DataTable;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class RegisterStepDefinition {
//	WebDriver driver;
//	
//	 @Given ("user is on login page")
//	 public void user_is_already_on_login_page() {
//		 System.setProperty("webdriver.chrome.driver","C:\\QA\\Seleniumjars\\chromedriver.exe");
//		 driver=new ChromeDriver();
//		 driver.get("https://shopping.panasonic.ca/login.aspx?rf=%2fdefault.aspx%3flang%3den");	 
//	 }
//	 
//	 @When("the title of login page is Login - Panasonic eStore")
//	 public void title_of_login_page_is_login_panasonic_e_store() {
//	String title=driver.getTitle();
//	System.out.println(title);
//	 Assert.assertEquals("Login - Panasonic eStore", title);
//	 }
//	//Reg Exp:
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\"
//	 
////	// @Then("user writes username and password ")
////	 public void user_writes_username_and_password(io.cucumber.datatable.DataTable credentials) {
////		List<List<String>> data= credentials.cells();
////		 //List<String> data = credentials.asList();
////		// List<List> data = credentials.raw();
////	    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtUserIDLogin")).sendKeys(data.get(0).get(0));
////	    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtPasswordLogin")).sendKeys(data.get(0).get(1));
////	 }
//	 @Then("user writes username and password")
//	 public void user_writes_username_and_password(DataTable credentials) {
          //List<List<String>> data = credentials.asLists(String.class) // try this
//			List<List<String>> data= credentials.cells();
//			// List<List> data = credentials.raw();//outdated
//		    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtUserIDLogin")).sendKeys(data.get(0).get(0));
//		    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtPasswordLogin")).sendKeys(data.get(0).get(1));
//	
//	 }
//	 
//	 @Then("user press on login button")
//	 public void user_enters_on_login_button() {
//	    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_imgLoginSubmit")).click();
//	 }
//	
//	@Then("user clicks on your account")
//	public void user_clicks_on_your_account(){
//		//Thread.sleep(2000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//    driver.findElement(By.id("ctl00_lnkGlobalYourAccount")).click();
//	}
//	@Then("user clicks on your registration")
//	public void user_clicks_on_your_registration() {
//	 driver.findElement(By.linkText("Product Registration")).click();  
//	}
//	@Then("user clicks on your register your product")
//	public void user_clicks_on_your_register_your_product() {
//	    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_lnkNewRegistration")).click();
//	}
//	@Then("user enter product registration details")
//	public void user_enter_and_and(DataTable deal) {
//		List<List<String>> data= deal.cells();
//	  driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtModelNumber")).sendKeys(data.get(0).get(0));
//	  driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtPurchaseDate")).sendKeys(data.get(0).get(1));
//	  driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtDealerName")).sendKeys(data.get(0).get(2));
//	}
//	@Then("user clicks on submit")
//	public void user_clicks_on_submit() {
//	driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_imgSubmit")).click();
//	}
//
//
//
//
//}
