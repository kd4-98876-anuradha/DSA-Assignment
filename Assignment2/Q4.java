public class Q4 {
    public static int operation(int op1,String operator,int op2){
        switch (operator) {
            case "+":
                return op1 + op2;
                
        
            case "-":
                return op1 - op2;
               
            case "*":
                return op1 * op2;
               

            case "/":
                return op1/op2;
             
            
            case "%":
                return op1% op2;
                

            case "$":
                return (int)Math.pow(op1, op2);
                
        }
        return 0;
    }

    public static int postfixxx(String[] arr){
        int postfix[] = new int[10];
        int top = -1;
        for(int i = 0; i < arr.length; i++){
            String s = arr[i];
            String operator;
            boolean isDigit;

        try{
            Integer.parseInt(s);
            isDigit = true;
            
        }catch (NumberFormatException e){
            isDigit = false;
        }

        if(isDigit){
            postfix[++top] = Integer.parseInt(s);;
        }else{
            operator = arr[i];
            int op2 = postfix[top--];
            int op1 = postfix[top--];
            int res = operation(op1,operator,op2);
            postfix[++top] = res;
        }
            
     }
      return postfix[top];
    }
    public static int prefixxx(String[] arr){
        int postfix[] = new int[10];
        int top = -1;
        for(int i = arr.length-1; i >= 0; i--){
            String s = arr[i];
            String operator;
            boolean isDigit;

        try{
            Integer.parseInt(s);
            isDigit = true;
            
        }catch (NumberFormatException e){
            isDigit = false;
        }

        if(isDigit){
            postfix[++top] = Integer.parseInt(s);;
        }else{
            operator = arr[i];
            int op1 = postfix[top--];
            int op2 = postfix[top--];
            int res = operation(op1,operator,op2);
            postfix[++top] = res;
        }
            
     }
      return postfix[top];
    }
    public static void main(String[] args) {
        String postfix  = "12 34 5 * +";
        String[] arr = postfix.split(" ");

        int res = postfixxx(arr);
        
        System.out.println(res);

        String prefix = "+ 12 * 34 5";
        String[] arr2 = prefix.split(" ");

        int res2 = prefixxx(arr2);

        System.out.println(res2);
    }   
}
