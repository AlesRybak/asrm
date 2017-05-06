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
        assertTrue("I expect simple string value to be returned.", config.getProtocol().startsWith("http"));
    }

}