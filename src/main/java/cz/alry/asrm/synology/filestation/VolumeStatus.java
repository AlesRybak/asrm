package cz.alry.asrm.synology.filestation;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public class VolumeStatus {

    private int freespace;
    private int totalspace;
    private boolean readonly;

    public int getFreespace() {
        return freespace;
    }

    public void setFreespace(int freespace) {
        this.freespace = freespace;
    }

    public int getTotalspace() {
        return totalspace;
    }

    public void setTotalspace(int totalspace) {
        this.totalspace = totalspace;
    }

    public boolean isReadonly() {
        return readonly;
    }

    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
    }

    @Override
    public String toString() {
        return "VolumeStatus{" + "freespace=" + freespace + ", totalspace=" + totalspace + ", readonly=" + readonly
                + '}';
    }
}
