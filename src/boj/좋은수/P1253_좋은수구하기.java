package boj.좋은수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @link https://www.acmicpc.net/problem/1253
 */
public class P1253_좋은수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int count = 0;
        long[] arr = new long[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        // 배열에 데이터 저장하기
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        // 배열 정렬하기
        Arrays.sort(arr);

        // n 만큼 반복하기
        for (int i = 0; i < n; i++) {
            long find = arr[i];
            int start = 0;
            int end = n - 1;

            // 투 포인터 알고리즘
            while (start < end) {
                if (arr[start] + arr[end] == find) {
                    if (start != i && end != i) {
                        count++;
                        break;
                    } else if (start == i) {
                        start++;
                    } else if (end == i) {
                        end--;
                    }
                } else if (arr[start] + arr[end] < find) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        // 좋은 수의 개수 출력
        System.out.println(count);
        bf.close();
    }
}
