public class ShuffleArray {
    public static void main(String[] args) {
        int[] inputArr = { 1, 2, 1};
        System.out.println("Shuffled array is " + getShuffledArray(inputArr));
    }

    public static int[] getShuffledArray(int nums[]) {
        int len = input.length;
        int j = len / 2;
        int k = 0;
        int[] result =  new int[len];
        for(int i = 0; i < len; i++) {
            if(i % 2 == 0) {
                result[i] = input[k];
                k++;
            } else {
                 result[i] = input[j];
                 j++;
            }
        }
        return result;
    }
}
