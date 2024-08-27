package main.java.bronze.b15727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int distance = Integer.parseInt(br.readLine());
        int result = 0;

        if (distance % 5 == 0) {
            result = distance/5;
        } else {
            result = distance/5+1;
        }

        System.out.println(result);
    }
}