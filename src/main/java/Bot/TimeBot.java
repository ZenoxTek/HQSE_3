package Bot;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeBot extends Bot {

    private String[]    params_array;

    public TimeBot(String  botName, String attribute) {
        this.botName = botName;
        this.attribute = attribute;
    }

    public TimeBot() {}

    @Override
    protected void formatResponse() {
      Date today = null;
      SimpleDateFormat formater;
      formater = new SimpleDateFormat("EEEE d MMMM 'et il est' hh'h'mm");
      Calendar calParis = Calendar.getInstance();

        calParis.setTimeZone(TimeZone.getTimeZone(this.params_array[1]));
        today = calParis.getTime();

        this.response =  "[" + this.botName + "]" + " Nous sommes le " + formater.format(today) + ".";
    }

    @Override
    protected boolean parseMessage(String message) {
        /*this.params_array = message.trim().split(" ");
        this.botName = "time";

        if (message.equals("@" + botName)) {
            this.formatResponse();
            System.out.println(getResponse());
            return false;
        }
        return message.equals("++");*/
        return true;
    }

}
