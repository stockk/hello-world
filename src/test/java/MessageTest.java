import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

/**
 * Created by Yurii on 17.08.2017.
 */
public class MessageTest {
    @Test
    public void morningTest() throws Exception {
        Message message = new Message();
        String language = Locale.getDefault().getLanguage();
        for (int i = 6; i < 9; i++) {
            switch(language){
                case "ru": assertEquals("Доброе утро, Мир!", message.getText(i));
                    break;
                default: assertEquals("Good morning, World!", message.getText(i));
                    break;
            }
        }
    }

    @Test
    public void dayTest() throws Exception {
        Message message = new Message();
        String language = Locale.getDefault().getLanguage();
        for (int i = 9; i < 19; i++) {
            switch(language){
                case "ru": assertEquals("Добрый день, Мир!",message.getText(i));
                    break;
                default: assertEquals("Good day, World!",message.getText(i));
                    break;
            }
        }
    }

    @Test
    public void eveningTest() throws Exception {
        Message message = new Message();
        String language = Locale.getDefault().getLanguage();
        for (int i = 19; i < 23; i++) {
            switch(language){
                case "ru": assertEquals("Добрый вечер, Мир!", message.getText(i));
                    break;
                default: assertEquals("Good evening, World!", message.getText(i));
                    break;
            }
        }
    }

    @Test
    public void nightTest() throws Exception {
        Message message = new Message();
        String language = Locale.getDefault().getLanguage();
        int nightnList [] = {23, 0, 1, 2, 3, 4, 5};
        for (int i : nightnList) {
            switch(language){
                case "ru": assertEquals("Доброй ночи, Мир!", message.getText(i));
                    break;
                default: assertEquals("Good night, World!", message.getText(i));
                    break;
            }
        }
    }

    @Test(expected = Exception.class)
    public void wrongHoursTest() throws Exception {
        Message message = new Message();
        message.getText(-1);
    }
}