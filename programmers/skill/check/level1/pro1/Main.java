package com.company.Algorithm.programmers.skill.check.level1.pro1;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int answer = 0;

        for(int i = 0; i < nums.length -2; i++) {
            for(int j = i+1; j < nums.length-1; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if(isPrime(num) == 1) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    public static int isPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
