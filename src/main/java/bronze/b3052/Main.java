package main.java.bronze.b3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<10; i++) {
            int k = Integer.parseInt(br.readLine());
            int l = k % 42;
            map.put(l, 1);
        }
        System.out.println(map.size());
    }
}
