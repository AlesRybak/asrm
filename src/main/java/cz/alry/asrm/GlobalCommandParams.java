package cz.alry.asrm;

import com.beust.jcommander.Parameter;

/**
 * @author Ales Rybak (ales.rybak@ibacz.eu)
 */
public class GlobalCommandParams {

    @Parameter(
            names = {"-p", "--pass"},
            description = "Password")
    private String password = "";

    public String getPassword() {
        return password;
    }
}
