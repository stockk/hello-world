import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Created by Yurii on 17.08.2017.
 */

public class Message {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Message.class));

    public String getText(Integer hours){

        if(hours < 0 || hours > 23) {
            LOGGER.warning("A wrong number of hours was received.");
            throw new IllegalArgumentException("Hours can not be less than zero or more then 23.");
        }

        String textMessage;

        if ( hours >= 6 && hours < 9){
            textMessage = ResourceBundle.getBundle("application", Locale.getDefault()).getString("morning");
        }
        else if (hours >= 9 && hours < 19){
            textMessage = ResourceBundle.getBundle("application", Locale.getDefault()).getString("day");;
        }
        else if (hours >= 19 && hours < 23){
            textMessage = ResourceBundle.getBundle("application", Locale.getDefault()).getString("evening");
        }
        else textMessage = ResourceBundle.getBundle("application", Locale.getDefault()).getString("night");

        LOGGER.info("The message: {" + textMessage + "} was taken from properties file");

        return textMessage;
    }

}
