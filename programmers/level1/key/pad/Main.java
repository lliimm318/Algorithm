package com.company.Algorithm.programmers.level1.key.pad;

//키패드 누르기
public class Main {
    public static void main(String[] args) {
        int[] number = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";

        solution(number, hand);
    }
    private static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int handL = 10;
        int handR = 12;


        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                handL = number;
            }
            else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                handR = number;
            }
            else {
                if (number == 0) number = 11;

                int leftD = Math.abs(number-handL)/3 + Math.abs(number-handL)%3;
                int rightD = Math.abs(number-handR)/3 + Math.abs(number-handR)%3;

                if (leftD < rightD) {
                    answer.append("L");
                }
                else if (leftD > rightD) {
                    answer.append("R");
                }
                else {
                    if (hand.equals("right")) {
                        answer.append("R");
                        handR = number;
                    }
                    else {
                        answer.append("L");
                        handL = number;
                    }
                }
            }
        }

        return answer.toString();
    }
}
