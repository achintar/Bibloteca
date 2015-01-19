package com.company;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class WelcomeTest {

    @Test
    public void shouldCheckWelcomeMessage()
    {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        String message = "HELLO";

        Welcome welcome = new Welcome();
        welcome.printMessage(message, printStream);

        assertEquals(message,outputStream.toString());

    }
}
