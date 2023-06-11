package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.AddBooks;

public class AddBookStepDefs {

    AddBooks addBooks=new AddBooks();
    @Given("User should add new book")
    public void user_should_add_new_book() {
        addBooks.addBooks_mtd();
    }



    @Then("User should verify the add book statusCode")
    public void user_should_verify_the_add_book_statusCode() {
addBooks.verifyAddBook_mtd();
    }
}
