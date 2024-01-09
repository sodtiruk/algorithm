
public class Frindlinkedlist {

    private Node head = null;
    
    public Frindlinkedlist(){
        
    }
    public void addFriend(String name, String Class, int no){
        Node newNode = new Node(name, Class, no);
        newNode.setLink(head);
        head = newNode;
    }
    
    public String toString(){
        Node trav = head;
        String str = "";
        while(trav != null){
            str = str.concat(trav.getName() + " " + trav.getclass() + " " + trav.getNo());           
            trav = trav.getLink();
            if (trav != null){
                str = str.concat(" | ");
            }
        }
        return str;
    }
    
    public static void main(String[] args) {
        Frindlinkedlist f1 = new Frindlinkedlist();
        f1.addFriend("Sutthirak", "M1", 640710581);
        f1.addFriend("Wongsapat", "M0", 640710851);
        System.out.println(f1);
    }
}
