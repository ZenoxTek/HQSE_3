import Bot.Bot;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class BotTest {

    @Test
    public void setUserName() {
        Bot bot = new Bot();
        bot.setUserName("Toto");

        assertEquals("Toto", bot.getUserName());
    }

    @Test
    public void getResponse() {
        Date today = new Date();
        SimpleDateFormat formater;
        formater = new SimpleDateFormat("EEEE d MMMM 'et il est' hh'h'mm");
        Bot bot = new Bot();
        bot.setUserName("Tutu");
        bot.receiveMessage("@hello");
        String expected = "[hello] Salut Tutu ! Nous sommes " + formater.format(today) + ".";

        //assertEquals(expected, bot.getResponse());
    }

    @Test
    public void receiveMessage() {
        Bot bot = new Bot();
        bot.setUserName("Toto");

        assertTrue(bot.receiveMessage("++"));
    }

    @Test
    public void receiveWrongMessage() {
        Bot bot = new Bot();
        bot.setUserName("Toto");

        assertFalse(bot.receiveMessage("@hello"));
    }

    @Test
    public void receiveNullMessage() {
        Bot bot = new Bot();
        bot.setUserName("Toto");

        assertFalse(bot.receiveMessage(null));
    }
}