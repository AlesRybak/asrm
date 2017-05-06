package cz.alry.asrm.config;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public class PropertiesConfigTest {

    @Test
    public void testGetSimpleValue() throws Exception {
        Config config = PropertiesConfig.getInstance();
        assertEquals("I expect simple string value to be returned.", "http", config.getProtocol());
    }

}