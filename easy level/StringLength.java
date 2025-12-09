public class StringLength {
    public static void main(String[] args) {
        String str = "hello";
        int len = 0;

        for (char c : str.toCharArray()) {
            len++;
        }
        System.out.println("Length: " + len);
    }
}