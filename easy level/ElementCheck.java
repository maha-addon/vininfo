public class ElementCheck {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 3;
        boolean found = false;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                found = true;
                break;
            }
        }
        System.out.println("Found: " + found);
    }
}
