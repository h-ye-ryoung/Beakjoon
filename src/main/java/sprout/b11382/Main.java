package main.java.sprout.b11382;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String[] inputs = br.readLine().split(" ");
        long[] numbers = new long[3];

        long result = 0;
        for(int i=0; i<3; i++) {
            numbers[i] = Long.parseLong(inputs[i]);
            result += numbers[i];
        }

        sb.append(result);
        System.out.println(sb);
    }
}
