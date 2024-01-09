package javastart.io;

import javastart.model.Book;
import java.util.Scanner;

public class DataReader {
  private Scanner sc = new Scanner( System.in );

  public void close( ) {
    sc.close( );
  }

  public Book readCreateBook( ) {
    System.out.println("Title: "); String title = sc.nextLine();
    System.out.println("Author: "); String author = sc.nextLine();
    System.out.println("Publisher: "); String publisher = sc.nextLine();
    System.out.println("ISBN: "); String isbn = sc.nextLine();

    System.out.println("Release date: "); int releaseDate = sc.nextInt();
    System.out.println("Pages: "); int pages = sc.nextInt();
    
    return new Book( title, author, releaseDate, pages, publisher, isbn );
  }
}