package numberX;
import java.util.*;
public class CheckNumberX {
    public static void main(String[] args) {
        ListOfNumbers list = new ListOfNumbers();
        LinkedList<Integer> collectionOfInt = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            collectionOfInt.add(i, (int) (Math.random() * 30 - 1));
        }
        System.out.println("collection: " + Arrays.toString(collectionOfInt.toArray()));
        list.listOfNumbers(collectionOfInt,15);
    }
}
