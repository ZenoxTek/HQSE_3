import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void setUserName() {
        User user = new User();
        user.setUserName("toto");
        assertEquals("toto", user.getUserName());
    }

    @Test
    public void getUserName() {
        User user = new User();
        user.setUserName("toto");
        assertEquals("toto", user.getUserName());
    }
}