package builder.range.edgeVersion;

public class Range {

    private RangeEdge from;
    private RangeEdge to;
    private int step;
    private boolean reverse;

    public Range() {
        this.from = from;
        this.to = to;
        this.step = 1;
        this.reverse = false;
    }

//    public Iterator<Iterator> iterator(){};
//    public boolean in(int value){

//
//    }
    public void reverse(){

    }

    public RangeEdge getFrom() {
        return from;
    }

    public void setFrom(RangeEdge from) {
        this.from = from;
    }

    public RangeEdge getTo() {
        return to;
    }

    public void setTo(RangeEdge to) {
        this.to = to;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }
}
