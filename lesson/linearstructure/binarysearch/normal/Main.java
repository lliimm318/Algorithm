package com.company.Algorithm.lesson.linearstructure.binarysearch.normal;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 20, 30};

        int l = 0;
        int r = arr.length;
        int m = arr.length/2;

        int num = 2;
        boolean answer = false;

        while (l <= r) {
            m = (l+r)/2;
            if(arr[m] > num) {
                r = m-1;
            }
            else if(arr[m] < num) {
                l = m+1;
            }
            else if(arr[m] == num) {
                answer = true;
            }
        }
        System.out.println(answer);
    }
}
