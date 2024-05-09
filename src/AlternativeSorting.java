public class AlternativeSorting{
    static int[] sort(int[]  arr){
        int n = arr.length;
        int[] temp = new int[n];
        Arrays.sort(arr);
        int i = 0, j = n-1, k = 0;
        while (i < j) {
            temp[k] = arr[j--];
            k++;
            temp[k] = arr[i++];
            k++;
        }
        if (n % 2 != 0) {
            temp[k] = arr[i];
            k++;
        }
        return temp;
    }
}
