public class PlusOne {
  public static void main(String[] args) {
        int[] inputArr = { 1, 2, 3 };
        System.out.println("Plus one is " + plusOne(inputArr));
    }

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int sum = 0;
        for(int i = len - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
