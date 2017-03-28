import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pc on 3/26/2017.
 */
public class PhonePrefixesStrategyTest {

    private PhonePrefixesService service;

    @Before
    public void setUp(){
        service = new PhonePrefixesService();
    }

    @After
    public void tearDown(){
        service = null;
    }

    @Test
    public void when_getPrefixByCountryName_is_called_with_BELGIUM_should_return_that_is_32() {
        String result = service.getPrefixByCountryName(Country.BELGIUM);

        assertEquals("Belgium's prefix is: +32", result);
    }

    @Test
    public void when_getPrefixByCountryName_is_called_with_NETHERLANDS_should_return_that_is_plus_33() {
        String result = service.getPrefixByCountryName(Country.NETHERLANDS);

        assertEquals("Netherlands's prefix is: +33", result);
    }

    @Test
    public void when_getPrefixByCountryName_is_called_with_FRANCE_should_return_that_is_plus_31(){
        String result = service.getPrefixByCountryName(Country.FRANCE);
        assertEquals("France's prefix is: +31", result);
    }

    @Test
    public void when_getPrefixByCountryName_is_called_with_ENGLAND_should_return_that_is_plus_41(){
        String result = service.getPrefixByCountryName(Country.ENGLAND);
        assertEquals("England's prefix is: +41", result);
    }
}
