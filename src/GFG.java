import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

	public static void main(String[] args) {
		// code
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());

			for (int t = 1; t <= T; t++) {
				int n = Integer.parseInt(br.readLine());
				int a[] = new int[n];
				int b[] = new int[n];
				int c[] = new int[n];
				String line = br.readLine();
				int k = 0;
				int l = 0;
				for (String numStr : line.split("\\s")) {
					int temp = Integer.parseInt(numStr);

					if (temp < 0) {
						a[k++] = -temp;

					} else {
						b[l++] = temp;

					}

				}
				k = 0;
				l = 0;
				Arrays.sort(a);
				Arrays.sort(b);

				k = 0;
				for (int i = 0; i < n; i++) {
					if (b[i] == 0) {
						continue;
					}
					for (int j = 0; j < n; j++) {

						if (a[j] == 0) {
							continue;
						}

						if (b[i] == a[j]) {
							c[k++] = -a[j];
							c[k++] = b[i];
							b[i] = 0;
							a[j] = 0;
							break;
						}

					}
				}

				boolean check = false;
				for (int i = 0; i < n; i++) {

					if (c[i] != 0) {
						check = true;
						System.out.print(c[i] + " ");
					}
				}
				if (!check) {
					System.out.print(0);
				}
				System.out.println();
			}

		} catch (Exception e) {

		}
	}
}