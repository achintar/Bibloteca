import com.company.Book;
import com.company.Library;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by achintar on 10/01/15.
 */
public class LibraryTest {

    @Test
    public void shouldCheckLibraryBookListMatch() {

        Book books = new Book("Harry Potter", "J.K Rowling", "1994", "available");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        new Library(books).showBookList(printStream);
        assertEquals(byteArrayOutputStream.toString(), "Harry Potter,Michael,1994,available");
    }

}
