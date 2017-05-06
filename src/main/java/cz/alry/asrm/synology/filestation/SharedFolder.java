package cz.alry.asrm.synology.filestation;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public class SharedFolder {

    private String path;
    private String name;
    private SharedFolderAdditional additional;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SharedFolderAdditional getAdditional() {
        return additional;
    }

    public void setAdditional(SharedFolderAdditional additional) {
        this.additional = additional;
    }

    @Override
    public String toString() {
        return "SharedFolder{" + "path='" + path + '\'' + ", name='" + name + '\'' + ", additional=" + additional + '}';
    }
}
