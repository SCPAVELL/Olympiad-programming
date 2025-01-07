package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp755 {
	void solve(Scanner in, PrintWriter out) {

		int i = in.nextInt();
		int b = in.nextInt();
		int s = in.nextInt();
		int num = i + b - s;
		out.print(i + b < s ? "Impossible" : num);
	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp755().run();
	}
}
