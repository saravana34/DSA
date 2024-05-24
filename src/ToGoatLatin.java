class ToGoatLatin {
    public String toGoatLatin(String sentence) {
        String vowels = "aeiouAEIOU";
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for(String word : words) {
            char c = word.charAt(0);
            if(vowels.indexOf(c) != -1) {
                sb.append(waord);
            } else {
                sb.append(word.substring(1));
                sb.append(c);
            }
            sb.append("ma");
            sb.append("a".repeat(i++));
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}
