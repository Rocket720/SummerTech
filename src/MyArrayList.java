import java.lang.reflect.Array;
import java.util.*;

public class MyArrayList implements List{

    private Object[] local;

    public MyArrayList(){
        local = new Object[0];
    }

    @Override
    public int size() {
        return local.length;
    }

    @Override
    public boolean isEmpty() {
        return local.length==0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object e : local) {
            if (e.equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return local;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o){
        Object[] temp = Arrays.copyOf(local,local.length);
        local = new Object[local.length+1];
        for (int i = 0; i < temp.length; i++) {
            local[i] = temp[i];
        }
        local[local.length-1] = o;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        local = new Object[0];
    }

    @Override
    public Object get(int index) {
        return local[index];
    }

    @Override
    public Object set(int index, Object element) {
        local[index] = element;
        return null;
    }

    @Override
    public void add(int index, Object element) {
        Object[] temp = Arrays.copyOf(local,local.length);
        local = new Object[local.length+1];
        for (int i = 0; i < local.length; i++) {
            if (i >= index){
                if (i==index) {
                    local[i] = element;
                    continue;
                }
                local[i] = temp[i-1];
                continue;
            }
            local[i] = temp[i];
        }
    }

    @Override
    public Object remove(int index) {
        Object[] temp = Arrays.copyOf(local,local.length);
        local = new Object[local.length-1];
        boolean c = false;
        for (int i = 0; i < temp.length; i++) {
            if (i == index || c){
                if (i==index) {
                    c = true;
                    continue;
                }
                local[i-1] = temp[i];
                continue;
            }
            local[i] = temp[i];
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < local.length; i++) {
            if (local[i].equals(o)){
                return i;
            }
        }
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = local.length; i > 0; i--) {
            if (local[i].equals(o)){
                return i;
            }
        }
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        Object[] temp = new Object[toIndex-fromIndex];
        int j = 0;
        for (int i = fromIndex; i < toIndex; i++) {
            temp[j] = local[i];
            j++;
        }
        MyArrayList fin = new MyArrayList();
        for (int i = 0; i < temp.length; i++) {
            fin.add(temp[i]);
        }
        return fin;
    }
}
