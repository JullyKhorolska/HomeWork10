package peopleInTheCircle;

import java.util.*;

public class PeopleInTheCircle {
    public PeopleInTheCircle() {

    }
    public void removeEverySecondPeople(List<Integer> numList) {
        boolean flag = false;
        while (numList.size() != 1) {
            for (int i = 0; i < numList.size(); i++) {
                if (flag) {
                   numList.remove(i--);
                }
                flag = !flag;
            }
        }
        System.out.println("size: " + numList.size());
        System.out.println("element: " + numList.get(0));
    }
}

