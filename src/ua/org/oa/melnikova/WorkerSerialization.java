package ua.org.oa.melnikova;

import java.io.*;

public class WorkerSerialization {

    public static void writeToFile(String fileName,ListBooks books){
            try {
                FileOutputStream file = new FileOutputStream(fileName,true);
                ObjectOutputStream obj = new ObjectOutputStream(file);
                obj.writeObject(books);
                obj.flush();
                obj.close();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }


    public static ListBooks readFile(String fileName) {
        ListBooks books = new ListBooks();
        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream obj = new ObjectInputStream(file);
            books = (ListBooks)obj.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

}
