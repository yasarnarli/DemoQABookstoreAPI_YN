package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.DeleteBook;

public class deleteBookStepDefs {

    DeleteBook deleteBook=new DeleteBook();
    @Given("User should delete a book")
    public void user_should_delete_a_book() {
deleteBook.deleteBook_mtd();
    }



    @Then("User should verify deleteStatusCode")
    public void user_should_verify_deleteStatusCode() {
deleteBook.verifyDeleteBook_mtd();
    }
}
