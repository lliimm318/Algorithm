package com.company.Algorithm.programmers.highlevel.sq.pro1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//기능개발
public class Main {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30 , 5};

        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++) {
            queue.add((int) (Math.ceil(100.0 - progresses[i]) / speeds[i]));
        }

        while (!queue.isEmpty()) {
            int day = queue.poll();
            int cnt = 1;

            while (!queue.isEmpty() && day >= queue.peek()) {
                queue.poll();
                cnt++;
            }
            answer.add(cnt);
        }

        answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
