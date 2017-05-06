package cz.alry.asrm.synology.filestation;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public class SharedFolderAdditional {

    private String realPath;
    private Owner owner;
    private Time time;
    private SharedFolderPermission perm;
    private String mountPointType;
    private VolumeStatus volumeStatus;

    public String getRealPath() {
        return realPath;
    }

    public void setRealPath(String realPath) {
        this.realPath = realPath;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public SharedFolderPermission getPerm() {
        return perm;
    }

    public void setPerm(SharedFolderPermission perm) {
        this.perm = perm;
    }

    public String getMountPointType() {
        return mountPointType;
    }

    public void setMountPointType(String mountPointType) {
        this.mountPointType = mountPointType;
    }

    public VolumeStatus getVolumeStatus() {
        return volumeStatus;
    }

    public void setVolumeStatus(VolumeStatus volumeStatus) {
        this.volumeStatus = volumeStatus;
    }

    @Override
    public String toString() {
        return "SharedFolderAdditional{" + "realPath='" + realPath + '\'' + ", owner=" + owner + ", time=" + time
                + ", perm=" + perm + ", mountPointType='" + mountPointType + '\'' + ", volumeStatus=" + volumeStatus
                + '}';
    }
}
