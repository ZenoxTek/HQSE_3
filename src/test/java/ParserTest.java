import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void getArgumentsAtIndex() {
        String[]    args = {"-p", "toto"};
        Parser      parser = new Parser(args);
        String expected = "toto";

        parser.parse();
        assertEquals(expected, parser.getArgumentsAtIndex(0));
    }

    @Test
    public void getArgumentsAtOutIndex() {
        String[]    args = {"-p", "toto"};
        Parser      parser = new Parser(args);

        parser.parse();
        assertNull(parser.getArgumentsAtIndex(3));
    }

    @Test
    public void getArgumentsAtNegativeIndex() {
        String[]    args = {"-p", "toto"};
        Parser      parser = new Parser(args);

        parser.parse();
        assertNull(parser.getArgumentsAtIndex(-3));
    }

    @Test
    public void parse() {
        String[]    args = {"-p", "toto"};
        Parser      parser = new Parser(args);

        assertTrue(parser.parse());
    }

    @Test
    public void parseEmptyArgs() {
        String[]    args = {};
        Parser      parser = new Parser(args);

        assertFalse(parser.parse());
    }


    @Test
    public void parseWithOnlyOption() {
        String[]    args = {"-p"};
        Parser      parser = new Parser(args);

        assertFalse(parser.parse());
    }

    @Test
    public void parseNullArgs() {
        String[]    args = null;
        Parser      parser = new Parser(args);

        assertFalse(parser.parse());
    }
}