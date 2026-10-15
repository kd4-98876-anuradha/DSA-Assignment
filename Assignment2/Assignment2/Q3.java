import java.util.Scanner;

public class Q3 {
     private int SIZE;
    private int rear;
    private int front;
    private int[] arr;
    private int counter;

    public Q3(int size){
        SIZE = size;
        rear = -1;
        front = -1;
        arr = new int[SIZE];
        counter = 0;
    }

    public void offer(int value){
        if(isFull()){
            System.out.println("queue is full");
        }else{
            rear = (rear+1)%SIZE;
            arr[rear] = value;
            counter++;
        }
    }
    public int poll(){
        int temp = -1;
        if(isEmpty()){
            System.out.println("queue is empty");
        }else{
            temp =  arr[(front+1)%SIZE];
            front = (front+1)%SIZE;
            counter--;
            if(counter == 0){
                front = rear = -1;
            }
        }
        return temp;
    }
    public int peek(){
        int temp = -1;
        if(isEmpty()){
            System.out.println("stack is empty");
        }else{
            temp =  arr[(front+1)%SIZE];
            
        }
        return temp;

    }

    public boolean isEmpty(){
        return counter == 0 ;
    }
    public boolean isFull(){
        return counter == SIZE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q3 q = new Q3(4);

        int choice;

        do{
            System.out.println("1.offfer\n 2.poll\n  3.peek");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("enter value : ");
                    int x = sc.nextInt();
                    q.offer(x);
                    
                    break;
            
                case 2:
                    System.out.println("polled value : "+ q.poll());
                    break;
                
                case 3:
                    System.out.println("peek value : " + q.peek());
                    break;
                    
            }

        }while(choice != 0);

    }
    
}
