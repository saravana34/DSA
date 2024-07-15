public class Print1ToN{
    static int[] solve(int n){
        int[] res = print(n);
        return res;
    }
    public static int[] print(int n) {
        if(n == 0){
            return new int[0];
        } else {
            int[] prevArray = print(n - 1);
            int[] newArray = Arrays.copyOf(prevArray, prevArray.length + 1);
            newArray[prevArray.length] = n;
            return newArray;
        }
    }
}
