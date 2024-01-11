package javastart.app;

import java.util.InputMismatchException;

import javastart.io.DataReader;
import javastart.model.Book;
import javastart.model.Library;

class LibraryControl {
  private DataReader dataReader = new DataReader( );
  private Library library = new Library( );

  private final int exit = 0;
  private final int add = 1;
  private final int print = 2;

  public void controlLoop( ) {
    int option = 0;

    do {
      printOptions( );
      try {
        option = dataReader.getInt( );
      } catch ( InputMismatchException e ) {
        System.out.println( "Wrong type of data (number needed)" );
        dataReader.getInput( );
      }

      switch( option ) {
        case exit:
          exit( );
          break;
        case add:
          addBook( );
          break;
        case print:
          printBooks( );
          break;
        default:
          System.out.println( "\nWrong number. Choose " + exit + add + print + "\n" );
      }
    } while ( option != exit );
  }

  private void exit( ) {
    System.out.println( "\nGoodbye!\n" );
    dataReader.close( );
  }

  private void printBooks() {
    library.printBooks( );
  }

  private void addBook( ) {
    Book book = dataReader.readCreateBook( );
    library.addBook( book );
  }

  private void printOptions( ) {
    System.out.println( "Choose an action" );
    System.out.println( exit + " -- exit" );
    System.out.println( add + " -- add a book" );
    System.out.println( print + " -- display books" );
  }
  
}
