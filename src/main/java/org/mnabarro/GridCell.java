package org.mnabarro;

public class GridCell {
    boolean locked;

    public GridCell(boolean locked) {
        this.locked = locked;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
