package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.GenerateToken;

public class GenerateTokenStepDefs {

    GenerateToken generateToken=new GenerateToken();
    @Given("input valid credentials")
    public void input_valid_credentials() {
generateToken.generateToken_mtd();
    }


    @Then("verify token status code")
    public void verify_token_status_code() {
        generateToken.verifyGenerateTokenStatusCode_mtd();

    }
}
