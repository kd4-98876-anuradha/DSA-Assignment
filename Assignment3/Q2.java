public class Q2 {
    private Node head;
    private int size;
   
   
    static class Node{
        private Node next;
        private int data;

        public Node(int value){
            data = value;
            next = null;
        }
    }


    public void add(int value){
        

        Node newnode = new Node(value);
        if(isEmpty()){
            head = newnode;  
            return; 
        }
        
        Node firstpoint = null;
        Node secondpoint = head;

        while(secondpoint != null && secondpoint.data < value ){
            firstpoint =  secondpoint;
            secondpoint = secondpoint.next;

        }
        if(firstpoint == null){
            newnode.next = head;
            head = newnode;
            return;
        }
        if(secondpoint == null){
            firstpoint.next = newnode;
            return;
        }
        newnode.next = secondpoint;
        firstpoint.next = newnode;

    }
    
    

    

    public void display(){
        if(isEmpty()){
            return;
        }
        Node temp = head;

        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }
    
}
