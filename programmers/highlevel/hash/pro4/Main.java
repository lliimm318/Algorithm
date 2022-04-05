package com.company.Algorithm.programmers.highlevel.hash.pro4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        HashMap<String, Integer> music = new HashMap<>();
        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < genres.length; i++) {
            String key = genres[i];
            music.put(key, music.getOrDefault(key, 0)+plays[i]);
        }

        ArrayList<String> list = new ArrayList<>(music.keySet());

        list.sort((v1,  v2) -> (music.get(v2)).compareTo(music.get(v2)));

        for(String s : list) {
            int se = 0;
            int max = 0;
            int tmp = 0;

            for (int i = 0; i < genres.length; i++) {
                if(s.equals(genres[i])) {
                    if(plays[i] > max) {
                        max = plays[i];
                        tmp = i;
                    }
                }
            }
            max = 0;
            for (int i = 0; i < genres.length; i++) {
                if(s.equals(genres[i])) {
                    if(i != tmp && plays[i]>max) {
                        max = plays[i];
                        se = i;
                    }
                }
            }
            num.add(tmp);

            if(max!=0) {
                num.add(se);
            }
        }

        int[] answer = new int[num.size()];

        for(int i = 0; i< num.size();i++){
            answer[i] = num.get(i);
        }

    }
}
