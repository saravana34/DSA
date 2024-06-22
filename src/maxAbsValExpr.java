class Solution {
   /* public static int findMax(int[] arr, int n){
        int maxSum = arr[0], minSum = arr[0];
        for(int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, arr[i]);
            minSum = Math.max(minSum, arr[i]);
        }
        return (maxSum - minSum);
    }*/
    public int maxAbsValExpr(int[] a, int[] b) {
        /*int len = arr1.length;
        int[] first = new int[len];
        int[] second = new int[len];
        int[] third = new int[len];
        int[] fourth = new int[len];

        for(int i = 0; i < len; i++) {
            first[i] = arr1[i] + arr2[i] + i;
            second[i] = arr1[i] - arr2[i] + i;
            third[i] = arr1[i] + arr2[i] - i;
            fourth[i] = arr1[i] - arr2[i] - i;
        }
        return Math.max(Math.max(findMax(first, len), findMax(second, len)), Math.max(findMax(third, len), findMax(fourth, len)));*/
        int N = a.length, res = 0;
        int maxmm = Integer.MIN_VALUE / 2;
        int maxmp = Integer.MIN_VALUE / 2;
        int maxpm = Integer.MIN_VALUE / 2;
        int maxpp = Integer.MIN_VALUE / 2;
        for (int i = 0; i < N; i++) {
            maxmm = Math.max(maxmm, -a[i] - b[i] - i);
            maxmp = Math.max(maxmp, -a[i] + b[i] - i);
            maxpm = Math.max(maxpm, a[i] - b[i] - i);
            maxpp = Math.max(maxpp, a[i] + b[i] - i);
            res = Math.max(res, maxmm + a[i] + b[i] + i);
            res = Math.max(res, maxmp + a[i] - b[i] + i);
            res = Math.max(res, maxpm - a[i] + b[i] + i);
            res = Math.max(res, maxpp - a[i] - b[i] + i);
        }
        return res;
    }
}
