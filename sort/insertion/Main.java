package com.company.Algorithm.sort.insertion;

//선택 정렬 Insertion Sort
public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 1, 4, 5, 18, 30, 9, 50};
        int key = 0;
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            for(j = i-1; j >= 0 && arr[j] > key; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
    }
}
