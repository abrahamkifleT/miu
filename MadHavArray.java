public class MadHavArray {
    public static int isMadhavArray(int[] a){
        boolean isEqualN = false;
        for (int i = 1, j = 2; i < a.length; j++){
            int mLength = j;
            int mSum = 0;
           while(mLength != 0 && i < a.length){
               mSum += a[i];
               if (i * (i + 1)/ 2 == a.length){
                   isEqualN = true;
               }
               mLength--;
               i++;
           }
           if (mSum != a[0]){
               return 0;
           }
        }
        if (!isEqualN){
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String[] args){
        int []a = {3, 1, 2, 3, 0};
        int isMadHav = isMadhavArray(a);
        System.out.println(isMadHav);
    }
}
