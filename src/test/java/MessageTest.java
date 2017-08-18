import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

/**
 * Created by Yurii on 17.08.2017.
 */
public class MessageTest {

    Locale ruLocale;
    Locale otherLocale;
    Message message ;

    @Before
    public void setUp()
    {
         message = new Message();
         ruLocale = new Locale.Builder().setLanguage("ru").setRegion("RU").build();
         otherLocale = new Locale.Builder().setLanguage("fr").setRegion("CA").build();
    }

    @Test
    public void morningTest() throws Exception {
        for (int i = 6; i < 9; i++) {
            Locale.setDefault(ruLocale);
            assertEquals("Доброе утро, Мир!", message.getText(i));
            Locale.setDefault(otherLocale);
            assertEquals("Good morning, World!", message.getText(i));
        }
    }


    @Test
    public void dayTest() throws Exception {
        for (int i = 9; i < 19; i++) {
            Locale.setDefault(ruLocale);
            assertEquals("Добрый день, Мир!",message.getText(i));
            Locale.setDefault(otherLocale);
            assertEquals("Good day, World!",message.getText(i));
        }
    }

    @Test
    public void eveningTest() throws Exception {
        for (int i = 19; i < 23; i++) {
            Locale.setDefault(ruLocale);
            assertEquals("Добрый вечер, Мир!", message.getText(i));
            Locale.setDefault(otherLocale);
            assertEquals("Good evening, World!", message.getText(i));
        }
    }

    @Test
    public void nightTest() throws Exception {
        Message message = new Message();
        int nightnList [] = {23, 0, 1, 2, 3, 4, 5};
        for (int i : nightnList) {
            Locale.setDefault(ruLocale);
            assertEquals("Доброй ночи, Мир!", message.getText(i));
            Locale.setDefault(otherLocale);
            assertEquals("Good night, World!", message.getText(i));
        }
    }

    @Test(expected = Exception.class)
    public void wrongHoursTest() throws Exception {
        message.getText(-1);
    }
}