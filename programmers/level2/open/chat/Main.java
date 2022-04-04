package com.company.Algorithm.programmers.level2.open.chat;

import java.util.HashMap;

//오픈채팅방
public class Main {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        HashMap<String, String> hashMap = new HashMap<>();
        int cnt = 0;

        for(int i = 0; i < record.length; i++) {
            String[] data = record[i].split(" ");

            if(data[0].equals("Enter")) {
                hashMap.put(data[1], data[2]);
            }
            else if(data[0].equals("Change")) {
                hashMap.put(data[1], data[2]);
                cnt++;
            }
        }

        String[] answer = new String[record.length - cnt];
        int index = 0;

        for(int i = 0; i < record.length; i++) {
            String[] data = record[i].split(" ");
            String name = hashMap.get(data[1]);

            if(data[0].equals("Enter")){
                answer[index++] = name + "님이 들어왔습니다.";
            } else if(data[0].equals("Leave")){
                answer[index++] = name + "님이 나갔습니다.";
            }
            System.out.println(answer[i]);
        }

    }
}
