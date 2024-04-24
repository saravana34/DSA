public class MaxAscendingSum {
  public static void main(String[] args) {
        int[] inputArr = { 0,2,1,5,3,4 };
        System.out.println("Permutated array is " + build(inputArr));
    }
    public static int[] build(int[]  input){
        int len = input.length;
        int[] perm = new int[len];
        for(int i = 0; i < len; i++) {
            perm[i] = input[input[i]];
        }
        return perm;
    }
}
