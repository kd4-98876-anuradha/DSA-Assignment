import java.util.Stack;

public class Q3 {

    private Node root;

    static class Node{
        private Node left;
        private Node right;
        private int data;


        public Node(int value){
            left = null;
            right = null;
            data = value;
        }
    }

    public Q3(){
        root = null;
    }

    public void addNode(int value){
        Node newnode = new Node(value);

        if(root == null){
            root = newnode;
            return;
        }


        Node temp = root;
        Node tempprev = null;

        while(temp!=null){
            if(newnode.data < temp.data){
                tempprev = temp;
                temp = temp.left;
            }else {
                tempprev = temp;
                temp = temp.right;
            }
        }

        if(newnode.data < tempprev.data){
            tempprev.left = newnode;
        }else{
            tempprev.right = newnode;
        }
    }

    

    public void deleteAll(){
        root = null;
    }

    public int successor(int value){
        if(root == null){
            return -1;
        }
     
        return successor(root, value);
    }
    private int successor(Node temp,int value){
        if(temp == null){
            return -1;
        }

        int leftData = successor(temp.left,value);
        if(leftData != -1) return leftData;

        if(temp.data > value){
            System.out.println("immediate succesor " + temp.data);
            return temp.data;
        }

        int rightData = successor(temp.right, value);
        return rightData;
    }
    
}
