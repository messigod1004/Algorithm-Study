import java.util.Scanner;

public class continuousNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int count = 1;
        int start_idx = 1;
        int end_idx = 1;
        int sum = 1;

        while (end_idx != N) {
            if (sum == N) {
                count++;
                end_idx++;
                sum += end_idx;
            } else if (sum > N) {
                sum -= start_idx;
                start_idx++;
            } else {
                end_idx++;
                sum += end_idx;
            }
        }
        System.out.println(count);
    }
}