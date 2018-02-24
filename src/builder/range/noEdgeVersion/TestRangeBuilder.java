package builder.range.noEdgeVersion;

public class TestRangeBuilder {
    public static void main(String[] args) {

        RangeBuilder rangeBuilder = new RangeBuilder();
        Range range = rangeBuilder.includeFrom(3)
                .excludeTo(15)
                .step(5)
                .reverse()
                .build();

        System.out.println(range);



        Range range1 = Range.builder()
                .includeFrom(4)
                .excludeTo(16)
                .step(3)
                .reverse()
                .build();

        System.out.println(range1);

        System.out.println(range1.in(5));
        System.out.println(range1.in(16));

    }
}
