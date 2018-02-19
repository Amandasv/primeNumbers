public class PrimeNumber {

    private Printer printer;

    public PrimeNumber(Printer printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        PrimeNumber primeNumber = new PrimeNumber(printer);
        primeNumber.generate(30);

    }

    public void generate(int number) {
        int primeNumber = 2;

        for (int position = number; position >= 2 ; position--) {

            if(isPrime(primeNumber)) {
                while (number%primeNumber == 0) {

                    printer.print(Integer.toString(primeNumber) + "\n") ;
                    number = divideByPrime(number, primeNumber);

                    if (number%primeNumber != 0) {
                        primeNumber++;
                        break;
                    }
                }
            } else {
                primeNumber++;
            }

            if (number == primeNumber) {
                printer.print(Integer.toString(primeNumber) + "\n") ;
                break;
            }
        }
    }

    public int divideByPrime(int dividend, int primeNumber) {
        int result = dividend/primeNumber;
        return result;

    }

    public boolean isPrime(int number) {
        boolean classification = true;

        for (int position = 2; position < number; position++) {
            if ( number%position==0 ) {
                classification = false;
            }
        }
        return classification;
    }
}
