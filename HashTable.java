import java.util.*;
/**
 * Hashtable
 */
public class HashTable {

    public static void main(String[] args) {
        //Hashtable<Integer,Integer>;
        Hashtable<Integer, Integer> ht = new Hashtable<Integer,Integer>();
        ht.put(12,233);
        ht.put(90,100);
        ht.put(50,1);
        
        System.out.println(ht);
        ht.put(90,500);
        System.out.println(ht);

    }
}