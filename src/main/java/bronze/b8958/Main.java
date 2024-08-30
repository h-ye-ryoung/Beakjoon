package main.java.bronze.b8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());

        for (int i=0; i<size; i++) {
            String input = br.readLine();
            char[] array = input.toCharArray();
            int[] result = new int[array.length];

            if (array[0] == 'O') {
                result[0] = 1;
            } else {
                result[0] = 0;
            }

            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] == 'O' && array[j] == 'O') {
                    result[j] = result[j - 1] + 1;
                } else if (array[j - 1] == 'X' && array[j] == 'O') {
                    result[j] = 1;
                } else {
                    result[j] = 0;
                }
            }

            int resultSize = 0;
            for (int k = 0; k < result.length; k++) {
                resultSize += result[k];
            }

            sb.append(resultSize + "\n");
        }

        System.out.print(sb);
    }
}
