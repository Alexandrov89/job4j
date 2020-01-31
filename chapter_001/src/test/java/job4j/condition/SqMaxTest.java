package job4j.condition;

import org.junit.Test;
import ru.job4j.condition.SqMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenSecondMax(){
        SqMax check = new SqMax();
        int result = check.max(10, 11, 7, 5);
        assertThat(result, is(11));
    }
    @Test
    public void whenFirstMax(){
        SqMax check = new SqMax();
        int result = check.max(5, 3, 2,0);
        assertThat(result, is(5));
    }
    @Test
    public void whenThirdMax(){
        SqMax check = new SqMax();
        int result = check.max(6, 4, 7,5);
        assertThat(result, is(7));
    }
    @Test
    public void whenForthMax(){
        SqMax check = new SqMax();
        int result = check.max(10, 4, 20,150);
        assertThat(result, is(150));
    }
    @Test
    public void whenAllTheSame(){
        SqMax check = new SqMax();
        int result = check.max(3, 3, 3,3);
        assertThat(result, is(3));
    }
}
