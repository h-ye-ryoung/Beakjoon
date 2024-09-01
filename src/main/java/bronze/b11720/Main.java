package main.java.bronze.b11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        char[] array = br.readLine().toCharArray();

        int result = 0;
        for (int i=0; i<size; i++) {
            int number = Character.getNumericValue(array[i]);
            result += number;
        }

        System.out.println(result);
    }
}