import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

	public static void main(String[] args) {
		// code
		try {
			BufferedReader br = new 
					BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());

			for (int t = 1; t <= T; t++) {
				int n = Integer.parseInt(br.readLine());
				int a[] = new int [n];
				int k=0;
                int max = -100000;
				

				String line = null;
				line = br.readLine();
              while (line !=null){
            	  
					for (String numStr : line.split("\\s")) {
						int temp = Integer.parseInt(numStr);
						if ( temp > max){
							max=temp;
						}
						a[k++]=temp;
						
					}
					if ( k == n){
						break;
					}
					line = br.readLine();
            	  
               }
             
				int[] result = new int[max];
				for (int i=0; i < n ; i++) {
					

					result[a[i] - 1] = result[a[i] - 1] + 1;
				}

				int temp = 0;
				
				for (int i = 0; i < max; i++) {
					if (result[i] != 0) {
						temp = temp + result[i];
						System.out.print(temp + " ");
					}

				}
				System.out.println();
			}

		} catch (Exception e) {
          
		}
	}
}