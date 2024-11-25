public class Centered15 {

    public static int isCentered15(int[] a){
      int midVal = a.length/2;
      int centerSum = a[midVal];
      for (int left = midVal - 1, right = midVal + 1; left >= 0 && right <= a.length - 1; left--,right++){
          if (centerSum < 15){
              centerSum += a[left] + a[right];
          }
          if (centerSum == 15){
              int preceded = preceded(left);
              int followed = followed(right, a.length-1);
              if (preceded == followed){
                  return 1;
              }
          }
      }
      return 0;
    }
    public static int preceded(int index){
        int precedeValue = 0;
        for (int i = 0; i <= index; i++){
            precedeValue++;
        }
        return precedeValue;
    }
    public static int followed(int fIndex, int lIndex){
        int followedValue = 0;
        for (int i = fIndex; i <= lIndex; i++){
            followedValue++;
        }
       return followedValue;
    }


    public static void main(String[] args){
        int [] a = {3, 2, 10, 4, 1, 6, 9};
        int isCenter = isCentered15(a);
        System.out.println(isCenter);
    }

}
