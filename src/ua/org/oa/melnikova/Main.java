package ua.org.oa.melnikova;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListBooks books = new ListBooks();
        books.add(new Book("F.Scott Fitzgerald", "The Great Gatsby", 1999));
        books.add(new Book("Ray Bradbury", "Fahrenheit 451", 2005));
        books.add(new Book("Harper Lee", "To Kill a Mockingbird", 2015));

        WorkerSerialization.writeToFile("FileForSerializable.txt", books);

        System.out.println(WorkerSerialization.readFile(("FileForSerializable.txt")));





    }
}
