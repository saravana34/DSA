import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Anagram {
    static int totalChars = 256;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter input 1");
        String str1 = in.nextLine();
        System.out.println("Enter input 2");
        String str2 = in.nextLine();
        if(isAnagram(str1, str2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int counter1[] = new int[totalChars];
        int counter2[] = new int[totalChars];
        Arrays.fill(counter1, 0);
        Arrays.fill(counter2, 0);
        for(int i = 0; i < str1.length(); i++) {
            counter1[str1.charAt(i)]++;
            counter2[str2.charAt(i)]++;
        }

        for(int i = 0; i < totalChars; i++) {
            if (counter1[i] != counter2[i])
                return false;
        }
        return true;
    }
}
