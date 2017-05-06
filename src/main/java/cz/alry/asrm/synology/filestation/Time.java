package cz.alry.asrm.synology.filestation;

import java.util.Date;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public class Time {

    private Date atime;
    private Date mtime;
    private Date ctime;
    private Date crtime;

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getCrtime() {
        return crtime;
    }

    public void setCrtime(Date crtime) {
        this.crtime = crtime;
    }

    @Override
    public String toString() {
        return "Time{" + "atime=" + atime + ", mtime=" + mtime + ", ctime=" + ctime + ", crtime=" + crtime + '}';
    }
}
