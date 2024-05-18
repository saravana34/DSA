public class codefile{
    static int sum(int[]  input){
        Arrays.sort(input);
        int len = input.length;
        int a = 0, b = 0;
        for(int i = 0; i < len; i++){
             if((i & 1) == 1) {
                  a = a * 10 + input[i];
             } else {
                  b = b * 10 + input[i];
             }
        }
        return a + b;
    }
}
