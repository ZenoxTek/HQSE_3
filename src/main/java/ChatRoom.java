import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChatRoom {

    // User Instance

    // Bot Instance

    public ChatRoom() {
        // Init user and Bot
    }

    public void setUserName() {

    }

    public void initialize() throws IOException {
        boolean appRunning = true;
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        while (appRunning) {
            String name = reader.readLine();
            // TODO : Display Command

            // TODO : Trigger Bot

            // TODO: React to Bot response
        }
    }

}
