package javastart.model;

import javastart.io.DataReader;

public class Library {
  public static void main( String args[ ] ) {
    final String appName = "Library v0.9";

    Book[ ] books = new Book[ 1000 ];
    DataReader dataReader = new DataReader( );

    System.out.println( appName );
    System.out.println( "Enter a new book" );

    books[ 0 ] = dataReader.readCreateBook();

    books[ 0 ].printInfo( );
    System.out.println( "The system can hold up to " + books.length + " books." );
    dataReader.close( );    
  }
}