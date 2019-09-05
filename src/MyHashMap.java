public class MyHashMap {

    String[] keys;
    Object[] vals;
    int count;

    public MyHashMap(){
        keys = new String[8];
        vals = new Object[8];
        count = 0;
    }
    public int hash(String key){
        long m = 1;
        for (int i = 0; i < key.length(); i++) {
            m*=key.charAt(i);
        }
        return Math.abs((int)(m%keys.length));
    }
    public void put(String key, Object val){
        count++;
        int index = hash(key);
        keys[index] = key;
        vals[index] = val;
    }

}
