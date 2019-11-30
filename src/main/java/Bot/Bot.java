package Bot;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bot {
    protected String  botName;
    protected String  attribute;
    protected String  response;
    protected String  userName;

    public Bot(String botName, String attribute) {
        this.botName = botName;
        this.attribute = attribute;
    }

    public Bot() {
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getResponse() {
        return this.response;
    }

    public boolean receiveMessage(String message) {
        if (message != null) {
            return (this.parseMessage(message));
        }
        return false;
    }

    protected void formatResponse() {
        Date today = new Date();
        SimpleDateFormat formater;
        formater = new SimpleDateFormat("EEEE d MMMM 'et il est' hh'h'mm");

        this.response =  "[" + this.botName + "] " + "Salut " + this.userName + " ! Nous sommes "
                + formater.format(today) + ".";
    }

    protected boolean parseMessage(String message) {
        this.botName = "hello";
        if (message.equals("@" + botName)) {
            this.formatResponse();
            System.out.println(getResponse());
            return false;
        }
        return message.equals("++");
    }
}
