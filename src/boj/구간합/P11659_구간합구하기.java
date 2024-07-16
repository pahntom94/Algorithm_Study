package boj.구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @link https://www.acmicpc.net/problem/11659
 */
public class P11659_구간합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 숫자 개수
        int M = Integer.parseInt(st.nextToken());   // 질의 개수
        long[] S = new long[N + 1];                 // 합배열

        // 합배열
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < S.length; i++) {
            // 합배열 공식 S[i] = S[i - 1] + A[i]
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }

        // 질의 i 와 j 사의의 구간합
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());   // 범위1
            int j = Integer.parseInt(st.nextToken());   // 범위2

            // 구간합 공식 S[j] - S[i-1]
            System.out.println(S[j] - S[i - 1]);
        }
    }
}
