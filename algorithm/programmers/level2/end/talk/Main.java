package com.company.Algorithm.algorithm.programmers.level2.end.talk;

import java.util.ArrayList;
import java.util.List;

// 12981번 영어 끝말잇기
public class Main {
    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        int[] answer = new int[2];
        boolean right = true;
        List<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() == 1) {
                break;
            }

            if(list.contains(words[i])) {
                answer[0] = (i%n) +1;
                answer[1] = (i/n) +1;
                right = false;
                break;
            }
            list.add(words[i]);

            if (i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
                answer[0] = (i%n) +1;
                answer[1] = (i/n) +1;
                right = false;
                break;
            }
        }
        if(right) {
            answer[0] = 0;
            answer[1] = 0;
        }

        System.out.println(answer);
    }
}
