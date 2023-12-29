package javastart.app;
import javastart.model.Book;

public class Library {
  public static void main( String args[ ] ) {
    final String appName = "Library v0.3";

    Book book1 = new Book( "W pustyni i w puszczy", "Henryk Sienkiewicz",
                          2010, 296, "Greg", "9788373271890");
    
    Book book2 = new Book( "Mistrz i Malgorzata", "Michail Bulhakow",
                          2012, 528, "Rebis", "9788375108545" );

    Book book3 = new Book( "Teatrzyk Zielona Ges", "Konstanty Ildefons Galczynski",
                          2009, 412, "Iskry", "9788324401093 ");

    System.out.println( appName );
    System.out.println( "Available books:" );
    book1.printInfo();
    book2.printInfo();
    book3.printInfo();
  }
}