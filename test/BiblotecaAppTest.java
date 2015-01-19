import com.company.BiblotecaApp;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BiblotecaAppTest {

    @Test
    public void shouldCheckWelcomeMessage()
    {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);

        new BiblotecaApp().printMessage(printStream);

        assertEquals("WELCOME", byteArrayOutputStream.toString());
    }

}


