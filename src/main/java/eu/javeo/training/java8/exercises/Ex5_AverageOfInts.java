package eu.javeo.training.java8.exercises;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class Ex5_AverageOfInts {

    private double average(List<Integer> ints) {
        // TODO: Zwróć średnią z podanych liczb
        return 0;
    }

    @Test
    public void test() {
        List<Integer> ints = Arrays.asList(1, 3, 5, 7);
        double avg = average(ints);
        assertThat(avg, is(4.0));
    }
}
