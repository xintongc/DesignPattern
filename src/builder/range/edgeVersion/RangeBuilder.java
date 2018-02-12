package builder.range.edgeVersion;

public class RangeBuilder {

    private Range range = new Range();
    private RangeEdge rangeEdge = new RangeEdge();

    public RangeBuilder includeTo(int value){
//        range.setTo(value);
        return this;
    }

}
