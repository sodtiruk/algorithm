package Stack;
public class Stack {

    private int stackSize = 0;
    private Node stackTop = null;

    public Stack() {
        stackTop = null;
    }

    public void initializeStack() {
        stackTop = null;
    }

    public boolean isEmptyStack() {
        return (stackTop == null);
    }

    public boolean isFullStack() {
        return false;
    }

    public void push(Object newItem) {
        Node newNode = new Node(newItem);
        newNode.setLink(stackTop);
        stackTop = newNode;
        stackSize++;
    }

    public Object peek() throws Exception {
        if (isEmptyStack()) {
            throw new Exception("StackUnderflow");
        }
        return stackTop.getInfo();
    }

    public Object pop() throws Exception {
        Object itemInfo;
        if (isEmptyStack()) {
            throw new Exception("StackUnderflow");
        }
        itemInfo = stackTop.getInfo();
        stackTop = stackTop.getLink();
        stackSize--;
        return itemInfo;
    }
    
    public String toString() {
        Node trav = stackTop;
        String str = "";
        while (trav != null) {
            //str = str.concat(trav.toString());
            str=str.concat(""+trav.getInfo());
            trav = trav.getLink();
            if (trav != null) {
                str = str.concat(" ");
            }
        }
        return str;
    }
    
    public int Size(){
        Node trav = stackTop;
        int count = 0;
        while (trav != null){
            trav = trav.getLink();
            count++;
        }
        return count;
    }
    
    public int sumStack(){
        return 0;
    }
    
    public static void main(String[] args) {
        Stack st_even = new Stack();
        Stack st_odd = new Stack();
        Stack st_string = new Stack();
        try {            
            //main
            int random_int10to20 = (int)Math.floor(Math.random()*(11)+10);
            System.out.println("--- Random Numbers [" + random_int10to20 + "] ---");
            for(int i=0; i<random_int10to20; i++){
                int random_int0to100 = (int)(Math.random()*101);
                if (random_int0to100%2 == 0){
                    st_even.push(random_int0to100);
                }else {
                    st_odd.push(random_int0to100);
                }
                System.out.print(random_int0to100 + " "); 
            }
            System.out.println("");
            System.out.println("--- Even Stack [" + st_even.Size() + "] ---");
            System.out.println(st_even);
            
            System.out.println("--- Odd Stack [" + st_odd.Size() + "] ---");
            System.out.println(st_odd);
            
            //Solve
            while(true){
                if (st_even.isEmptyStack()){
                    System.out.println("===> Even is the winner!");
                    break;
                }else if (st_odd.isEmptyStack()){
                    System.out.println("===> Odd is the winner!");
                    break;
                }
                if ((int)st_even.peek() > (int)st_odd.peek()){
                    st_even.pop();
                }else {
                    st_odd.pop();
                }
            }
        }catch (Exception e){
            System.err.println(e);
        }
    }
    
}   


