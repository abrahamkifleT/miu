public class PorcupineNumber {
    public static void main(String[] args){
        int procupine = findPorcupineNumber(149);
        System.out.println(procupine);
    }

    public static int findPorcupineNumber(int n){
     for (int i = n; ;i++){
         int isPrime = isPrime(i);
         if (isPrime == 1 && i % 10 == 9){
             for (int j = i + 1; ;j++){
                 isPrime = isPrime(j);
                 if (isPrime == 1 && j % 10 == 9){
                     return i;
                 }else if(isPrime == 1 && j % 10 != 9){
                     break;
                 }
             }
         }
     }
    }

    public static int isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return 0;
            }
        }
        return 1;
    }
}
