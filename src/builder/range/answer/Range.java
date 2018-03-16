package builder.range.answer;

import java.util.Iterator;

public class Range implements Iterable<Integer> {

    //MARK: ENDS

    private End from;
    private End to;

    public End getFrom(){
        return from;
    }

    public void setFrom(End from){
        this.from = from;
    }

    public End getTo() {
        return to;
    }

    public void setTo(End to) {
        this.to = to;
    }

    public static class End{
        int value;
        boolean included;

        public End(){
        }

        public End(int value, boolean included){
            this.value = value;
            this.included = included;
        }

    }


    // MARK - Basic Properties

    private int step = 1;
    private boolean reverse;


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
    public Iterator<Integer> iterator() {
        return new Iter();
    }

    private class Iter implements Iterator<Integer>{
        private int value;

        public Iter(){
            value = from.included ? from.value : from.value + 1;
        }

        @Override
        public boolean hasNext() {
            if (to.included){
                return value <= to.value;
            } else {
                return value < to.value;
            }
        }

        @Override
        public Integer next() {
           int result = value;
           value += step;
           return result;
        }
    }


    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private Range range = new Range();

        public Builder includeTo(int value){
            range.to = new End(value,true);
            return this;
        }

        public Builder excludeTo(int value){
            range.to = new End(value,false);
            return this;
        }

        public Builder includeFrom(int value){
            range.from = new End(value, true);
            return this;
        }

        public Builder excludeFrom(int value){
            range.from = new End(value,false);
            return this;
        }

        public Range build(){
            return range;
        }


    }


}

