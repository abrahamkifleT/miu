import java.util.Arrays;

public class Solve10 {

    public static int[] solve10(){
        int factorial10 = factorial(10);
        int [] solve10 = new int[2];
        for (int x = 2, y = 10; x < 10; x++,y--){
            int factorialX = factorial(x);
            int factorialY = factorial(y);
            if (factorialX + factorialY == factorial10){
                solve10[0] = factorialX;
                solve10[1] = factorialY;
                return solve10;
            }
        }
        return solve10;
    }
    public static int factorial(int n){
        while(n != 1){
            n--;
            n *= n;
        }
        return n;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(solve10()));
    }
}
