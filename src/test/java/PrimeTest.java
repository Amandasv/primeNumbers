import org.junit.Assert;
import org.junit.Test;

public class PrimeTest {

    private final PrimeNumber prime = new PrimeNumber(new Printer());

    @Test
    public void returnsTrueIfNumberIsPrime() {
        boolean classification = prime.isPrime(5);

        Assert.assertEquals(classification, true);
    }

    @Test
    public void returnsFalseIfNumbersIsFalse(){
        boolean classification = prime.isPrime(4);

        Assert.assertEquals(classification, false);
    }
}
