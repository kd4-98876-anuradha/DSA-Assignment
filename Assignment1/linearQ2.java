import java.util.Scanner;
public class linearQ2 {
	public static int linearSearch(int arr[],int key) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				index=i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int arr[]= {11,10,23,10,11};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key to find last occurrence:");
		int key=sc.nextInt();
		int res=linearSearch(arr,key);
		System.out.println(res);
		
		

	}

}
