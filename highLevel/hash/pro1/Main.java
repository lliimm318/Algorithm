package com.company.highLevel.hash.pro1;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String answer = "";

        HashMap<String, Integer> players = new HashMap<>();

        for (String p : participant) {
            players.put(p, players.getOrDefault(p, 0)+1);
        }
        System.out.println(players);

        for (String c : completion) {
            players.put(c, players.get(c)-1);
        }

        for (String keySet : players.keySet()) {
            if(players.get(keySet) != 0) {
                answer = keySet;
            }
        }
        System.out.println(answer);
    }
}

