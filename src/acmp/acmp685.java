package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp685 {
	void solve(Scanner in, PrintWriter out) {

		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int a3 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int b3 = in.nextInt();

		int minA = Math.min(Math.min(a1, a2), a3);
		int maxA = Math.max(Math.max(a1, a2), a3);
		int avgA = a1 + a2 + a3 - minA - maxA;

		int minB = Math.min(Math.min(b1, b2), b3);
		int maxB = Math.max(Math.max(b1, b2), b3);
		int avgB = b1 + b2 + b3 - minB - maxB;

		out.println(minA * minB + avgA * avgB + maxA * maxB);

	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp685().run();
	}
}
