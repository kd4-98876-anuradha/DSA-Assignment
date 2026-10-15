import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q1 {
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

    public Q1(){
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

    
    public int depth(int value){
        if(root == null){
            return -1;
        }
        int ans = 0;
        return depth(root,value,ans);

        

        
    }
    private int depth(Node temp, int value, int ans){

        if(temp.data == value){
            return ans;
        }

        if(value < temp.data){
            return depth(temp.left,value,ans+1);
        }else{
            return depth(temp.right,value,ans+1);
        }

    }
    
}
