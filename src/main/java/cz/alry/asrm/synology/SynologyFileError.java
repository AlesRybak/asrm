package cz.alry.asrm.synology;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public class SynologyFileError {

    private int code;
    private String path;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "SynologyFileError{" + "code=" + code + ", path='" + path + '\'' + '}';
    }
}
