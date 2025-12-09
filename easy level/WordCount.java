public class WordCount {
    public static void main(String[] args) {
        String str = "I am learning Python";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                count++;
        }
        count++;
        System.out.println("Words: " + count);
    }
}
