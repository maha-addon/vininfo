1. Reverse Words in a String

import java.util.*;
class Main {
    public static void main(String[] args) {
        String str="i am maha";
        String [] arr=str.split(" ");
        String [] result= new String[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=arr[arr.length-1-i];
        }
        System.out.println("reverse string word:"+Arrays.toString(result));
    }
}

2. Find the Longest Word in a Sentence
