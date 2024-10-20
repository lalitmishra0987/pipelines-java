import com.microsoft.demo.Demo;
import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

    @Test
    public void checkAddFunction() {
        Demo d  = new Demo();
        int y = d.addNumbers(2, 3);

        boolean result = false;
        if(y == 5) result = true;
    }
}