package ua.org.oa.melnikova;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListBooks  implements Serializable {
    private List<Book> books;

    public ListBooks() {
        books = new ArrayList<Book>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public void remove(int i) {
        books.remove(i);
    }

    public void replace(int i, Book book) {
        books.remove(i);
        books.set(i, book);
    }

    public  void set(int i, Book book){
        books.set(i, book);
    }



    @Override
    public String toString() {
        return "ListBook{" +
                "books=" + books +
                '}';
    }
}
