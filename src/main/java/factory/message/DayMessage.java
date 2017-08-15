package factory.message;

import factory.AbstractMessage;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Created by Yurii on 8/14/2017.
 */

public class DayMessage extends AbstractMessage {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(DayMessage.class));

    private String text;

    public DayMessage() {
        this.text = ResourceBundle.getBundle("application", Locale.getDefault()).getString("day");
    }
    @Override
    public String getText() {
        LOGGER.info("text {"+text+"} has been sent");
        return text;
    }
}
