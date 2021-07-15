package collections.TreeMultiSet;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 * TreeMultiSet is a Set which stores items in sorted
 * order and allows duplicates
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 * @param <T> The type of elements maintained
 */
public class TreeMultiSet<T> {
    private TreeMap<T, Integer> tMap; // TreeMap implementation

    /**
     * Constructor for TreeMultiSet
     */
    public TreeMultiSet(){
        tMap = new TreeMap<T, Integer>();
    }

    /**
     * add method Adds the specified element to this TreeMultiSet
     * @param e Element to be added
     */
    public void add(T e) {
        if(!contains(e)) {
            tMap.put(e, 1);     // If the element is not available
        }else {
            tMap.replace(e, tMap.get(e) + 1);   // If the element is already available
        }
    }

    /**
     * contains method returns 'true' if this set contains element 'e'.
     *
     * @param e element which is to be tested
     * @return 'ture' if this set contains the specified element
     */
    public boolean contains(T e) { return tMap.containsKey(e);}

    /**
     * count method gives the count/the number of occurrences of the element 'e'
     *
     * @param e element which the count is to be got.
     * @return count/the number of occurrences of the element 'e'
     */
    public int count(T e) { return tMap.get(e);}

    /**
     * removeOne method reduces count by one of the specific element 'e'
     * If the specific element has only one count, this method removes
     * the element 'e' from the set
     *
     * @param e element which is to be reduced by one.
     * @return 'true' if the the element is reduced by one successfully.
     */
    public boolean removeOne(T e) {
        if(!contains(e)) {
            return false;   // If the specific element is not available in the Set
        }else {
            if(tMap.get(e) == 1) {
                tMap.remove(e);     // Removing the element if it hs only one count
            }else {
                tMap.replace(e, tMap.get(e) - 1);   // Reducing the count by one
            }
        }
        return true;
    }

    /**
     * removeAll method removes all entries of the specific element from the Set
     *
     * @param e element to be removed from the Set
     * @return 'true' is the element has removed successfully
     */
    public boolean removeAll(T e) {
        if(!contains(e)) {
            return false;   // Returns 'false' if the specific element is not available in the Set
        }else {
            tMap.remove(e); // Removing the element from the Set
        }
        return true;
    }

    /**
     * Finds the total number of elements in the Set
     * including duplicates
     *
     * @return total number of elements in the Set
     */
    private int noOfEl() {
        // Finding the sum of tMaps.values() arr
        return Arrays.stream(tMap.values().toArray(new Integer[0])).reduce(0, Integer::sum);
    }

    /**
     * Returns an array containing all of the elements in TreeMultiset when
     * a specific array is given
     *
     * @param arr The array into which the elements of this TreeMultiset
     *            are to be stored
     * @param <T> The type of elements maintained
     * @return array containing all of the elements in TreeMultiset
     */
    public <T> T[] toArray(T[] arr) {
        List<Object> tempArr = new ArrayList<>(noOfEl());
        for(Object j: tMap.keySet()) {
            for(int k = 0; k < tMap.get(j); k++) {
                tempArr.add(j);
            }
        }
        return tempArr.toArray(arr);
    }

    /**
     * Returns an array containing all of the elements in TreeMultiset
     *
     * @param <T> The type of elements maintained
     * @return array containing all of the elements in TreeMultiset
     */
    public <T> T[] toArray() {
        List<Object> tempArr = new ArrayList<>(noOfEl());
        for(Object j: tMap.keySet()) {
            for(int k = 0; k < tMap.get(j); k++) {
                tempArr.add(j);
            }
        }
        return (T[]) tempArr.toArray();
    }

    /**
     * Returns the elements of this TreeMultiSet
     *
     * @return he elements of this TreeMultiSet
     */
    @Override
    public String toString() {
        return "TreeMultiSet = "  + tMap;
    }
}
