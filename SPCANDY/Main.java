import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			long N = sc.nextLong();
			long K = sc.nextLong();

			System.out.println(solve(N, K));
		}

		sc.close();
	}

	static String solve(long N, long K) {
		if (K == 0) {
			return "0 " + N;
		} else {
			return String.format("%d %d", N / K, N % K);
		}
	}
}
