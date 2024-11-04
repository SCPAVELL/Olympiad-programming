package acmp;

import java.io.*;
import java.util.*;

public class acmp687 {

	void solve(Scanner in, PrintWriter out) {
		int l = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
		int s = 2 * h * (w + l);

		if (s % 16 == 0) {
			out.print(s / 16);
		} else if (s % 16 != 0) {
			out.print(s / 16 + 1);
		}
	}

	void run() {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

	public static void main(String args[]) {
		new acmp687().run();
	}
}