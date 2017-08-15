package factory.message;

import factory.AbstractMessage;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Created by Yurii on 8/14/2017.
 */

public class MorningMessage extends AbstractMessage {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(MorningMessage.class));

    private String text;

    public MorningMessage() {
        this.text = ResourceBundle.getBundle("application", Locale.getDefault()).getString("morning");
    }

    @Override
    public String getText() {
        LOGGER.info("text {"+text+"} has been sent");
        return text;
    }
}
