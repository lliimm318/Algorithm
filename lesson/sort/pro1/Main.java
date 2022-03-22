package com.company.Algorithm.lesson.sort.pro1;

//교환 횟수 구하기
public class Main {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {4, 1, 6, 2, 7, 5, 3};

        int tmp = 0;
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr [j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;

                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
