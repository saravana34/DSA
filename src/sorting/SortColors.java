public class codefile{
    static int[] solve(int[]  input){
        int tmp = 0, low = 0, mid = 0, high = input.length - 1;
        while(mid <= high) {
            if(input[mid] == 0) {
                tmp = input[low];
                input[low] = input[mid];
                input[mid] = tmp;
                low++;
                mid++;
            } else if(input[mid] == 1) {
                mid++;
            } else if(input[mid] == 2) {
                tmp = input[high];
                input[high] = input[mid];
                input[mid] = tmp;
                high--;
            }
        }
        return input;
    }
}
