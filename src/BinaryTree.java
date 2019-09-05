import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BinaryTree{

    BinaryNode root;

    public BinaryTree(Object o) {
        root = new BinaryNode(o);
    }

//    @Override
    public int size() {
        return recSize(root)+1;
    }

    public int recSize(BinaryNode n){

        if (n.hasNext())
            if(n.hasNextA())
                return 1+recSize(n.getNextANode());
            if(n.hasNextB())
                return 1+recSize(n.getNextBNode());
        return 1;
    }

//    @Override
//    public boolean isEmpty() {
//        return head.hasNext();
//    }
//
//    @Override
//    public boolean contains(Object o) {
//        boolean a = false;
//        SingleNode temp = head;
//        while (temp.hasNext()){
//            if (temp.getStorage().equals(o)){
//                return true;
//            }
//            temp = temp.getNextNode();
//        }
//        return false;
//    }
//
//    @Override
//    public Iterator iterator() {
//        return null;
//    }
//
//    @Override
//    public Object[] toArray() {
//        Object[] a = new Object[this.size()];
//        SingleNode temp = head.nextSingleNode;
//        for (int i = 0; i < this.size(); i++) {
//            a[i] = temp.getStorage();
//            temp = temp.nextSingleNode;
//        }
//        return a;
//    }
//
//    @Override
//    public Object[] toArray(Object[] a) {
//        a = new Object[this.size()];
//        SingleNode temp = head.nextSingleNode;
//        for (int i = 0; i < this.size(); i++) {
//            a[i] = temp.getStorage();
//            temp = temp.nextSingleNode;
//        }
//        return a;
//    }
//
//    @Override
    public boolean add(Object o) {
        BinaryNode n = new BinaryNode(o);
        BinaryNode temp = root;
        while (temp.hasNext())
            temp=temp.getNextANode();
        temp.setNextANode(n);
        return false;
    }

    private int minDepth(BinaryNode n){
     if(n == null)
         return 0;
     else if(!n.hasNextA()&&!n.hasNextB())
         return 1;
     else if(!n.hasNextA())
         return minDepth(n.getNextBNode())+1;
     else if(!n.hasNextB())
         return minDepth(n.getNextANode())+1;
     return Math.min(minDepth(n.getNextANode()),minDepth(n.getNextBNode())) + 1;
    }

//    @Override
//    public boolean remove(Object o) {
//        SingleNode temp = head.nextSingleNode;
//        SingleNode mid = head;
//        int a = this.indexOf(o);
//        System.out.println(this.indexOf(o));
//        for (int i = 0; i < a-1; i++) {
//            mid = mid.nextSingleNode;
//            temp = temp.nextSingleNode;
//        }
//        mid.setNextNode(temp.getNextNode());
//        return false;
//    }
//
//    @Override
//    public boolean containsAll(Collection c) {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(Collection c) {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(int index, Collection c) {
//        return false;
//    }
//
//    @Override
//    public boolean removeAll(Collection c) {
//        return false;
//    }
//
//    @Override
//    public boolean retainAll(Collection c) {
//        return false;
//    }
//
//    @Override
//    public void clear() {
//        head = new SingleNode(null);
//    }
//
//    @Override
//    public Object get(int index) {
//        SingleNode temp = head.getNextNode();
//        for (int i = 0; i < index; i++) {
//            temp = temp.getNextNode();
//        }
//        return temp.getStorage();
//    }
//
//    @Override
//    public Object set(int index, Object element) {
//        SingleNode temp = head;
//        for (int i = 0; i < index; i++) {
//            temp = temp.nextSingleNode;
//        }
//        temp.setStorage(element);
//        return null;
//    }
//
//    @Override
//    public void add(int index, Object element) {
//        SingleNode temp = head;
//        for (int i = 0; i < index; i++) {
//            temp = temp.nextSingleNode;
//        }
//        SingleNode n = new SingleNode(element);
//        n.setNextNode(temp.nextSingleNode);
//        temp.setNextNode(n);
//    }
//
//    @Override
//    public Object remove(int index) {
//        SingleNode temp = head.nextSingleNode;
//        SingleNode mid = head;
//        for (int i = 0; i < index; i++) {
//            mid = mid.nextSingleNode;
//            temp = temp.nextSingleNode;
//        }
//        mid.setNextNode(temp.getNextNode());
//        return null;
//    }
//
//    @Override
//    public int indexOf(Object o) {
//        int a = 0;
//        SingleNode temp = head.nextSingleNode;
//        for (int i = 0; i < this.size(); i++) {
//            if (temp.getStorage().equals(o)){
//                a = i+1;
//                break;
//            }
//            temp = temp.nextSingleNode;
//        }
//        return a;
//    }
//
//    @Override
//    public int lastIndexOf(Object o) {
//        int a = 0;
//        SingleNode temp = head.nextSingleNode;
//        for (int i = this.size(); i > 0; i--) {
//            if (temp.getStorage().equals(o)){
//                a = i-1;
//                break;
//            }
//            temp = temp.nextSingleNode;
//        }
//        return a;
//    }
//
//    @Override
//    public ListIterator listIterator() {
//        return null;
//    }
//
//    @Override
//    public ListIterator listIterator(int index) {
//        return null;
//    }
//
//    @Override
//    public MyLinkedList subList(int fromIndex, int toIndex) {
//        SingleNode mid = head.nextSingleNode;
//        int j = 0;
//        MyLinkedList fin = new MyLinkedList();
//        for (int i = 0; i < toIndex; i++) {
//            if (i >= fromIndex){
//                fin.add(mid.getStorage());
//            }
//            mid = mid.nextSingleNode;
//        }
//        return fin;
//    }
}