package com.company.Algorithm.programmers.level2.pair;

import java.util.Stack;

// 짝지어 제거하기
public class Main {
    public static void main(String[] args) {
        String s = "cdcd";

        int answer = 0;
        Stack<Character> stack = new Stack<>();

        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            if(stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        if(stack.size() == 0) {
            answer = 1;
        }
        System.out.println(answer);
    }
}
