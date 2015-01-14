import com.company.Book;
import com.company.Printer;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by achintar on 13/01/15.
 */
public class PrinterTest {

    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(byteArrayOutputStream);

    @Test
    public void shouldPrintBooksInProperFormat()
    {
        Printer printer = new Printer();
        ArrayList<Book> booklist = new ArrayList<Book>();
        booklist.add(new Book("Black Lotus","Satyaraj Das","2007"));
        booklist.add(new Book("Harry Potter","J.K Rowling","1998"));
        booklist.add(new Book("Journey Home","Richard Salvin","2005"));
        booklist.add(new Book("Let Us C","Yashwant K","2010"));

        printer.print(booklist, printStream);

    }

}
