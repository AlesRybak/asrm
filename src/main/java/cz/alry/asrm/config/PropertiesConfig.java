package cz.alry.asrm.config;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import cz.alry.asrm.ApplicationException;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public class PropertiesConfig implements Config {

    private static final Logger LOG = LoggerFactory.getLogger(PropertiesConfig.class);
    private static PropertiesConfig SINGLETON_INSTANCE = new PropertiesConfig();

    private Configuration configuration;

    private PropertiesConfig() {
        try {

            Configurations configs = new Configurations();
            configuration = configs.properties(getPropertiesLocation());

        } catch (ConfigurationException | MalformedURLException cex) {
            throw new ApplicationException(cex);
        }
    }

    public static Config getInstance() {
        return SINGLETON_INSTANCE;
    }

    @Override
    public String getProtocol() {
        return configuration.getString("synology.protocol", "http");
    }

    @Override
    public String getServerName() {
        return configuration.getString("synology.server", "localhost:5000");
    }

    @Override
    public String getUserLogin() {
        return configuration.getString("synology.user", "");
    }

    private URL getPropertiesLocation() throws MalformedURLException {
        URL configUrl;

        File configFile = new File(System.getProperty("user.home"), ".config/asrm/asrm.properties");

        if (configFile.isFile() && configFile.canRead()) {
            LOG.info("Found configuration file: {}", configFile);
            configUrl = configFile.toURI().toURL();
        } else {
            LOG.warn("Configuration file {} not found, using defaults.", configFile);
            configUrl = this.getClass().getResource("asrm.properties");
        }

        return configUrl;
    }
}
