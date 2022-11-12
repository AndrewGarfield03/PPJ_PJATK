package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 5, 3, 2, 1, 3, 6, 5, 3};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        int duplicateCount = 0;

        for (int i = 0; i < arr.length; i++){
            int k = i + 1;
            for (int j = k; j < arr.length - duplicateCount; j++){
                if(arr[i] == arr[j]){
                    moveElementsLeft(arr, j);
                    duplicateCount++;
                }
            }
        }
        System.out.println("\nResult:");
        for (int i = 0; i < arr.length - duplicateCount; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    //All elements after duplicate num should be moved to the one position left
    public static void moveElementsLeft(int[] arr, int startPos){
        for (int i = startPos; i < arr.length; i++){
            int nextPos = i+1;
            if(nextPos != arr.length) {
                arr[i] = arr[nextPos];
            }
        }
    }
}
