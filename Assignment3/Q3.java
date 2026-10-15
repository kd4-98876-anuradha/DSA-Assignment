public class Q3 {
    private Node head;
    private Node tail;
    private int size;

        static class Node{
            private int data;
            private Node next;

            public Node(int value){
                data = value;
            }
        }
    
    public Q3(){
        head = null;
        tail = null;
    }
        
    public boolean isEmpty(){
        return head == null && tail == null;

    }

    public void addFirst(int value){
        Node newnode = new Node(value);

        if(isEmpty()){
            head = newnode;
            tail = newnode;
            tail.next = head;
            
        }else{
            newnode.next = head;
            head = newnode;
            tail.next = head;

        }

        
    }
    public void addLast(int value){
        Node newnode = new Node(value);
        if(isEmpty()){
            head = newnode;
            tail = newnode;
            tail.next = head;
        }else{
            tail.next = newnode;
            tail = newnode;
            tail.next = head;
        }
    }

    public void deleteFirst(){
        if(isEmpty()){
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        head = head.next;
        tail.next = head;
    }
    public void deleteLast(){
        if (isEmpty()) {
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        tail = temp;
        tail.next = head;
    }


    public void display(){
        if(isEmpty()){
            return;
        }
        Node temp = head;


        do{
            System.out.println(temp.data + " ");
            temp = temp.next;
        }while(temp  != head);
    }

    public void addindex(int value, int index){
        Node newnode = new Node(value);

        if(isEmpty()){
            head = newnode;
            tail =  newnode;
            return;
        }
        if(index < 2){
            newnode.next = head;
            head = newnode;
            tail.next = head;
            return;
        }
        
        

        Node temp = head;
        for(int i = 1; i < index-1; i++){
            temp = temp.next;
            if(temp.next == head){
                break;
            }
        }
        if(temp == tail){
            temp.next = newnode;
            tail = newnode;
            tail.next = head;
            return;
        }

        newnode.next = temp.next;
        temp.next = newnode;


    }
    public void deleteindex(int value, int index){
        if(isEmpty()){
            return;
        }
        Node temp =  head;
        if(head.next == null){
            head= tail = null;
            return;
        }
        if(index < 2){
            head = head.next;
            tail.next = tail.next.next;
            return;
        }
        
        for(int i = 1; i < index-1; i++){
            temp = temp.next;

        }
        if(temp.next == tail){
            tail = temp;
            tail.next = tail.next.next;
            return;
        }
        temp.next = temp.next.next;
    }
}
