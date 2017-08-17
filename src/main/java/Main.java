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

        Message message = new Message();
        System.out.println(message.getText(hour));

        LOGGER.info("hello-world application finished work");
     }
}
