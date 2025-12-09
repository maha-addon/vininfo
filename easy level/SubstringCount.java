public class SubstringCount {
    public static void main(String[] args) {
        String str = "ababababab";
        String sub = "ab";
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            boolean match = true;
            for (int j = 0; j < sub.length(); j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) count++;
        }
        System.out.println("Occurrences: " + count);
    }
}