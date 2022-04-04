package com.company.Algorithm.programmers.skill.check.level2.pro2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        int answer = 0;
        int cnt = 0;

        Arrays.sort(people);

        for(int i = people.length-1; i > cnt; i--) {
            if(people[i]+people[cnt] <=limit) {
                cnt++;
            }
            answer++;
        }
        System.out.println(answer);
    }
}
