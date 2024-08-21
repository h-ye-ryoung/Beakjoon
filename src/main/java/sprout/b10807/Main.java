package main.java.sprout.b10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] numbers = new int[size];

        int target = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i=0; i<size; i++) {
            numbers[i] = Integer.parseInt(input[i]);
            if (numbers[i] == target) {
                result++;
            }
        }

        sb.append(result);
        System.out.println(sb);
    }
}
