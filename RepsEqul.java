public class RepsEqul {

    public static int repsEqual(int[] a, int n){
        int arrayFirstIndex = a[0] == 0 ? 1 : 0;
        int numberLastIndex = 0;
        for (int i = a.length - 1; i > arrayFirstIndex; i--){
            numberLastIndex = n % 10;
            if (a[i] != numberLastIndex){
                return 0;
            }
            n /= 10;
        }
        return 1;
    }


    public static void main(String[] args){
      int [] a = {9, 3, 1, 1, 2};
      int n = 32053;
      int isReqsEqual = repsEqual(a,n);
        System.out.println(isReqsEqual);
    }
}
