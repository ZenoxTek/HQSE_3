package Bot;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bot {
    private String  botName;
    private String  attribute;
    private String  response;
    private String  userName;

    public Bot(String botName, String attribute) {
        this.botName = botName;
        this.attribute = attribute;
    }

    public Bot() {
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getResponse() {
        return this.response;
    }

    public String getBotName() {
        return this.botName;
    }

    public boolean receiveMessage(String message) {
        if (message != null) {
            return (this.parseMessage(message));
        }
        return false;
    }

    private void formatResponse() {
        this.response =  "Je ne connais pas le chatbot " + attribute + "!";
    }

    private boolean parseMessage(String message) {
        if (message.equals(botName)) {
            this.formatResponse();
            System.out.println(getResponse());
            return false;
        }
        return message.equals("++");
    }
}
