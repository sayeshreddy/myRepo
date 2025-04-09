package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user in login page")
	public void goToLoginPage() {
		System.out.println("login Page");
	}
	@When("entered username and password")
	public void enterCreds() {
		System.out.println("entered username and password");
	}
	@And("clicks on login button")
	public void clickLogin() {
		System.out.println("login button");
	}
	@Then("user is moved to homepage")
	public void verifyLogin() {
		System.out.println("login Page");
	}
}
