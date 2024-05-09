public class codefile{
    static boolean check(int[]  input1,int[] input2){
        int ip1Len = input1.length;
        int ip2Len = input2.length;
        if(ip1Len != ip2Len) {
            return false;
        }
        int[] sorted1 = sortArr(input1);
        int[] sorted2 = sortArr(input2);
        for(int i = 0; i < ip1Len; i++) {
            if(input1[i] != input2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] sortArr(int[] arr) {
        int len = arr.length;
        int temp;
        boolean isSwapped = false;
        for(int i = 0; i < len - 1; i++) {
            isSwapped = false;
            for(int j = 0; j < len - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) {
                break;
            }
        }
        return arr;
    }
}
