package main.java.bronze.b1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int maxScore = 0;

        for (int i=0; i<size; i++) {
            int score = Integer.parseInt(input[i]);
            if (maxScore < score) {
                maxScore = score;
            }
        }

        float plusScore = 0;
        for (int i=0; i<size; i++) {
            float score = Float.parseFloat(input[i]);
            float result = score/maxScore*100;
            plusScore += result;
        }

        float answer = plusScore / size;

        System.out.print(answer);
    }
}
