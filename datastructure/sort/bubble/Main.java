package com.company.Algorithm.datastructure.sort.bubble;

//버블 정렬 Bubble sort
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 1, 4, 5, 18, 30, 9, 50};
        int tmp = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =tmp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
