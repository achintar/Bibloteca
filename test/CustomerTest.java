import com.company.Customer;
import org.junit.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by achintar on 12/01/15.
 */
public class CustomerTest {

    @Test
    public void shouldCheckBookEntry() throws IOException {
        assertEquals("Harry Potter", new Customer().seachBook());
    }
    
}
