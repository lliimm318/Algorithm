package com.company.Algorithm.lesson.linearstructure.binarysearch.pro2;

import java.util.Arrays;
import java.util.Scanner;

//pro2 백준 10815 숫자카드
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nArr = new int[n];

        for(int i = 0; i < n; i++){
            nArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] mArr = new int[m];

        Arrays.sort(nArr);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++) {
            if (binarySearch(nArr, sc.nextInt()) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);

    }

    public static int binarySearch(int[] arr, int key) {
        int l = 0;
        int r = arr.length;

        while (l <= r) {
            int mid = (l+r)/2;
            if(arr[mid] < key) {
                l = mid + 1;
            }
            else if(arr[mid] > key) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
