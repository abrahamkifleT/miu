public class SquarePair {
    public static int countSquarePairs(int[] a){
        int countSquare = 0;
        for (int x = 0; x < a.length; x++){
            for (int y = 0; y < a.length; y++){
                if (a[x] < a[y] && a[x] > 0 && a[y] > 0){
                    int isPerfect = isPerfectSquare(a[x] + a[y]);
                    if (isPerfect == 1){
                        countSquare++;
                    }
                }
            }
        }
        return countSquare;
    }

    public static int isPerfectSquare(int n){
        for (int i = 1; i < n; i++){
            if (i * i == n){
                return 1;
            }
            if (i * i > n){
                return 0;
            }
        }
        return 0;
    }


    public static void main(String[] args){
        int [] a = {9};
        int squarePair = countSquarePairs(a);
        System.out.println(squarePair);
    }
}
