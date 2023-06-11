package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.GetAllBooks;

public class GetAllBooksStepDefs {

    GetAllBooks getAllBooks=new GetAllBooks();
    @Given("User should see book list")
    public void user_should_see_book_list() {
getAllBooks.bookList_mtd();
    }


    @Then("User should verfiy the books statusCode")
    public void user_should_verfiy_the_books_statusCode() {
getAllBooks.verifyBookList_mtd();
    }
}
