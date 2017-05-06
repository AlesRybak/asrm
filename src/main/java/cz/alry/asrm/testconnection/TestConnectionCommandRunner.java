package cz.alry.asrm.testconnection;

import cz.alry.asrm.ApplicationException;
import cz.alry.asrm.GlobalCommandParams;
import cz.alry.asrm.config.Config;
import cz.alry.asrm.config.PropertiesConfig;
import cz.alry.asrm.synology.auth.LoginCookie;
import cz.alry.asrm.synology.SynologyResponse;
import cz.alry.asrm.synology.auth.SynologyAuth;
import cz.alry.asrm.synology.filestation.Shares;
import cz.alry.asrm.synology.filestation.SynologyFileStation;
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
        SynologyAuth synology = SynologyAuth.getClient(config.getProtocol() + "://" + config.getServerName());
        SynologyFileStation fileStation = SynologyFileStation.getClient(config.getProtocol() + "://" + config.getServerName());

        SynologyResponse<LoginCookie> loginResponse;
        if (globalParams.getOtp() != null) {
            loginResponse = synology.loginWithOtp(config.getUserLogin(), globalParams.getPassword(), globalParams.getOtp());
        } else {
            loginResponse = synology.login(config.getUserLogin(), globalParams.getPassword());
        }
        LOG.info("Login result: {}", loginResponse);

        if (!loginResponse.isSuccess()) {
            throw new ApplicationException("Login was unsuccessful");
        }

        String sid = loginResponse.getData().getSid();

        SynologyResponse<Shares> fsInfo = fileStation.listAll(sid);
        LOG.info("List all shares result: {}", fsInfo);

    }


}
