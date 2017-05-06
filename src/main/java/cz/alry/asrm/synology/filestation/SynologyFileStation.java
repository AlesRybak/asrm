package cz.alry.asrm.synology.filestation;

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
public interface SynologyFileStation {

    public static SynologyFileStation getClient(String server) {
        return Feign.builder()
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
                .logger(new Slf4jLogger())
                .logLevel(feign.Logger.Level.FULL)
                .target(SynologyFileStation.class, server);
    }

    @RequestLine("GET /webapi/entry.cgi?api=SYNO.FileStation.Info&version=2&method=get&_sid={sid}")
    SynologyResponse<Object> getInfo(@Param("sid") String sid);

    @RequestLine("GET /webapi/entry.cgi?api=SYNO.FileStation.List&version=2&method=list_share&_sid={sid}")
    SynologyResponse<Shares> listAll(@Param("sid") String sid);

}
