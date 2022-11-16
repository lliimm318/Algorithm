package com.company.Algorithm.algorithm.programmers.level2.skill;

//스킬 트리
public class Main {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        int answer = 0;

        for(int i = 0; i < skill_trees.length; i++) {
            StringBuilder sb = new StringBuilder();
            String skills = skill_trees[i];
            for(int j = 0; j < skills.length(); j++) {
                if(skill.contains(String.valueOf(skills.charAt(j)))) {
                    sb.append(skills.charAt(j));
                }
            }

            for (int j = skill.length(); j>-1; j--) {
                String s = skill.substring(0, j);
                if(s.equals(sb.toString())) {
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);

    }
}
