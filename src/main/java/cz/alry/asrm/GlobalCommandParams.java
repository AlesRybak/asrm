package cz.alry.asrm;

import com.beust.jcommander.Parameter;

/**
 * @author Ales Rybak (ales.rybak@ibacz.eu)
 */
public class GlobalCommandParams {

    @Parameter(
            names = {"-p", "--password"},
            description = "Password")
    private String password = "";

    @Parameter(
            names = {"-o", "--otp"},
            description = "OTP")
    private String otp = null;

    public String getPassword() {
        return password;
    }

    public String getOtp() {
        return otp;
    }
}
