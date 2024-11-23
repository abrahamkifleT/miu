
public class Inertial {
    public static int isInertial(int[] a){
        boolean isOdd = false;
        int maxValue = 0;
        for(int i : a){
            if (i % 2 != 0){
                isOdd = true;
            }
            if (i > maxValue){
                maxValue = i;
            }
        }
        if (!isOdd || maxValue % 2 != 0){
            return 0;
        }
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if (i != j){
                   if (a[i] % 2 != 0 && a[j] % 2 == 0 && a[j] != maxValue && a[i] < a[j]){
                       return 0;
                   }
                }
            }
        }
        return 1;
    }

    public static void main(String[] args){
        int [] a = {2};
        int isInertial = isInertial(a);
        System.out.println(isInertial);
    }
}
