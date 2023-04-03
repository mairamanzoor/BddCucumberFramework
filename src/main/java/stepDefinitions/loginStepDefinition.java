//package stepDefinitions;
//
//import java.time.Duration;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class loginStepDefinition {
//	WebDriver driver;
//	 @Given ("user is already on login page")
//	 public void user_is_already_on_login_page() {
//		 System.setProperty("webdriver.chrome.driver","C:\\QA\\Seleniumjars\\chromedriver.exe");
//		 driver=new ChromeDriver();
//		 driver.get("https://shopping.panasonic.ca/login.aspx?rf=%2fdefault.aspx%3flang%3den");	 
//	 }
//	 
//	 @When("title of login page is Login - Panasonic eStore")
//	 public void title_of_login_page_is_login_panasonic_e_store() {
//	String title=driver.getTitle();
//	System.out.println(title);
//	 Assert.assertEquals("Login - Panasonic eStore", title);
//	 }
//	//Reg Exp:
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\"
//	 
//	 @Then("user enters {string} and {string}")
//	 public void user_enters_username_and_password(String username, String password) {
//	    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtUserIDLogin")).sendKeys(username);
//	    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtPasswordLogin")).sendKeys(password);
//	 }
//	 @Then("user enters on login button")
//	 public void user_enters_on_login_button() {
//	    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_imgLoginSubmit")).click();
//	 }
//	 @Then("user is on home page")
//	 public void user_is_on_home_page() throws InterruptedException {
//		 Thread.sleep(2000);
//	    String title =driver.getTitle();
//	    System.out.println(title);
//	    Assert.assertEquals("Panasonic eStore", title);
//	 }
//	 @Then("username is shown")
//	 public void username_is_shown() {
//	  boolean label=driver.findElement(By.xpath("//span[contains(text(),'Welcome maira')]")).isDisplayed();
//	  Assert.assertTrue(label);
//	  
//	 }
//	 
//	 @Then("user clicks on your account")
//		public void user_clicks_on_your_account(){
//			//Thread.sleep(2000);
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	    driver.findElement(By.id("ctl00_lnkGlobalYourAccount")).click();
//		}
//		@Then("user clicks on your registration")
//		public void user_clicks_on_your_registration() {
//		 driver.findElement(By.linkText("Product Registration")).click();  
//		}
//		@Then("user clicks on your register your product")
//		public void user_clicks_on_your_register_your_product() {
//		    driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_lnkNewRegistration")).click();
//		}
//		@Then("user enter {string} and {string} and {string}")
//		public void user_enter_and_and(String model, String date, String dealer) {
//		  driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtModelNumber")).sendKeys(model);
//		  driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtPurchaseDate")).sendKeys(date);
//		  driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_txtDealerName")).sendKeys(dealer);
//		}
//		@Then("user clicks on submit")
//		public void user_clicks_on_submit() {
//		driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder1_imgSubmit")).click();
//		}
//	 
//	 @Then("close the browser")
//	 public void close_the_browser() {
//	    driver.quit();
//	 }
//
//
//}
