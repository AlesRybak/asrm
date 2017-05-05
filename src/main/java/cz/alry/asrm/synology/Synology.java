package cz.alry.asrm.synology;

import feign.RequestLine;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public interface Synology {

    @RequestLine("GET /webapi/query.cgi?api=SYNO.API.Info&version=1&method=query&query=SYNO.API.Auth")
    Object getInfo();

}
