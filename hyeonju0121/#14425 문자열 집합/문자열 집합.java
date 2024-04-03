import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int solution(String[] arr1, String[] arr2) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr1) {
            map.put(s, 0);
        }
        for (String word : arr2) {
            if (map.containsKey(word)) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        String[] check = new String[N]; // 집합 S 문자열 배열
        for (int i = 0; i < N; i++) {
            check[i] = sc.nextLine();
        }

        String[] arr = new String[M]; // 검사해야하는 문자열 배열
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println(solution(check, arr));
    }
}