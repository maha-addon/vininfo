public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4};
        int[] temp = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean exists = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) temp[k++] = arr[i];
        }

        System.out.print("After Removing Duplicates: ");
        for (int i = 0; i < k; i++)
            System.out.print(temp[i] + " ");
    }
}