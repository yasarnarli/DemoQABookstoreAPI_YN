package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.Authorized;

public class AuthorizedStepDefs {

    Authorized authorized=new Authorized();
    @Given("User should be authorized with valid credentials")
    public void user_should_be_authorized_with_valid_credentials() {
       authorized.userAuthorized_mtd();
    }



    @Then("verify authorized status code")
    public void verify_authorized_status_code() {
        authorized.verifyAuthorizationStatusCode_mtd();
    }
}
