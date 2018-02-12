package builder.range.noEdgeVersion;


public class Range {

    private int from;
    private int to;
    private boolean fromIncluded;
    private boolean toIncluded;
    private int step;
    private boolean reverse;

    public Range() {
        this.from = 0;
        this.to = 0;
        this.fromIncluded = true;
        this.toIncluded = true;
        this.step = 1;
        this.reverse = false;
    }

    public static RangeBuilder builder(){
        return new RangeBuilder();
    }


//    public Iterator<Iterator> iterator(){};
//    public boolean in(int value){

//
//    }
    public void reverse(){

    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public boolean isFromIncluded() {
        return fromIncluded;
    }

    public void setFromIncluded(boolean fromIncluded) {
        this.fromIncluded = fromIncluded;
    }

    public boolean isToIncluded() {
        return toIncluded;
    }

    public void setToIncluded(boolean toIncluded) {
        this.toIncluded = toIncluded;
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

    @Override
    public String toString() {
        return "From " + from + " to " + to;
    }
}
