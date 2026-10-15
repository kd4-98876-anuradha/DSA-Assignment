import java.util.Scanner;

public class FiboQ5 {
	public static int fibonacci(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of term:");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			int res=fibonacci(i);
			System.out.print(res+" ");
		}
	}

}
