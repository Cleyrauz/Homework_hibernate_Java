import db.authordb;
import db.bookdb;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Book book1 = new Book("1984", 1960, "Fiction");
        bookdb.save(book1);
        Book book2 = new Book("La importancia de llamarse Ernesto", 1890, "Drama");
        bookdb.save(book2);
        Book book3 = new Book("Kakfa en la orilla", 2013, "Fiction");
        bookdb.save(book3);
        Author author1 = new Author("Haruki", "Murakami", 1975);
        authordb.save(author1);
        Author author2 = new Author("Romulo", "Gallegos", 1920);
        authordb.save(author2);
        Author author3 = new Author("Gabriel", "Garcia", 1945);
        authordb.save(author3);


        List<Book> allBooks = bookdb.getAll();
        Book found = bookdb.find(book1.getId());
        bookdb.deleteAll();
        List<Book> listAfterDelete = bookdb.getAll();
        List<Author> allAuthors = authordb.getAll();
        Author haruki = authordb.find(author1.getId());
        authordb.deleteAll();
        List<Author> list = authordb.getAll();

    }
}
