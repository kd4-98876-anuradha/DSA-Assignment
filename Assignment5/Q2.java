import java.util.Stack;

public class Q2 {
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

    public Q2(){
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

    public void preOrder(){
        if(root == null){
            return ;
        }
        Stack<Node> stack = new Stack<>();

        stack.add(root);
        System.out.print("preorder : ");

        while(!stack.isEmpty()){
            Node temp = stack.pop();
            
            System.out.print(" " + temp.data);

            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
        System.out.println();
    }

    public void inOrder(){
        
        Stack<Node> stack = new Stack<>();
        if(root == null){
            return;
        }
        Node curr = root;


        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }

            Node temp = stack.pop();
            System.out.println(" " + temp.data );
            curr = temp.right;

        }
    }
    public void postOrder() {
    if (root == null) {
        return;
    }

    Stack<Node> stack = new Stack<>();
    Node curr = root;
    Node lastVisited = null;

    System.out.print("Postorder: ");

    while (curr != null || !stack.isEmpty()) {

        if (curr != null) {
            stack.push(curr);
            curr = curr.left;
        } else {
            Node peekNode = stack.peek();

            if (peekNode.right != null && lastVisited != peekNode.right) {
                curr = peekNode.right;
            } else {
                System.out.print(peekNode.data + " ");
                lastVisited = stack.pop();
            }
        }
    }

    System.out.println();
}
    
}
