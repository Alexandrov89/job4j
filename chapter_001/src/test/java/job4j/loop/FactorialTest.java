package job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int rs = Factorial.calc(5);
        int expected = 120;
        assertThat(rs, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rs = Factorial.calc(0);
        int expected = 1;
        assertThat(rs, is(expected));
    }
}
