import org.apache.log4j.Logger;

import java.util.Calendar;

/**
 * Created by Yurii on 8/14/2017.
 */

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        LOGGER.info("hello-world application was launched");

        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
        Message message = new Message();
        for (int i = 0; i < 30; i++) {
            System.out.println(message.getText(hour));
        }

        LOGGER.info("hello-world application finished work");
     }
}
