import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

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

    @Test
    public void returnsResultForNumberWithDivider() {
        int result = prime.divideByPrime(30, 2);

        Assert.assertEquals(result, 15);
    }

//    @Test
//    public void verifyIfPrinterIsCalled() {
//        Printer printer = mock(Printer.class);
//    }



}
