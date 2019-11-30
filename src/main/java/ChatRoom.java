import Bot.Bot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ChatRoom {

    private User user;
    private ArrayList<Bot> bot;
    private Bot system;
    private Bot triggerBot = null;

    public ChatRoom() {
        user = new User();
        bot = new ArrayList<Bot>();
        Bot botOne = new Bot("Hello", "");
        Bot botTwo = new Bot("Time", "Europe/Paris");
        bot.add(botOne);
        bot.add(botTwo);
    }

    public void setUserName(String name) {
        user.setUserName(name);
        for (Bot tempBot :
                bot) {
            tempBot.setUserName(name);
        }
    }

    public void initialize() throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        while (logic(reader)) {

        }
        reader.close();
    }

    private boolean checkIsABotSystem(String name) {
        for (Bot botTemp :
                bot) {
            if (botTemp.getBotName().equals(name)) {
                triggerBot = botTemp;
                return true;
            }
        }
        return false;
    }

    private boolean parseCommand(String command) {
        String firstElement = command.split(" ")[0];
        if (firstElement.length() > 0)
        {
            if (!firstElement.startsWith("@")) {
                return false;
            }
            return checkIsABotSystem(firstElement);
        }
        return false;
    }

    private boolean logic(BufferedReader reader) throws IOException {
        user.displayUserName();
        String command = reader.readLine();
        if (parseCommand(command)) {
            if (triggerBot != null) {
                triggerBot.receiveMessage(command);
            }
            return true;
        }
        system.setAttribute(command);
        return system.receiveMessage("@system");
    }

    public User getUser() {
        return user;
    }

    public Bot getBot() {
        return triggerBot;
    }
}
