package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.GetUserById;

public class GetUserByIdStepDefs {

    GetUserById getUserById=new GetUserById();
    @Given("User should see the book list")
    public void user_should_see_the_book_list() {
getUserById.getUser_mtd();
    }



    @Then("User should verify the book statusCode")
    public void user_should_verify_the_book_statusCode() {
getUserById.verifyGetUser_mtd();
    }
}
