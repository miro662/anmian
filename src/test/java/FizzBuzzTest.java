import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest  {
    @Test
    public void testGeneratedMessagesForNumbersDivisableBy3And5() {
        FizzBuzz three = new FizzBuzz(3);
        Assert.assertEquals(three.toString(), "Fizz");

        FizzBuzz five = new FizzBuzz(5);
        Assert.assertEquals(five.toString(), "Buzz");

        FizzBuzz fifteen = new FizzBuzz(15);
        Assert.assertEquals(fifteen.toString(), "FizzBuzz");
    }

    @Test
    public void testGeneratedMessagesForNumbersNotDivisableBy3Nor5() {
        FizzBuzz one = new FizzBuzz(1);
        Assert.assertEquals(one.toString(), "1");

        FizzBuzz sixteen = new FizzBuzz(16);
        Assert.assertEquals(sixteen.toString(), "16");
    }
}
