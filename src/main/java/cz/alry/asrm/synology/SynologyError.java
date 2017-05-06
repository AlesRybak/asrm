package cz.alry.asrm.synology;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public class SynologyError {

    private static final Map<Integer, String> CODE_MESSAGE;
    static {
        CODE_MESSAGE = new HashMap<>();
        CODE_MESSAGE.put(100, "Unknown error");
        CODE_MESSAGE.put(101, "No parameter of API, method or version");
        CODE_MESSAGE.put(102, "The requested API does not exist");
        CODE_MESSAGE.put(103, "The requested method does not exist");
        CODE_MESSAGE.put(104, "The requested version does not support the functionality");
        CODE_MESSAGE.put(105, "The logged in session does not have permission");
        CODE_MESSAGE.put(106, "Session timeout");
        CODE_MESSAGE.put(107, "Session interrupted by duplicate login");
        CODE_MESSAGE.put(400, "Invalid parameter of file operation");
        CODE_MESSAGE.put(401, "Unknown error of file operation");
        CODE_MESSAGE.put(402, "System is too busy");
        CODE_MESSAGE.put(403, "Invalid user does this file operation");
        CODE_MESSAGE.put(404, "Invalid group does this file operation");
        CODE_MESSAGE.put(405, "Invalid user and group does this file operation");
        CODE_MESSAGE.put(406, "Can’t get user/group information from the account server");
        CODE_MESSAGE.put(407, "Operation not permitted");
        CODE_MESSAGE.put(408, "No such file or directory");
        CODE_MESSAGE.put(409, "Non-supported file system");
        CODE_MESSAGE.put(410, "Failed to connect internet-based file system (ex: CIFS)");
        CODE_MESSAGE.put(411, "Read-only file system");
        CODE_MESSAGE.put(412, "Filename too long in the non-encrypted file system");
        CODE_MESSAGE.put(413, "Filename too long in the encrypted file system");
        CODE_MESSAGE.put(414, "File already exists");
        CODE_MESSAGE.put(415, "Disk quota exceeded");
        CODE_MESSAGE.put(416, "No space left on device");
        CODE_MESSAGE.put(417, "Input/output error");
        CODE_MESSAGE.put(418, "Illegal name or path");
        CODE_MESSAGE.put(419, "Illegal file name");
        CODE_MESSAGE.put(420, "Illegal file name on FAT file system");
        CODE_MESSAGE.put(421, "Device or resource busy");
        CODE_MESSAGE.put(599, "No such task of the file operation");
    }

    private int code;
    private List<SynologyFileError> errors;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<SynologyFileError> getErrors() {
        return errors;
    }

    public void setErrors(List<SynologyFileError> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "SynologyError{" + "code=" + code + ", description='" + CODE_MESSAGE.get(code) + "', errors=" + errors + '}';
    }
}
