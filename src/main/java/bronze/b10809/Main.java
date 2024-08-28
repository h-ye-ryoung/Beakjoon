package main.java.bronze.b10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String input = br.readLine();
        char[] inputList = input.toCharArray(); // 문자열을 char 배열로 변환

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<inputList.length; i++) {
            if (!map.containsKey(inputList[i])) { //해당 키가 없을 때만 삽입. 키가 존재하면 무시됨
                map.put(inputList[i], i);
            }
        }

        for(char ch = 'a'; ch<='z'; ch++) {
            sb.append(map.getOrDefault(ch, -1)).append(" ");
        }

        System.out.println(sb);
    }
}
