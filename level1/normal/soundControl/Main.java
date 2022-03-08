package com.company.Algorithm.level1.normal.soundControl;
//음향 더하기
public class Main {
    public static void main(String[] args) {

        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int[] arr = new int[signs.length];
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            if (signs[i] == false) {
                arr[i] = -1;
            } else {
                arr[i] = 1;
            }
        }

        for (int i = 0; i < absolutes.length; i++) {
            answer += absolutes[i] * arr[i];
        }

        System.out.println(answer);
    }
}
