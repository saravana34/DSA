public class ReverseQueue {
    static Queue<Integer> reverse(Queue<Integer>  input){
        Stack<Integer> stack = new Stack<>();
        while(!input.isEmpty()) {
            stack.push(input.remove());
        }
        while(!stack.isEmpty()) {
            input.add(stack.pop());
        }
        return input;
    }
}
