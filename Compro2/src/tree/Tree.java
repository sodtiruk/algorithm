package tree;

import java.util.Scanner;

public class Tree {

    private Object info = null;
    private Tree left = null;
    private Tree right = null;

    public Tree(Object info, Tree left, Tree right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }

    public Tree(Object info) {
        this(info, null, null);
    }

    public Tree() {
        this(null, null, null);
    }

    public Object getInfo() {
        return this.info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Tree getLeft() {
        return this.left;
    }

    public Tree getRight() {
        return this.right;
    }

    public void setLeft(Tree node) {
        this.left = node;
    }

    public void setRight(Tree node) {
        this.right = node;
    }
    // other methods follow here
    
    public static void printPreOrder(Tree tree) {
        if (tree != null){
            if (tree.getLeft() == null && tree.getRight() == null){
                System.out.print(" " + (int)tree.getInfo() + " ");
            }else {
                System.out.print(" " + (int)tree.getInfo() + " ");
                System.out.print("[");
                printPreOrder(tree.getLeft());
                printPreOrder(tree.getRight());
                System.out.print("]");
            }
        }else {
            System.out.print(" - ");
        }
    }
    
    public void insert(Object newinfo){
        if (info == null){
            info = newinfo;
        }else if ((int)newinfo < (int)info){
            if (left != null){
                left.insert(newinfo);
            }else {
                left = new Tree(newinfo);
            }
        }else{
            if (right != null){
                right.insert(newinfo);
            }else {
                right = new Tree(newinfo);
            }
        }
    }
    
    public int getheight(){
        int lh=0, rh=0;
        if(info != null){
            if (left != null){
                lh = 1 + left.getheight();
            }
            if (right != null){
                rh = 1 + right.getheight();
            }
            if (lh > rh){
                return lh;
            }else {
                return rh;
            }
        }else {
            return 0;
        }
    }
    
    public boolean Search(Object data){
        if ((int)data == (int)info){
            return true;
        }else if ((int)data < (int)info){
            if (left != null){
                System.out.print("L");
                return left.Search(data);
            }else {
                return false;
            }
        }else {
            if (right != null){
                System.out.print("R");
                return right.Search(data);
            }else {
                return false;
            }
        }       
    }
             
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Tree t = new Tree();
        int n = (int)(Math.random()*11)+10;
        System.out.println("--- Random numbers [" + n + "] ---");
        for(int i=0; i<n; i++){
            int number = (int)(Math.random()*51);
            t.insert(number);
            System.out.print(number + " ");            
        }
        System.out.println("");
        int height = t.getheight();
        System.out.println("--- Tree (Height=" + height + ") ---");
        printPreOrder(t);
        System.out.println("");
        System.out.println("--- Search ---");
        while (true){
            int searchnumber = (int)(Math.random()*51);
            System.out.print(searchnumber + ":  (");
            if (t.Search(searchnumber)){                
                System.out.println(")  Found!");
                break;
            }else {
                System.out.println(")  Not Found!");
            }           
        }       
    }
}
