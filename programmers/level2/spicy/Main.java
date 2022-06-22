package com.company.Algorithm.programmers.level2.spicy;

import java.util.PriorityQueue;

//더 맵게
public class Main {
    public static void main(String[] args) {
        int[] sco = {1,2,3,9,10,12};
        int K = 7;

        int answer = 0;

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i = 0; i < sco.length; i++) {
            q.offer(sco[i]);
        }

        int sum = 0;
        for(int i = 0; i < q.size()-1; i++) {
            if(q.peek() < K) {
                sum = q.poll() + q.poll() * 2;
                q.offer(sum);
            } else {
                answer = i;
                break;
            }
        }
        
        System.out.println(answer);

    }
}
