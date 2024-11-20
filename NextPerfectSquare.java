public class NextPerfectSquare {

    public static int nextPerfectSquare(int n){
        if (n < 0 ){
            return 0;
        }
        for (int i = 1; ; i++){
            int perfectNumber = i * i;
            if (perfectNumber > n){
                return perfectNumber;
            }
        }
    }



    public static void main(String[] args){
        int nextPerfectNumber = nextPerfectSquare(-5);
        System.out.println(nextPerfectNumber);
    }
}
