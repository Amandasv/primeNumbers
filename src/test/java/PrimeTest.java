import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PrimeTest {

//    private final PrimeNumber prime = new PrimeNumber(new Printer());

    @Mock
    private Printer printer;
    private PrimeNumber prime;

    @Before
    public void prepareDependencies() {
        MockitoAnnotations.initMocks(this);
        prime = new PrimeNumber(printer);
    }

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
//    public void verifyIfMethodIsCalled() {
//        prime.generate(30);
//        verify(prime).divideByPrime(30, 2);
//    }




}
