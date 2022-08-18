package api.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class steps {

    @Given("^when user is on login page$")
    public void when_user_is_on_login_page() throws Throwable {
        System.out.println("when_user_is_on_login_page_good");
    }

    @When("^when user enters username and password$")
    public void when_user_enters_username_and_password() throws Throwable {
        System.out.println("when_user_enters_username_and_password");
    }

    @When("^when click on login button$")
    public void when_click_on_login_button() throws Throwable {
        System.out.println("when_click_on_login_button");
    }

    @Then("^when user is navigated to home page$")
    public void when_user_is_navigated_to_home_page() throws Exception {
        System.out.println("when_user_is_navigated_to_home_page");
    }

}
