package builder.range.edgeVersion;

public class RangeBuilder {

    private Range range = new Range();
    private RangeEdge rangeEdge = new RangeEdge();   // Wrong! new RangeEnge should be inside method rather than be a class member

    public RangeBuilder includeTo(int value){
        rangeEdge.setValue(value);  // Wrong! one Range has 2 Edge, can only set one in this way. Should new the Endg inside the method;
        return this;
    }

}
