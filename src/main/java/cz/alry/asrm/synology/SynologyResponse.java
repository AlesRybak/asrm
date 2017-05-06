package cz.alry.asrm.synology;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public class SynologyResponse<T> {

    private boolean success;
    private SynologyError error;
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SynologyResponse{" + "success=" + success + ", error=" + error + ", data=" + data + '}';
    }
}
