package javastart.io;

import javastart.model.Book;

import java.util.InputMismatchException;
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

    System.out.println("Release date: ");
    int releaseDate = 0;

    try {
      releaseDate = sc.nextInt();
    } catch ( InputMismatchException e ) {
      System.out.println( "Wrong type of data (number needed)" );
      sc.next();
    }

    System.out.println("Pages: ");
    int pages = 0;
    
    try {
      pages = sc.nextInt();
    } catch ( InputMismatchException e ) {
      System.out.println( "Wrong type of data (number needed)" );
      sc.next();
    }

    return new Book( title, author, releaseDate, pages, publisher, isbn );
  }

  public int getInt( ) {
    int number = sc.nextInt( );
    sc.nextLine( );
    return number;
  }

  public void getInput( ) {
    sc.nextLine( );
  }
}