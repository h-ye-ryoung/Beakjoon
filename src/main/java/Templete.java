package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메롱이를 위한 백준 템플릿
public class Templete {
    // 입력(메모리에 좋은 방식)
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 출력(메모리에 좋은 방식)
    static StringBuilder sb = new StringBuilder();
    // 자주 써야할 주요 변수들은 static으로 선언
    static int N;

    public static void main(String[] args) throws IOException {
        // 입력은 br.readLine()으로 받기.
        N = Integer.parseInt(br.readLine()); // 정수형은 Integer.parseInt로 형변환 해주기

        // ex) 1 2 3 4 5 => 띄워쓰기로 나눠 받는 경우, split 함수로 쪼개서 담기.
        String[] input = br.readLine().split(" ");
        int[] numbers = new int[N];
        for(int i = 0; i < N; i++){
            // 정수 배열에 담고 싶을땐 이런식으로 담기
            numbers[i] = Integer.parseInt(input[i]);
        }

        for(int i = 0; i < N; i++){
            // 출력하고 싶은 내용 sb에 담기 -> println보다 sb에 "\n"으로 줄바꿈을 추가하는게 메모리에 좋음.
            sb.append(i + "\n");
        }
        // 최종 출력은 print문으로 sb 출력
        System.out.print(sb);
    }

    // 로직을 함수로 정리하고 싶으면 static으로 선언
    static void utils(){
        // static으로 선언한 주요 변수는 파라미터 없이 이렇게 바로 접근할 수 있음 => 가독성 up
        int n = N;
    }
}

