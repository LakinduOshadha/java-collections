package collections.SwapMap;

import java.io.IOException;
import java.util.*;


/**
 * This class swaps keys and values in a given map
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class SwapMap {

    /**
     * This method takes a Map<String,String> as a parameter and returns a new
     * Map<String,String> in which keys and values are swapped
     *
     * @param map map which the keys and values are to be swapped.
     * @return swapped map
     * @throws IOException : "Duplicate Values Found" if there are duplicate values
     * in the map that is passed as a parameter
     *
     */
    public Map<String, String> swapMap(Map<String, String> map) throws IOException {
        Map<String, String> tempMap = new HashMap<>();

        if(isDuplicatesAvailable(map)) {
            throw new IOException("Duplicate Values Found");    // If duplicates available.
        } else {
            for (String i : map.keySet()) {
                tempMap.put(map.get(i), i);     // Swapping values and keys
            }
        }
        return tempMap;
    }

    /**
     * Finds whether duplicate values are available or not
     * in the map that is passed as a parameter
     * @param map map which the duplicate availability is to be checked.
     * @return 'ture' if there are duplicate values are found
     */
    private boolean isDuplicatesAvailable(Map<String, String> map) {
        List<String> valuesList = new ArrayList<>(map.values());
        Set<String> valuesSet = new HashSet<>(map.values());
        return valuesSet.size() != valuesList.size();
    }

}
