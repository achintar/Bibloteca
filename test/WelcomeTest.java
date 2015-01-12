import com.company.Welcome;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by achintar on 10/01/15.
 */

public class WelcomeTest {

    @Test
    public void shouldCheckWelcomeMessage()
    {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);

        new Welcome().printMessage(printStream);

        assertEquals(byteArrayOutputStream.toString(), "WELCOME");
    }

}


