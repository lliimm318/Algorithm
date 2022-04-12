package com.company.Algorithm.programmers.level2.skill;

//스킬 트리
public class Main {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        int answer = 0;

        for(int i = 0; i < skill_trees.length; i++) {
            for(int j = 0; j < skill.length(); j++) {
                for(int k = 0; k < skill_trees[i].length(); k++) {
                    if(skill_trees[i].charAt(k) == skill.charAt(0)) {
                        answer++;
                    }
                }
            }
        }

    }
}
