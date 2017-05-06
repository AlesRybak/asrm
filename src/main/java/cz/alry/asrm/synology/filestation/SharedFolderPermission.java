package cz.alry.asrm.synology.filestation;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public class SharedFolderPermission {

    private String shareRight;
    private int posix;
    private AdvancedRights advRight;
    private boolean aclEnable;
    private boolean isAclMode;
    private Acl acl;

    public String getShareRight() {
        return shareRight;
    }

    public void setShareRight(String shareRight) {
        this.shareRight = shareRight;
    }

    public int getPosix() {
        return posix;
    }

    public void setPosix(int posix) {
        this.posix = posix;
    }

    public AdvancedRights getAdvRight() {
        return advRight;
    }

    public void setAdvRight(AdvancedRights advRight) {
        this.advRight = advRight;
    }

    public boolean isAclEnable() {
        return aclEnable;
    }

    public void setAclEnable(boolean aclEnable) {
        this.aclEnable = aclEnable;
    }

    public boolean isAclMode() {
        return isAclMode;
    }

    public void setAclMode(boolean aclMode) {
        isAclMode = aclMode;
    }

    public Acl getAcl() {
        return acl;
    }

    public void setAcl(Acl acl) {
        this.acl = acl;
    }

    @Override
    public String toString() {
        return "SharedFolderPermission{" + "shareRight='" + shareRight + '\'' + ", posix=" + posix + ", advRight="
                + advRight + ", aclEnable=" + aclEnable + ", isAclMode=" + isAclMode + ", acl=" + acl + '}';
    }
}
