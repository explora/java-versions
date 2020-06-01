package br.com.parebem.version8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// MELHORAR OS EXEMPLOS
public class Streams {
    public static void main(String[] args) {
        IntStream.range(1, 11).forEach((int i) -> System.out.println(i));
//        IntStream.range(1, 11).forEach(System.out::println);

        Arrays.stream(new String[] { "a", "b", "c" }).forEach(System.out::println);

        System.out.println(Arrays.stream(new String[] { "a", "b", "c" })
                .map((s) -> {
                    switch (s) {
                        case "a":
                            return "A";
                        case "b":
                            return "B";
                        default:
                            return "-";
                    }
                })
                .collect(Collectors.toList()));
    }
}
