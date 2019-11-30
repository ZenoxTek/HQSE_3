import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO: Parse string
        Parser parser = new Parser(args);
        if (!parser.parse()) {
            return;
        }
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.setUserName(parser.getArgumentsAtIndex(0));
        chatRoom.initialize();
    }
}
