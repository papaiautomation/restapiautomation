package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class SampleStepDefination {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //Code for login
    	System.out.println("NetBanking Login");
    }
//Regular expression for common code
    @When("^Enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void enter_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
        //Code to validate home page is displayed
    	System.out.println("Home page is displayed");
    }

    @And("^Balance text is present \"([^\"]*)\"$")
    public void balance_text_is_present_something(String strArg) throws Throwable {
        System.out.println(strArg);
    }

}