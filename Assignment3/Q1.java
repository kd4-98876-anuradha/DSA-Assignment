public class Q1 {
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


    public void addFirst(int value){
        

        Node newnode = new Node(value);
        if(isEmpty()){
            head = newnode;  
            return; 
        }
        newnode.next = head;
        head = newnode;

    }
    public void addLast(int value){
        Node newnode = new Node(value);
        if(isEmpty()){
            addFirst(value);
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    public void addindex(int value, int index){
        int count = 1;
        Node temp = head;
        Node newnode = new Node(value);
        if(isEmpty()){
            addFirst(value);
            return;
        }
        if(index <= 1){
            addFirst(value);
            return;
        }

        
        while (true) {
            if(count == index-1){
                break;
            }
            temp = temp.next;
            if(temp.next == null){
                break;
            }
            count++;
            
        }
        newnode.next = temp.next;
        temp.next = newnode;



    }
    public void deleteindex(int index){
        if(isEmpty()){
            return;
        }
        if(index  < 2){
            head = head.next;
            return;
        }
        

        Node temp = head;
        
        for(int i = 1; i < index-1; i++){
                temp = temp.next;
                if(temp.next == null){
                    return;
                }
        }
        temp.next = temp.next.next;
    }

    public void  deleteFirst(){
        if(isEmpty()){
            return;
        }

        head = head.next;
    }
    public void deleteLast(){
        if(isEmpty()){
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
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
    public void insertAfterData(int data, int value){
        Node newnode = new Node(value);
        if(isEmpty()){
            head = newnode;
            return;
        }
        Node temp = head;

        while(temp != null && temp.data != data ){
            temp = temp.next;
        }
        if(temp == null){
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void insertBeforeData(int data, int value){
        Node newnode = new Node(value);
            if(isEmpty()){
                head = newnode;
                return;
            }
            Node firstpos = null;
            Node secondpos = head;

            while(secondpos!= null &&  secondpos.data != data ){
                firstpos = secondpos;
                secondpos = secondpos.next;
            }
            if(secondpos == null){
                return;
            }

            if(firstpos == null){
                
                newnode.next = head;
                head = newnode;
                return;
                
            }
            newnode.next = secondpos;
            firstpos.next = newnode;

    }
}
