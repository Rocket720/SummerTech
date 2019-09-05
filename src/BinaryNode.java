public class BinaryNode {

    Object val;
    BinaryNode a;
    BinaryNode b;

    public BinaryNode(Object store) {
        val = store;
        a = null;
        b = null;
    }

    public BinaryNode getNextANode() {
        return a;
    }

    public BinaryNode getNextBNode() {
        return b;
    }

    public void setNextANode(BinaryNode n) {
        a = n;
    }

    public void setNextBNode(BinaryNode n) {
        b = n;
    }

    public Object getValue() {
        return val;
    }

    public void setValue(Object s) {
        val = s;
    }

    public boolean hasNext() {
        if (a == null && b == null)
            return false;
        return true;
    }

    public boolean hasNextA() {
        if (a == null)
            return false;
        return true;
    }

    public boolean hasNextB() {
        if (b == null)
            return false;
        return true;
    }
}
