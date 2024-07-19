public class InversionCountArray{
    static int merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int count = 0;
        int index = 0;

        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[index++] = arr[left];
                left++;
            } else {
                temp[index++] = arr[right];
                count += (mid - left + 1);
                right++;
            }
        }

        while(right <= high) {
            temp[index++] = arr[right];
            right++;
        }

        for(int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
        return count;
    }
    static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if(low >= high) {
            return count;
        }
        int mid = (low + high) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
        return count;
    }

    static int count(int[]  input){
        return mergeSort(input, 0, input.length - 1);
    }
}
