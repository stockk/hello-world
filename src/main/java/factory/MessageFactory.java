package factory;

import factory.message.DayMessage;
import factory.message.EveningMessage;
import factory.message.MorningMessage;
import factory.message.NightMessage;

import java.util.logging.Logger;

/**
 * Created by Yurii on 8/14/2017.
 */

public class MessageFactory {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(MessageFactory.class));

    public AbstractMessage getMessage(Integer hours){

        if(hours < 0 || hours > 23) {
            LOGGER.warning("A wrong number of hours was received.");
            throw new IllegalArgumentException("Hours can not be less than zero or more then 23.");
        }

        AbstractMessage message;

        if ( hours >= 6 && hours < 9) message = new MorningMessage();
        else if (hours >= 9 && hours < 19) message = new DayMessage();
        else if (hours >= 19 && hours < 23) message = new EveningMessage();
        else message = new NightMessage();

        LOGGER.info("An object of class " + message.getClass() +" was initialized");

        return message;
    }



}
