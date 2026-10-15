import java.util.Scanner;
public class linearQ3 {
	public static int linearSearch(int arr[],int key,int n) {
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(key==arr[i]) {
				count++;
			}
			if(count==n){
				return i;
				
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,10,20,30,10,20,40,30};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key to find nth occurrence:");
		int key=sc.nextInt();
		System.out.println("Enter ocurrence number:");
		int n=sc.nextInt();
		int res=linearSearch(arr,key,n);
		System.out.println(res);
		
		}
}
