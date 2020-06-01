package br.com.parebem.version10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableCollections {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        System.out.println(integers);

        List<Integer> evenList = integers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(evenList);

        evenList.add(1);
    }
}
