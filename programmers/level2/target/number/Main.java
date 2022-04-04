package com.company.Algorithm.programmers.level2.target.number;

//타겟넘버
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;

        int answer = dfs(numbers, 0, 0, target);

    }
    public static int dfs(int[] numbers, int depth, int sum, int target) {
        if(depth== numbers.length) {
            if(target == sum) return 1;
            else return 0;
        } else
            return dfs(numbers,depth+1, sum+numbers[depth], target)
            + dfs(numbers, depth+1, sum-numbers[depth],target);
    }
}
