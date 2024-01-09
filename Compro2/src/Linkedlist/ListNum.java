package Linkedlist;
public class ListNum {

    private Node head = null;

    public ListNum() {
    }

    public void addNode(int newInfo) {
        Node newNode = new Node(newInfo);
        newNode.setLink(head);
        head = newNode;
    }

    public String toString() {
        Node trav = head;
        String str = "";
        while (trav != null) {
            str = str.concat(trav.toString());
            //str=str.concat(""+trav.getInfo());
            trav = trav.getLink();
            if (trav != null) {
                str = str.concat(" | ");
            }
        }
        return str;
    }

    public int getSize() {
        Node temp = head;
        //System.out.println("temp = " + temp);
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getLink();
        }
        return count;
    }

    public void addLastNode(int newInfo) {
        Node trav1 = head;
        Node trav2 = head;
        Node newNode = new Node(newInfo);
        while (trav1 != null) {
            trav2 = trav1;
            trav1 = trav1.getLink();
        }
        if (trav1 != trav2) {
            trav2.setLink(newNode);
        } else {
            head = newNode;
        }

    }

    public void addNodeSort(int newInfo) {
        Node trav1 = head;
        Node trav2 = head;
        Node newNode = new Node(newInfo);
        while (trav1 != null && trav1.getInfo() > newNode.getInfo()) {
            trav2 = trav1;
            trav1 = trav1.getLink();
        }
        newNode.setLink(trav1);
        if (trav1 != trav2) {
            trav2.setLink(newNode);
        } else {
            head = newNode;
        }
    }

    public void delHeadNode() {
        if (head != null) {
            head = head.getLink();
        }
    }

    public void delLastNode() {
        Node trav1 = head;
        Node trav2 = head;
        while (trav1 != null && trav1.getLink() != null) {
            trav2 = trav1;
            trav1 = trav1.getLink();
        }
        Node delNode = trav1;
        if (trav2 != null) {
            trav2.setLink(null);
            if (delNode == head) {
                head = null;
            }
        }
    }

    public int Search(int info) {
        int count = 1;
        Node temp = head;
        while (temp != null) {
            if (temp.getInfo() == info) {
                return count;
            }
            temp = temp.getLink();
            count++;
        }
        return count;
    }

    public void delNode(int data) {
        Node trav1 = head;
        Node trav2 = head;
        while (trav1 != null) {
            if (trav1.getInfo() == data) {
                Node delNode = trav1;
                if (trav1 != trav2) {
                    trav2.setLink(trav1.getLink());
                } else {
                    head = trav1.getLink();
                }
            } else {
                trav2 = trav1;
            }
            trav1 = trav1.getLink();
        }

    }
    


    public static void main(String[] args) {
        ListNum listNum1 = new ListNum();
        Node newNode = new Node();
        listNum1.addNode(1320);
        listNum1.addNode(1671);
        listNum1.addNode(1395);
        listNum1.addNode(1150);
        listNum1.addNode(999);
        listNum1.addNode(750);    
        listNum1.addNode(555);
        listNum1.addNode(250);
        
        System.out.println(listNum1);
        listNum1.delNode(555);
        System.out.println(listNum1);
        
    }
}
