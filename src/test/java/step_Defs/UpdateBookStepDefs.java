package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.UpdateBook;

public class UpdateBookStepDefs {

    UpdateBook updateBook=new UpdateBook();
    @Given("user should apdate the collection")
    public void user_should_apdate_the_collection() {
updateBook.updateBook_mtd();
    }



    @Then("User should verify the updateStatusCode")
    public void user_should_verify_the_updateStatusCode() {
updateBook.verifyUpdateBook_mtd();
    }

}
