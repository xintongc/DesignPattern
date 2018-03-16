package builder.range.answer;

public class TestRange {

    public static void main(String[] args) {
        Range range = Range.builder()
                .includeFrom(2)
                .excludeTo(10)
                .build();

        range.setStep(2);

        for(Integer value : range){
            System.out.println(value);
        }
    }
}
