public class ListToString {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        System.out.println("String: " + result);
    }
}
