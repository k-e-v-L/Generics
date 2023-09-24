public class Main {
    public static void main(String[] args) {
        /* generics = enable types (classes and interfaces) to be parameters when defining:
        classes, interaces and methods. A benefit is to eliminate the need to create multiple verions
        of methods or classes for various data types.
        Use 1version for all reference data types
         */


        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        //displayArray(intArray);
        //displayArray(doubleArray);
        //displayArray(charArray);
        //displayArray(stringArray);

        System.out.println("Prints out the first element");
        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));
    }

    //We have 4 methods but we only need 1!
    //public static void displayArray(Integer[] array) { this is a non genericmethod
    //using "Thing" instead "T" is just to help remember
    public static <Thing> void displayArray(Thing[] array) {

        for (Thing x : array
        )
            System.out.println(x + " ");
        {
        }
        System.out.println();
    }

    public static <Thing> Thing getFirst(Thing[] array) {
        return array[0]; //index 0 returns returns the first element
    }
    /*public static void displayArray(Double[] array) {
        for (Double x : array
        )
            System.out.println(x + " ");
        {
        }
        System.out.println();
    }
    public static void displayArray(String[] array) {
        for (String x : array
        )
            System.out.println(x + " ");
        {
        }
        System.out.println();
    }
    public static void displayArray(Character[] array) {
        for (Character x : array
        )
            System.out.println(x + " ");
        {
        }
        System.out.println(); */
}
