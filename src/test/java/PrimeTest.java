import org.junit.Assert;
import org.junit.Test;

public class PrimeTest {
    @Test
    public void returnsIfNumberIsPrime() {
        Prime prime = new Prime();
        boolean classification = prime.isPrime(5);

        Assert.assertEquals(classification, true);
    }
}
