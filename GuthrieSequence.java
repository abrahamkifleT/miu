public class GuthrieSequence {

    public static int isGuthrieSequence(int[] a){
        if (a.length == 0 || a[a.length - 1] != 1){
            return 0;
        }
        int start = a[0];
        int i = 1;
       while(start != 1){
           if (start % 2 == 0){
               start /= 2;
           }else{
               start = start * 3 + 1;
           }
           if (start != a[i]){
               return 0;
           }
           i++;
       }
       return 1;
    }


    public static void main(String[] args){
    int []a = {8,4,2};
    int isGuthrieSequence = isGuthrieSequence(a);
        System.out.println(isGuthrieSequence);
    }
}
