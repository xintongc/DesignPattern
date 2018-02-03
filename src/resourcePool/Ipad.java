package resourcePool;

public class Ipad {
    String type;
    int regestedNo;
    boolean occupied = false;

    public Ipad() {
    }

    public Ipad(String type, int regestedNo) {
        this.type = type;
        this.regestedNo = regestedNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRegestedNo() {
        return regestedNo;
    }

    public void setRegestedNo(int regestedNo) {
        this.regestedNo = regestedNo;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
