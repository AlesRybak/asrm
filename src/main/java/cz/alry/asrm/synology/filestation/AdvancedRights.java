package cz.alry.asrm.synology.filestation;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public class AdvancedRights {

    private boolean disableDownload;
    private boolean disableList;
    private boolean disableModify;

    public boolean isDisableDownload() {
        return disableDownload;
    }

    public void setDisableDownload(boolean disableDownload) {
        this.disableDownload = disableDownload;
    }

    public boolean isDisableList() {
        return disableList;
    }

    public void setDisableList(boolean disableList) {
        this.disableList = disableList;
    }

    public boolean isDisableModify() {
        return disableModify;
    }

    public void setDisableModify(boolean disableModify) {
        this.disableModify = disableModify;
    }

    @Override
    public String toString() {
        return "AdvancedRights{" + "disableDownload=" + disableDownload + ", disableList=" + disableList
                + ", disableModify=" + disableModify + '}';
    }
}
