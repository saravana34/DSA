public class LargestSubArrayProdcut {
    public static void main(String[] args) {
        int[] inputArr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous product is " + subArrayProduct(inputArr));
    }

    public static int subArrayProduct(int arr[]) {
        int len = arr.length;
        int maxProduct = Integer.MIN_VALUE;
        int product = 1;
        for(int i = 0; i < len; i++) {
            product *= arr[i];
            maxProduct = Math.max(maxProduct, product);
            if (arr[i] == 0) {
                product = 1;
            }
        }
        product = 1;

        for(int i = len - 1; i >= 0; i--) {
            product *= arr[i];
            maxProduct = Math.max(maxProduct, product);
            if (arr[i] == 0) {
                product = 1;
            }
        }
        return maxProduct;
    }
}
