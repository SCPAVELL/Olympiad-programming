package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp1118 {
	void solve(Scanner in, PrintWriter out) {
		int h = in.nextInt();
		int up = in.nextInt();
		int down = in.nextInt();

		out.print(Math.max(1, 1 + (h - down - 1) / (up - down)));

	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp1118().run();
	}
}
