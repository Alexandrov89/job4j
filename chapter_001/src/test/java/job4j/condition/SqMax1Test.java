package job4j.condition;

import org.junit.Test;
import ru.job4j.condition.SqMax1;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMax1Test {
    @Test
    public void whenSecondMax(){
        SqMax1 check = new SqMax1();
        int result = check.max(10, 11, 7, 5);
        assertThat(result, is(11));
    }
    @Test
    public void whenFirstMax(){
        SqMax1 check = new SqMax1();
        int result = check.max(5, 3, 2,0);
        assertThat(result, is(5));
    }
    @Test
    public void whenThirdMax(){
        SqMax1 check = new SqMax1();
        int result = check.max(6, 4, 7,5);
        assertThat(result, is(7));
    }
    @Test
    public void whenForthMax(){
        SqMax1 check = new SqMax1();
        int result = check.max(2, 8, 4,12);
        assertThat(result, is(12));
    }
    @Test
    public void whenAllTheSame(){
        SqMax1 check = new SqMax1();
        int result = check.max(3, 3, 3,3);
        assertThat(result, is(3));
    }
}
