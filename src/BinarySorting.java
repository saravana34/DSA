public class BinarySorting{
    static int[] sort(int[]  input){
        int len = input.length;
        int ones = 0, zeros = 0;
        for(int i = 0; i < len; i++) {
            if(input[i] == 0) {
                zeros++;
            } else if(input[i] == 1) {
                ones++;
            }
        }
        int[] aux = new int[len];
        int i = 0;
        while(zeros > 0) {
            aux[i] = 0;
            zeros--;
            i++;
        }
        while(ones > 0) {
            aux[i] = 1;
            ones--;
            i++;
        }
        return aux;
    }
}
