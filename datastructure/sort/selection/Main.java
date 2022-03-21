package com.company.Algorithm.datastructure.sort.selection;

//선택 정렬 Selection Sort
public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 1, 4, 5, 18, 30, 9, 50};
        int min = 0;
        int tmp = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[min] > arr [j]) {
                    min = j;
                }
            }
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }
}
