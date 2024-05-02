public class ReverseString{
    static String reverseString(String s){
		String res = "";
        String[] words = s.split(" ");
        for(int i = words.length - 1; i >= 0; i--) {
            res += words[i] + " ";
        }
        return res.substring(0, res.length() - 1);
    }
}
