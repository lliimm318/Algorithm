package com.company.Algorithm.lesson.dc.z;

import java.util.Scanner;

//백준 1074번 z
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[n];
        arr = getPosition(n, r, c);

        int num = 0;
        for(int i = 0; i < n; i++) {
            num += (int)Math.pow(4, n-i-1) * (arr[i]-1);
        }
        System.out.println(num);

    }
    public static int[] getPosition(int n, int r, int c) {
        int[] arr = new int[n];
        int leftR = 0;
        int leftC = 0;

        int rightR = (int)Math.pow(2,n) - 1, rightC = rightR;
        int pivR = (leftR+rightR)/2 + 1;
        int pivC = (leftC+rightC)/2 + 1;

        for(int i = n; i >= 1; i--) {
            if(r < pivR && c<pivC) {
                arr[n-i] = 1;
                rightR = pivR - 1;
                rightC = pivC - 1;
            }
            else if(r < pivR && c>=pivC) {
                arr[n-i]=2;
                leftC = pivC;
                leftR = pivR - (int)Math.pow(2, i-1);
                rightR = leftR + (int)Math.pow(2, i-1)-1;
                rightC = leftC + (int)Math.pow(2, i-1)-1;
            }
            else if(r>=pivR && c<pivC) {
                arr[n-i]=3;
                leftR = pivR;
                leftC = pivC - (int)Math.pow(2, i-1);
                rightR = leftR + (int)Math.pow(2, i-1)-1;
                rightC = leftC + (int)Math.pow(2, i-1)-1;
            } else {
                arr[n-i]=4;
                leftR = pivR;
                leftC = pivC;
            }
            pivR = (leftR + rightR) / 2 + 1;
            pivC = (leftC + rightC) / 2 + 1;
        }
        return arr;
    }
}
