import Bot.Bot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChatRoom {

    private User user;
    private Bot bot;


    public ChatRoom() {
        user = new User();
        bot = new Bot("Hello", "");
    }

    public void setUserName(String name) {
        user.setUserName(name);
        bot.setUserName(name);
    }

    public void initialize() throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        while (logic(reader)) {

        }
        reader.close();
    }

    private boolean logic(BufferedReader reader) throws IOException {
        user.displayUserName();
        String command = reader.readLine();
        if (bot.receiveMessage(command)) {
            return false;
        }
        return true;
    }

    public User getUser() {
        return user;
    }

    public Bot getBot() {
        return bot;
    }
}
