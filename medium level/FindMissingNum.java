import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] arr ={2,3,1,5};

        for (int i = 0; i < arr.length; i++) {
            for(int j=i;j<arr.length;j++){
                if (arr[j] < arr[i]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i+1){
                System.out.println("Missing number: " + (i-1));
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
