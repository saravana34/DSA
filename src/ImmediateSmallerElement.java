public class ImmediateSmallerElement {
    static int[] smaller(int[]  input){
        Stack<Integer> stack = new Stack<Integer>();
        int len = input.length;
        int[] res = new int[len];
        int j = 0;
        for(int i = len - 1; i >= 0; i--) {
            if(!stack.empty() && stack.peek() < input[i]) {
                res[i] = stack.peek();
                stack.push(input[i]);
            } else {
                res[i] = -1;
                stack.push(input[i]);
            }
        }
        return res;
    }
}
