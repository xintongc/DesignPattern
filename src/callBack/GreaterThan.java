package callBack;

import java.util.function.Predicate;

public class GreaterThan implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer >=5;
    }
}
