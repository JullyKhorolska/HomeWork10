package peopleInTheCircle;

import java.util.*;

public class CheckPeople {
    public static void main(String[] args) {
        int N = 11;
        PeopleInTheCircle people = new PeopleInTheCircle();
        List<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                arrayList.add(i + 1);
            }
            linkedList.addAll(arrayList);
            System.out.println(Arrays.toString(arrayList.toArray()));
            long startTime = System.currentTimeMillis();
            people.removeEverySecondPeople(arrayList);
            System.out.println("Execution time in milliseconds time for ArrayList: " + ((double) System.currentTimeMillis() - startTime) + "\n");

            startTime = System.currentTimeMillis();
            people.removeEverySecondPeople(linkedList);
            System.out.println("Execution time in milliseconds time for LinkedList: " + ((double) System.currentTimeMillis() - startTime));
        } else System.out.println("There are no any people in the circle");
    }
}
