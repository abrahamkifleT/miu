public class NupCount {
    public static int nUpCount(int[]a, int n){
        int pSum = 0; // pSum == previousSum
        int nSum = a[0]; // nSUm == nextSum
        int upCount = 0;
       for (int i = 1 ; i < a.length; i ++){
           pSum = nSum;
           nSum += a[i];
           if (pSum <= n && n < nSum){
               upCount++;
           }
       }
       return upCount;
    }

    public static void main(String[] args){
        int [] a = {};
        int n = 6;
        int nUpCountNumber = nUpCount(a,n);
        System.out.println(nUpCountNumber);
    }
}
