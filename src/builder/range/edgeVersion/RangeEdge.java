package builder.range.edgeVersion;

public class RangeEdge {

    private int value;
    private boolean setted;
    private boolean include;

    public RangeEdge() {
        this.value = 0;
        this.setted = false;
        this.include = true;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isSetted() {
        return setted;
    }

    public void setSetted(boolean setted) {
        this.setted = setted;
    }

    public boolean isInclude() {
        return include;
    }

    public void setInclude(boolean include) {
        this.include = include;
    }
}
