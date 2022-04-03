package com.company.Algorithm.programmers.highlevel.hash.pro1;

import java.util.HashMap;

//완주하지 못한 선수
public class Main {
    public static void main(String[] args) {

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String answer = "";

        HashMap<String, Integer> players = new HashMap<>();

        for(String p : participant) {
            players.put(p, players.getOrDefault(p, 0) +1);
        }

        for(String c : completion) {
            players.put(c, players.getOrDefault(c, 0)-1);
        }

        for(String key : players.keySet()) {
            if(players.get(key) != 0) {
                answer = key;
            }
        }

    }
}

