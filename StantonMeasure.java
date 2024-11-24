public class StantonMeasure {

    public static int stantonMeasure(int[] a){
        int stantonSum = 0;
        int allStantonCount = 0;
        for (int i : a){
            if (i == 1){
                stantonSum += i;
            }
        }
        for (int i : a){
            if (i == stantonSum){
                allStantonCount++;
            }
        }
        return allStantonCount;
    }


    public static void main(String[] args){
        int [] a = {};
        int isStanton = stantonMeasure(a);
        System.out.println(isStanton);
    }
}
