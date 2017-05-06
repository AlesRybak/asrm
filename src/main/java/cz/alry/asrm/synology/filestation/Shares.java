package cz.alry.asrm.synology.filestation;

import java.util.List;

/**
 * @author Ales Rybak(ales.rybak@lundegaard.eu)
 */
public class Shares {

    private List<SharedFolder> shares;

    public List<SharedFolder> getShares() {
        return shares;
    }

    public void setShares(List<SharedFolder> shares) {
        this.shares = shares;
    }

    @Override
    public String toString() {
        return "Shares{" + "shares=" + shares + '}';
    }
}
