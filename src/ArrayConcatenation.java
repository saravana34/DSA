public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] inputArr = { 1, 2, 1};
        System.out.println("Array concatenation is " + getConcatenation(inputArr));
    }

    public static int[] getConcatenation(int nums[]) {
        int len = nums.length;
        int[] ans = new int[len*2];
        for(int i = 0; i < len; i++) {
           ans[i] = nums[i];
           ans[i + len] = nums[i];
        }
        System.gc();
        return ans;
    }
}
