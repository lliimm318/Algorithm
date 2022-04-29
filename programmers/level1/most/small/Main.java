package com.company.Algorithm.programmers.level1.most.small;

//제일 작인 수 제거하기
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        int[] answer = new int[arr.length-1];

        int min = arr[0];

        if (arr.length <= 1) {
            int[] answer2 = { -1 };
            System.out.println(answer2);
        }

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (min == arr[j]) {
                continue;
            } else {
                answer[index++] = arr[j];
            }
        }
        System.out.println(answer);
    }
}
