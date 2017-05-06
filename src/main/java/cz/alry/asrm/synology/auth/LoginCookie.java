package cz.alry.asrm.synology.auth;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public class LoginCookie {

    private String sid;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "LoginCookie{" + "sid='" + sid + '\'' + '}';
    }
}
