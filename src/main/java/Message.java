import org.apache.log4j.Logger;


import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Yurii on 17.08.2017.
 */

public class Message {

    private static final Logger LOGGER = Logger.getLogger(Message.class);

    public String getText(Integer hours){

        if(hours < 0 || hours > 23) {
            LOGGER.error("A wrong number of hours was received.");
            throw new IllegalArgumentException("Hours can not be less than zero or more then 23.");
        }
        String message;

        if ( hours >= 6 && hours < 9){
            message = ResourceBundle.getBundle("application", Locale.getDefault()).getString("morning");
        }
        else if (hours >= 9 && hours < 19){
            message = ResourceBundle.getBundle("application", Locale.getDefault()).getString("day");;
        }
        else if (hours >= 19 && hours < 23){
            message = ResourceBundle.getBundle("application", Locale.getDefault()).getString("evening");
        }
        else message = ResourceBundle.getBundle("application", Locale.getDefault()).getString("night");

        LOGGER.info("The message: {" + message + "} was taken from properties file");

        return message;
    }

}
