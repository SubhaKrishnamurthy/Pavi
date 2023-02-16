package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Test1_StepDefinition {

	WebDriver driver;

	public Test1_StepDefinition() {
		System.setProperty("webdriver.chrome.driver", "/Users/subhakrish/Documents/Selenium-Base/sample/driver/chromedriver");
		driver = new ChromeDriver();
	}

	@Given("^User logged into application$")
	public void UserLoggedIntoApplication() throws Throwable{

		driver.get("https://egenisyslms.org/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href='#login'])[2]")).click();
	}



	@When("^User enters username and password$")
	public void User_enters_username_and_password() throws Throwable{
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//a[@href='#login'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='lp-username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='lp-password']")).sendKeys("pp!@egen_org$#");
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
		Thread.sleep(6000);
	}

	@Then("^login is successful$")
	public void login_is_successful() throws Throwable{
		//driver.quit();
	}

	@Then("^select the type as potential clients$")
	public void select_the_type_as_potential_clients() throws Throwable{
		driver.findElement(By.xpath("//a[@class='btn red-btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'testiris')]")).click();
		//Thread.sleep(2000);
	}

	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {

	}
}
