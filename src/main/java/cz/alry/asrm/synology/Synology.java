package cz.alry.asrm.synology;

import feign.Param;
import feign.RequestLine;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public interface Synology {

    @RequestLine("GET /webapi/query.cgi?api=SYNO.API.Info&version=1&method=query&query=SYNO.API.Auth,SYNO.")
    Object getInfo();

    @RequestLine("GET /webapi/auth.cgi?api=SYNO.API.Auth&version=3&method=login&account={user}&passwd={password}&session=ASRM&format=cookie")
    LoginResponse login(
            @Param("user") String user,
            @Param("password") String password);

    @RequestLine("GET /webapi/auth.cgi?api=SYNO.API.Auth&version=3&method=login&account={user}&passwd={password}&otp_code={otp}&session=ASRM&format=cookie")
    LoginResponse loginWithOtp(
            @Param("user") String user,
            @Param("password") String password,
            @Param("otp") String otp);

}
