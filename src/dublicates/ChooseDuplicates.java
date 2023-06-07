package dublicates;

import java.util.*;

public class ChooseDuplicates {
    public static void main(String[] args) {
        List<Integer> listWithDuplicates = new ArrayList <>();
        List<Integer> listWithOutDuplicates = new ArrayList <>();
        for (int i = 0; i < 100; i++) {
            listWithDuplicates.add(i, (int) (Math.random() * 50 - 1));
        }
        listWithOutDuplicates.add(listWithDuplicates.get(0));
        int count = 0;

        for (int i = 0; i < listWithDuplicates.size() - 1; i++) {
            if (!listWithOutDuplicates.contains(listWithDuplicates.get(i))) {
                listWithOutDuplicates.add(listWithDuplicates.get(i));
            } else count++;
        }
        Collections.sort(listWithDuplicates);
        Collections.sort(listWithOutDuplicates);

        System.out.println("-----------Collection with duplicates--------------");

        System.out.println(Arrays.toString(listWithDuplicates.toArray()));
        System.out.println("Size of collection: " + listWithDuplicates.size());

        System.out.println("\n----------Collection without duplicates-------------");

        System.out.println(Arrays.toString(listWithOutDuplicates.toArray()));
        System.out.println("Size of collection: " + listWithOutDuplicates.size());

        System.out.println("------------------------------------");

        System.out.println("count of duplicates: " + count);
    }
}
