package numberX;
import java.util.Arrays;
import java.util.LinkedList;
public class ListOfNumbers {
    public void listOfNumbers(LinkedList<Integer> collectionOfInt, int number) {

        for (int i = 0; i < collectionOfInt.size() - 1; i++) {

            for (int j = 0; j < collectionOfInt.size() - 1; j++) {

                if (collectionOfInt.get(j) >= number) {
                    collectionOfInt.add(collectionOfInt.remove(j));
                }
            }
        }
        System.out.println("-------");
        System.out.println("X = " + number);
        System.out.println("-------");
        System.out.println("collection sorted with number X: " + Arrays.toString(collectionOfInt.toArray()));
    }
}
