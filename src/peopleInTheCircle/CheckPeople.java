package peopleInTheCircle;

import java.util.*;

public class CheckPeople {
    public static void main(String[] args) {
        int N = 15;
        PeopleInTheCircle people = new PeopleInTheCircle();
        List<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            arrayList.add(i + 1);
            linkedList.add(i + 1);
        }
        System.out.println(Arrays.toString(arrayList.toArray()));

        long startTime = System.currentTimeMillis();
        people.removeEverySecondPeople(arrayList);
        System.out.println("time of ArrayList: " + (System.currentTimeMillis() - startTime) + "\n");

        startTime = System.currentTimeMillis();
        people.removeEverySecondPeople(linkedList);
        System.out.println("time of LinkedList: " + (System.currentTimeMillis() - startTime));

    }
}
