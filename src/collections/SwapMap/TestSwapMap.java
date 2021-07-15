package collections.SwapMap;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * This is for testing SwapMap class
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class TestSwapMap {
    /**
     * main class
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Testing SwapMap class with no duplicate values
        System.out.println("--- Testing SwapMap Class with no Duplicates values---");

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("key1", "value1");
        map1.put("key2", "value2");
        map1.put("key3", "value3");
        map1.put("key4", "value4");
        map1.put("key5", "value5");
        System.out.println("Previous Map: " + map1);

        SwapMap obj1 = new SwapMap();
        Map<String, String > map2 = obj1.swapMap(map1);
        System.out.println("After Swapping : " + map2);

        // Testing SwapMap class with duplicate values
        System.out.println("\n--- Testing SwapMap Class with Duplicates values(throws Exception)---");

        Map<String, String> map3 = new HashMap<String, String>();
        map3.put("key1", "value1");
        map3.put("key2", "value1");
        map3.put("key3", "value3");
        map3.put("key4", "value4");
        map3.put("key5", "value5");
        System.out.println("Previous Map: " + map3);

        SwapMap obj2 = new SwapMap();
        Map<String, String > map4 = obj2.swapMap(map3);
        System.out.println("After Swapping : " + map4);
    }
}
