import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class AppTest {
    @Test
    public void TestWritingFizzBuzz() throws IOException {
        String fizzbuzz = "1\n2\nFizz\n4\nBuzz\n";
        StringWriter writer = new StringWriter();
        FizzBuzzFactory factory = new FizzBuzzFactory(1);

        for (int i = 1; i <= 5; ++i) {
            FizzBuzz fb = factory.next();
            fb.print(writer);
        }

        Assert.assertEquals(writer.toString(), fizzbuzz);
    }
}
