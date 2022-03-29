package com.company.Algorithm.lesson.linearstructure.binarysearch.pro1;

import java.util.Arrays;
import java.util.Scanner;

//pro1 백준 1920 수 찾기
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nArr = new int[n];

        for(int i = 0; i < n; i++){
            nArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] mArr = new int[n];

        Arrays.sort(nArr);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++) {
            if (search(nArr, sc.nextInt()) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);

    }
    public static int search(int[] arr, int key) {

        int l = 0;
        int r = arr.length-1;

        while (l <= r) {
            int mid = (l+r)/2;

            if (key < arr[mid]) {
                r = mid-1;
            }
            else if(key > arr[mid]) {
                l = mid+1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}
