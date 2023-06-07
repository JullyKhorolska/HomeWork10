package dublicates;

import java.util.*;


public class ChooseDublicates {
    public static void main(String[] args) {
        List listWithDublicates = new ArrayList(20);
        for (int i = 1; i < 10; i++) {
            listWithDublicates.add (i, i);
        }
//        listWithDublicates.add(1);
//        listWithDublicates.add(2);
//        listWithDublicates.add(3);

        for (Object dublicates : listWithDublicates) {
            System.out.println(dublicates);
        }

    }
}
