package Stack;
public class Node {

    private Object info = null;
    private Node link = null;

    public Node(Object info, Node link) {
        this.info = info;
        this.link = link;
    }

    public Node(Object info) {
        this(info, null);
    }

    public Node() {
        this(null, null);
    }

    public Object getInfo() {
        return this.info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Node getLink() {
        return this.link;
    }

    public void setLink(Node node) {
        this.link = node;
    }

}
