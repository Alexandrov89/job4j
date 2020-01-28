package job4j.condition;

import org.junit.Test;
import ru.job4j.condition.MultiMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax(){
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMax(){
        MultiMax check = new MultiMax();
        int result = check.max(10, 4, 2);
        assertThat(result, is(10));
    }
    @Test
    public void whenThirdMax(){
        MultiMax check = new MultiMax();
        int result = check.max(10, 4, 150);
        assertThat(result, is(150));
    }
    @Test
    public void whenAllTheSame(){
        MultiMax check = new MultiMax();
        int result = check.max(3, 3, 3);
        assertThat(result, is(3));
    }
}
