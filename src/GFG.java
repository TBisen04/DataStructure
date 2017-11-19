import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	

	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		
		for (int t =1 ; t<=T ; t++ ) {
			int n= sc.nextInt();
			int []result = new int [100000];
			
			for (int i=0; i < n;i++){
				  int temp  =sc.nextInt();
				  result[temp-1]= result[temp-1]+1;
			}
			int temp=0;
			System.out.println();
			for (int i=0; i < 100000;i++){
				  if (result[i]!=0){
					  temp =temp+ result[i];
					  System.out.print(temp + " ");
				  }
				  
			}
			
			
		}
		
		
	}
}