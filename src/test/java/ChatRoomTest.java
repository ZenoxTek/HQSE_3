import org.junit.Test;

import static org.junit.Assert.*;

public class ChatRoomTest {

    @Test
    public void setUserName() {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.setUserName("toto");
        assertEquals("toto", chatRoom.getUser().getUserName());
//        assertEquals("toto", chatRoom.getBot().getUserName());
    }
}