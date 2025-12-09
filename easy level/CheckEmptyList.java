public class CheckEmptyList {
    public static void main(String[] args) {
        int[] arr = {};  // empty array
        boolean isEmpty = true;

        if (arr.length > 0) {
            isEmpty = false;
        }

        System.out.println("Is Empty: " + isEmpty);
    }
}