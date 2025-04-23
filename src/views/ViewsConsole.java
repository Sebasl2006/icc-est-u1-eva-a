package views;

import models.Book;

public class ViewsConsole {

    public void printArray (Book[] books){
        for ( Book book : books){
            System.out.println(book.toString());
        }

        
    }

    public void printMessage ( String message){
        System.out.println(message);
    }
    
}
