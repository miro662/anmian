import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class FizzBuzzFactoryTest {
    @Test
    public void testFizzBuzzFactoryFirst() {
        FizzBuzzFactory factory = new FizzBuzzFactory(1);
        FizzBuzz first = factory.next();
        Assert.assertEquals(first.getId(), 1);
    }

    @Test
    public void testFizzBuzzFactoryNext() {
        Random random = new Random();
        int n = random.nextInt();

        FizzBuzzFactory factory = new FizzBuzzFactory(n);
        factory.next();
        FizzBuzz next = factory.next();
        Assert.assertEquals(next.getId(), n + 1);
    }
}
