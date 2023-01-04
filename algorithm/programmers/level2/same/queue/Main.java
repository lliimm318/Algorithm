package com.company.Algorithm.algorithm.programmers.level2.same.queue;

import java.util.LinkedList;
import java.util.Queue;

// 118667번 두 큐 합 같게 하기
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1, 1, 1, 1, 1, 10};
        int[] b = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

        System.out.println(solution(a, b));
    }
    public static int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < queue1.length; i++) {
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
            sum1 += queue1[i] ;
            sum2 += queue2[i];
        }

        if ((sum1+sum2) % 2 == 1) {
            return -1;
        }

        int answer = 0;
        while (sum1 != sum2) {
            answer++;

            if (answer > queue1.length * 3) return -1;

            if(sum1 > sum2) {
                int tmp = q1.poll();
                sum1 -= tmp;
                sum2 += tmp;
                q2.offer(tmp);
            }
            else {
                int tmp = q2.poll();
                sum1 += tmp;
                sum2 -= tmp;
                q1.offer(tmp);
            }
        }

        return answer;
    }
}
