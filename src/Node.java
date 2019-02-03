
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Node {
    private int value;
    private List<Node> children;
    private Node parent;

    public Node(int value) {
        this.value = value;
        this.children = new ArrayList<Node>();
    }


    public void addChild(Node child) {
        child.setParent(this);
        children.add(child);
    }


    public int getValue() {
        return value;
    }
    public void setValue(int value){
        this.value=value;
    }
    public Node getParent() {
        return this.parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public List<Node> getChildren() {
        return this.children;
    }




    public static Node searchBreadth(Node N, Integer value) {
        Queue<Node> myQueue = new LinkedList<>();

        myQueue.add(N);

        while (!myQueue.isEmpty()){

            Node node = myQueue.poll();
            if(node.getValue()==value){
                return  node;

            }
            //System.out.println(node.getValue());

            myQueue.addAll(node.getChildren());

        }
        Node b = new Node(0);
        return b;
    }

    public static Node searchDepth(Node N, Integer value){

        Node b = new Node(0);
        if (N.getValue() == value){
            return N;

        }
        //System.out.println(N.getValue());

        for (Node T : N.getChildren()) {


            b =  searchDepth(T, value);
            if (b.getValue() == value)
                return b;
        }

        return b;
    }


}