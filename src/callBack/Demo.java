package callBack;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        new Demo().run();
    }

    public void run(){
        List<Integer> nums = new LinkedList<>();
        nums.add(6);
        nums.add(7);
        nums.add(3);
        nums.add(8);
        nums.add(4);

        GreaterThan greaterThan = new GreaterThan();
        nums.stream()
                .filter(greaterThan)  //委托
                .collect(Collectors.toList());

        nums.stream()
                .filter(new Predicate<Integer>() {
                    @Override     //用了匿名内部类 -> 回调
                    public boolean test(Integer integer) {
                        return integer > 5;
                    }
                })
                .collect(Collectors.toList());

    }
}
