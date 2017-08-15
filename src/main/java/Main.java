import factory.MessageFactory;

import java.util.Calendar;
import java.util.logging.Logger;

/**
 * Created by Yurii on 8/14/2017.
 */

public class Main {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {
        LOGGER.info("hello-world application was launched");

        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);

        MessageFactory message = new MessageFactory();
        System.out.println(message.getMessage(hour).getText());

        LOGGER.info("hello-world application finished work");
     }
}
