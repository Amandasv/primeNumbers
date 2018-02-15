public class PrimeNumber {

    public boolean isPrime(int number) {
        for (int position = 2; position < number; position++) {
            if ( number%position==0 ) {
                return false;
            }
        }
        return true;
    }
}
