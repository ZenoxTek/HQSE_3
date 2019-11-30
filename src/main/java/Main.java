import Bot.TimeBot;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        TimeBot timeBot = new TimeBot("time", "Europe/Paris");

        timeBot.receiveMessage("@time");
    }
}
