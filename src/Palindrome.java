import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if(isPalindrome(str)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
