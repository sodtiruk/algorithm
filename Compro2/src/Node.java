
public class Node {

    private String name;
    private String Class;
    private int no;
    private Node link;
    
    public Node(String name, String Class, int no, Node link){
        this.name = name;
        this.Class = Class;
        this.no = no;
        this.link = link;
    }
    
    public Node(String name, String Class, int no){
        this(name, Class, no, null);
    }
    
    public Node(String name, int no){
        this(name, null, no, null);
    }
    
    public String getName(){
        return this.name;
    }
    public String getclass(){
        return this.Class;
    }
    public int getNo(){
        return this.no;
    }
    public Node getLink(){
        return this.link;
    }
    
    public void setLink(Node link){
        this.link = link;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setclass(String Class){
        this.Class = Class;
    }
    public void setNo(int no){
        this.no = no;
    }
    public String toString(){
        return ""+this.name+ " " + this.Class + " " +this.no;
    }
}
