package builder.range.noEdgeVersion;


public class RangeBuilder {

    private Range range = new Range();

    public RangeBuilder includeTo(int value){
        range.setTo(value);
        range.setToIncluded(true);
        return this;
    }

    public RangeBuilder excludeTo(int value){
        range.setTo(value);
        range.setToIncluded(false);
        return this;
    }

    public RangeBuilder includeFrom(int value){
        range.setFrom(value);
        range.setToIncluded(true);
        return this;
    }

    public RangeBuilder excludeFrom(int value){
        range.setTo(value);
        range.setToIncluded(false);
        return this;
    }

    public RangeBuilder step(int value){
        range.setStep(value);
        return this;
    }

    public RangeBuilder reverse(){
        range.reverse();
        return this;
    }

    public Range build(){
        return range;
    }

}
