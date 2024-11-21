public class PrimeCount {
    public static int primeCount(int start,int end){
        int isPrime = 0;
        for(int i = start < 0 ? 2 : start; i <= end; i++){
            boolean isPrimes = false;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    isPrimes = true;
                    break;
                }
            }
            if (!isPrimes){
                isPrime++;
            }
        }
        return isPrime;
    }


    public static void main(String[] args){
        int isPrime = primeCount(-10,6);
        System.out.println(isPrime);
    }
}
