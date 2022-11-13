package com.company.Algorithm.programmers.level3.stone;

// 64062번 징검다리 건너기
public class Main {
    public static void main(String[] args) {
        int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
        System.out.println(solution(stones, 3));
    }

    static int solution(int[] stones, int k) {
        int answer = 0;
        int left = 1;
        int right = 200000000;

        while (left <= right) {
            int mid = (left + right) / 2;
            if(count(stones, mid, k)) {
                left = mid + 1;
                answer = mid;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }
    static boolean count(int[] stones, int mid, int k) {
        int count = 0;
        for (int stone : stones) {
            if (stone < mid) {
                count++;
                if (count >= k) return false;
            }
            else {
                count = 0;
            }
        }
        return true;
    }
}