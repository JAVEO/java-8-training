package eu.javeo.training.java8.exercises;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Ex3_Map {

    private List<Integer> triple(List<Integer> ints) {
        // TODO: Zwróć listę liczb w której każda zostanie pomnożona razy 3
        return null;
    }

    @Test
    public void test() {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = triple(ints);
        assertThat(result, is(Arrays.asList(3, 6, 9, 12, 15)));
    }
}
