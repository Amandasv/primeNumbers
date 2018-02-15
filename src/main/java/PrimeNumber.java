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
        for (int position = 2; position < number ; position++) {
            if(isPrime(position)){
                System.out.println(position);
            }
        }
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
