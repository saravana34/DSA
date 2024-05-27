class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int n = arr2.length;
        while(j < n) {
            i = swap(arr1, arr2[j++], i);  
        }
        Arrays.sort(arr1, i, arr1.length);
        return arr1;
    }

    int swap(int[] arr, int target, int from) {
        for(int i = from; i < arr.length; i++) {
            if(arr[i] == target) {
                int t = arr[from];
                arr[from++] = arr[i];
                arr[i] = t;
            }
        }
        return from;
    }
}
