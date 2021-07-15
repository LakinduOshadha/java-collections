package collections.TreeMultiSet;

/**
 * This class tests TreeMultiSet class
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class TestTreeMultiSet {
    /**
     * main class
     * @param args null
     */
    public static void main(String[] args) {
        System.out.println("--- Testing TreeMultiSet Class ---");
        TreeMultiSet<String> obj = new TreeMultiSet<>();
        // Adding Elements
        System.out.println("\nAfter adding 6 x \"a\" & 1 x \"b\" & 4 x \"c\" &" +
                " 6 x \"d\" as Strings");
        obj.add("a");
        obj.add("a");
        obj.add("a");
        obj.add("b");
        obj.add("c");
        obj.add("c");
        obj.add("c");
        obj.add("c");
        obj.add("d");
        obj.add("d");
        obj.add("d");
        obj.add("d");
        obj.add("d");
        obj.add("d");
        obj.add("a");
        obj.add("a");
        obj.add("a");
        System.out.println(obj.toString());

        // Checking the availability if "d" in the TreeMultiSet - contains method
        System.out.println("\nChecking the availability of \"d\" in the TreeMultiSet");
        System.out.println(obj.contains("d"));


        // Checking the count method
        System.out.println("\nChecking the count of \"c\" in the TreeMultiSet");
        System.out.println("Count of \"c\" = " + obj.count("c"));

        // Removing one 'a'
        System.out.println("\nAfter removing one 'a'");
        obj.removeOne("a");
        System.out.println(obj.toString());

        // Removing all 'a'
        System.out.println("\nAfter removing All 'a's");
        obj.removeAll("a");
        System.out.println(obj.toString());

        // Checking T[] toArray(T[] arr) method
        String[] q = obj.toArray(new String[0]);
        System.out.println("\nChecking T[] toArray(T[] arr) method");
        System.out.print("Returned Array = {");
        for(int i = 0; i < q.length; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println("}");

        // Checking T[] toArray() method
        System.out.println("\nChecking T[] toArray() method");
        System.out.print("Returned Array = {");
        for(int i = 0; i < obj.toArray().length; i++) {
            System.out.print(obj.toArray()[i] + " ");
        }
        System.out.print("}");
    }

}
