import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashTable<K, V> implements BaseHashTable<K, V>{

    private static final int DEFAULT_SIZE = 6;
    private final List<LinkedList<V>> values;
    private final int size;

    public HashTable(){
        values = new ArrayList<LinkedList<V>>(DEFAULT_SIZE);
        size = 0;

        for(int i=0; i<DEFAULT_SIZE; i++){
            values.add(null);
        }
    }

    @Override
    public void put(K key, V value){
        int hashCode = key.hashCode();
        int hashKey = getKey(hashCode);
        
        if(this.values.get(hashKey) == null){
            this.values.add(hashKey, new LinkedList<V>());
        }

        this.values.get(hashKey).add(value);
    }

    @Override
    public V get(K key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public V remove(K key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    private int getKey(int hashCode){
        return hashCode % DEFAULT_SIZE;
    }
}