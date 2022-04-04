package com.company.Algorithm.programmers.level1.normal.knumber;

import java.util.Arrays;

//k 번째 수
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int[] tmp = new int[commands[i][1]-(commands[i][0]-1)];
            for(int j = 0; j < tmp.length; j++){
                tmp[j] = array[j+(commands[i][0]-1)];
            }
            Arrays.sort(tmp);
            answer[i] = tmp[commands[i][2]-1];
        }

    }
}
