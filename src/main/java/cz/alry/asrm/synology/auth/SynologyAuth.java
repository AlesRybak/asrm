package cz.alry.asrm.synology.auth;

import cz.alry.asrm.synology.SynologyResponse;
import feign.Feign;
import feign.Param;
import feign.RequestLine;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public interface SynologyAuth {

    public static SynologyAuth getClient(String server) {
        return Feign.builder()
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
                .logger(new Slf4jLogger())
                .logLevel(feign.Logger.Level.FULL)
                .target(SynologyAuth.class, server);
    }

    @RequestLine("GET /webapi/auth.cgi?api=SYNO.API.Auth&version=3&method=login&account={user}&passwd={password}&session=ASRM&format=cookie")
    SynologyResponse<LoginCookie> login(
            @Param("user") String user,
            @Param("password") String password);

    @RequestLine("GET /webapi/auth.cgi?api=SYNO.API.Auth&version=3&method=login&account={user}&passwd={password}&otp_code={otp}&session=ASRM&format=sid")
    SynologyResponse<LoginCookie> loginWithOtp(
            @Param("user") String user,
            @Param("password") String password,
            @Param("otp") String otp);

}
