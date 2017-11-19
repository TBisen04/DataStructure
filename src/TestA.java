import java.util.Scanner;

public class TestA {

	public static void main(String []s){
		Scanner sc =  new Scanner (System.in);
		int n = sc.nextInt();
		 int a[] = new int [n];
		 int b[] = new int [n];
		 
		 for (int i =0 ; i < n ;i++){
			 a[i]= sc.nextInt();
		 }
		 for (int i =0 ; i < n ;i++){
			 b[i]= sc.nextInt();
		 }
		 for(int i=0 ; i < n;i++){
			if(a[i] != b[i]){
				System.out.println(a[i]+ " "+ b[i]);
				break;
			}
			
		 }
	}
}
