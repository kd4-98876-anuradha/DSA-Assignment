import java.util.Scanner;
import java.util.Stack;

public class Q2 {
    private int SIZE;
    private int[] arr;
    private int top;

    public Q2(int size){
        SIZE = size;
        top = SIZE;
        arr = new int[SIZE];

    }

    public void push(int value){
        if(isFull()){
            System.out.println("stack is full");
            
        }else{
            top--;
            arr[top] = value;
        }
    }
    public int pop(){
        int temp = -1;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            temp = arr[top];
            top++;
            
        }
        return temp;
    }
    public int peek(){
        int temp = -1;
         if(isEmpty()){
            System.out.println("stack is full");
        }else{
            temp = arr[top];
           
        }
         return temp;

    }
    public boolean isEmpty(){
        return top == SIZE;
    }
    public boolean isFull(){
        return top == -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q2 st = new  Q2(4);
        int choice;


        do{
            System.out.println("1. push\n 2. pop\n 3.peek" );
            System.out.print("enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("enter value to be push : ");
                    int x  = sc.nextInt();
                    st.push(x);
                    
                    break;
            
                case 2:
                    System.out.println("pooped value : "+st.pop());
                    break;
                
                case 3:
                    System.out.println("peek value : " + st.peek());
                    break;
            }

        }while (choice != 0);
    }
    
}
