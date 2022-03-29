package com.company.Algorithm.lesson.linearstructure.binarysearch.lowerbound;

import java.util.Scanner;

//pro1 lower bound
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int l = 0;
        int r = arr.length;
        int m = arr.length/2;

        while (l <= r) {
            m = (l+r)/2;
            if(arr[r-1] < k) {
                m = arr.length;
                break;
            }

            else if(arr[m] > k) {
                r = m-1;
            }
            else if(arr[m] < k) {
                l = m+1;
            }
            else if(arr[m] == k) {
                break;
            }
       }

        if (arr[m] != k) {
            System.out.println(m + 1);
        } else {
            System.out.println(m);
        }
    }
}
