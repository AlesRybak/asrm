package cz.alry.asrm.testconnection;

import cz.alry.asrm.GlobalCommandParams;
import cz.alry.asrm.config.Config;
import cz.alry.asrm.config.PropertiesConfig;
import cz.alry.asrm.synology.LoginCookie;
import cz.alry.asrm.synology.LoginResponse;
import cz.alry.asrm.synology.Synology;
import cz.alry.jcommander.CommandRunner;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ales Rybak (ales.rybak@ibacz.eu)
 */
public class TestConnectionCommandRunner implements CommandRunner<GlobalCommandParams, TestConnectionCommandParams> {

    private static final Logger LOG = LoggerFactory.getLogger(TestConnectionCommandRunner.class);

    private Config config = PropertiesConfig.getInstance();

    public void run(GlobalCommandParams globalParams, TestConnectionCommandParams generateParams) {
        LOG.info("Hello you!");
        Synology synology = Feign.builder()
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
                .logger(new Slf4jLogger())
                .logLevel(feign.Logger.Level.FULL)
                .target(Synology.class, config.getProtocol() + "://" + config.getServerName());


        LoginResponse loginResponse;
        if (globalParams.getOtp() != null) {
            loginResponse = synology.loginWithOtp(config.getUserLogin(), globalParams.getPassword(), globalParams.getOtp());
        } else {
            loginResponse = synology.login(config.getUserLogin(), globalParams.getPassword());
        }
        LOG.info("Login result: {}", loginResponse);
    }


}
