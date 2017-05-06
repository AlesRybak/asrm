package cz.alry.asrm.synology;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public class LoginResponse {

    private boolean success;
    private SynologyError error;
    private LoginCookie data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public SynologyError getError() {
        return error;
    }

    public void setError(SynologyError error) {
        this.error = error;
    }

    public LoginCookie getData() {
        return data;
    }

    public void setData(LoginCookie data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LoginResponse{" + "success=" + success + ", error=" + error + ", data=" + data + '}';
    }
}
