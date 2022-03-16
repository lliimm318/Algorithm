package com.company.Algorithm.level1.normal.decimal;

import java.util.ArrayList;
import java.util.List;

//소수 만들기
public class Main {
    public static void main(String[] args) {
        int[] answer = {1,2,3,4,5};

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;

        for (int i = 0; i < answer.length; i++) {
            if(a[i] == answer[i]) {
                result1++;
            }
            else if(b[i] == answer[i]) {
                result2++;
            }
            else if(c[i] == answer[i]) {
                result3++;
            }
        }
        int max = Math.max(result1, Math.max(result2, result3));
        int[] answers = {};

          if (result1 == max) {
                answers[0] = 1;
            }
            else if (result2 == max) {
                if (answers[0] != 0) {
                    answers[1] = 2;
                } else {
                    answers[0] = 2;
                }
            }
            else if(result3 == max) {
                if(answers[0] != 0) {
                    if (answers[1] != 1) {
                        answers[2] = 3;
                    } else {
                        answers[1] = 3;
                    }
                } else {
                    answers[0] = 3;
                }
          }


    }

}
