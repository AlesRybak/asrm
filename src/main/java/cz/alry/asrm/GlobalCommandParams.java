package cz.alry.asrm;

import com.beust.jcommander.Parameter;

/**
 * @author Ales Rybak (ales.rybak@ibacz.eu)
 */
public class GlobalCommandParams {

    @Parameter(
            names = {"-h", "--host"},
            description = "Synology server host and port")
    private String host = "";

    public String getHost() {
        return host;
    }
}
