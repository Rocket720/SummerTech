public class SingleNode {
    Object storage;
    SingleNode nextSingleNode;

    public SingleNode(Object o){
        storage = o;
    }
    public SingleNode getNextNode() {
        return nextSingleNode;
    }
    public void setNextNode(SingleNode n) {
        nextSingleNode =  n;
    }
    public Object getStorage() {
        return storage;
    }
    public void setStorage(Object s) {
        storage = s;
    }
    public boolean hasNext(){
        return nextSingleNode !=null;
    }
}
