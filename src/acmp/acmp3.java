package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class acmp3 {

	void solve(Scanner in, PrintWriter out) {
		long i = in.nextInt();
		long num = (long) Math.pow(i, 2);
		out.println(num);
	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp3().run();
	}
}
