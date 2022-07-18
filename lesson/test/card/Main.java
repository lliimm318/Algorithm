package com.company.Algorithm.lesson.test.card;

import java.util.Arrays;
import java.util.Scanner;

//백준 10816 숫자카드
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int m = sc.nextInt();
        int[] mArr = new int[m];

        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextInt();
        }
        Arrays.sort(mArr);

        int s = sc.nextInt();
        int[] sArr = new int[s];
        for (int i = 0; i < s; i++) {
            sArr[i] = sc.nextInt();
            sb.append(upperBound(mArr, sArr[i]) - lowerBound(mArr, sArr[i])).append(' ');
        }
        System.out.println(sb);
    }

    private static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;

            if (target <= arr[mid]) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    private static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;

            if (target < arr[mid]) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}
