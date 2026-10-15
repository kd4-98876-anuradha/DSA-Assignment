import java.util.Scanner;

public class Q1 {
    
    private int SIZE ;
    private int rear;
    private int front;
    private int[] arr;


    public Q1(int size){
        SIZE = size;
        front = 0;
        rear = 0;
        arr = new int[SIZE];

    }

    public void offer(int value){
        if(isFull()){
            System.out.println("queue is full");
        }else{
            arr[rear] = value;
            rear++; 
        }

    }
    public int poll(){
        int temp = -1;
        if(isEmpty()){
            System.out.println("queue is empty");
        }else{
            temp = arr[front];
            front++;
        }
        return temp;
    }
    public int peek(){
        int temp = -1;
        if(isEmpty()){
            System.out.println("queue is empty");
        }else{
            temp = arr[front];
        
        }
        return temp;


    }
    public boolean isEmpty(){
        return front == rear;

    }

     
    public boolean isFull(){
        return rear == SIZE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1 q = new Q1(4);
        int choice;

        do{ 

            System.out.println("0.exit\n 1.offer\n 2.poll\n 3.peek");
            System.out.print("enter choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("enter value : ");
                    int x = sc.nextInt();
                    q.offer(x);
                    break;
            
                case 2:
                    System.out.println("removed : " + q.poll());
                    break;

                case 3:
                    System.out.println("peek  : " + q.peek() );
            }

        }while(choice != 0);
    }
}
