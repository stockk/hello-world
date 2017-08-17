package factory;

import org.junit.Test;
import java.util.Locale;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Yurii on 8/14/2017.
 */
public class MessageFactoryTest {

    @Test
    public void morningTest() throws Exception {
        MessageFactory messageFactory = new MessageFactory();
        String language = Locale.getDefault().getLanguage();
        for (int i = 6; i < 9; i++) {
            String message = messageFactory.getMessage(i).getText();
            switch(language){
                case "ru": assertEquals("Доброе утро, Мир!", message);
                    break;
                default: assertEquals("Good morning, World!", message);
                    break;
            }
        }
    }

    @Test
    public void dayTest() throws Exception {
        MessageFactory messageFactory = new MessageFactory();
        String language = Locale.getDefault().getLanguage();

        for (int i = 9; i < 19; i++) {
            String message = messageFactory.getMessage(i).getText();
            switch(language){
                case "ru": assertEquals("Добрый день, Мир!", message);
                    break;
                default: assertEquals("Good day, World!", message);
                    break;
            }
        }
    }

    @Test
    public void eveningTest() throws Exception {
        MessageFactory messageFactory = new MessageFactory();
        String language = Locale.getDefault().getLanguage();
        for (int i = 19; i < 23; i++) {
            String message = messageFactory.getMessage(i).getText();
            switch(language){
                case "ru": assertEquals("Добрый вечер, Мир!", message);
                    break;
                default: assertEquals("Good evening, World!", message);
                    break;
            }
        }
    }

    @Test
    public void nightTest() throws Exception {
        MessageFactory messageFactory = new MessageFactory();
        String language = Locale.getDefault().getLanguage();
        int nightnList [] = {23, 0, 1, 2, 3, 4, 5};
        for (int i : nightnList) {
            String message = messageFactory.getMessage(i).getText();
            switch(language){
                case "ru": assertEquals("Доброй ночи, Мир!", message);
                    break;
                default: assertEquals("Good night, World!", message);
                    break;
            }
        }
    }

    @Test(expected = Exception.class)
    public void wrongHoursTest() throws Exception {
        MessageFactory messageFactory = new MessageFactory();
        messageFactory.getMessage(-1).getText();
    }

}