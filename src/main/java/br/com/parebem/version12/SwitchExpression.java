package br.com.parebem.version12;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SwitchExpression {
    public static void main(String[] args) {
        String fruit = "APPLE";
        int numberOfLetters = switch (fruit) {
            case "PEAR" -> 4;
            case "APPLE", "MANGO", "GRAPE" -> 5;
            case "ORANGE", "PAPAYA" -> 6;
            default -> 0;
        };
        System.out.println(numberOfLetters);

        int code = 245;
        String category = switch (code) {
            case 245 -> "A";
            case 246 -> "B";
            case 247 -> "C";
            default -> "";
        };
        System.out.println(category);

        System.out.println(Arrays.stream(new String[] { "a", "b", "c" })
                .map((s) ->
                    switch (s) {
                        case "a" -> "A";
                        case "b" -> "B";
                        default -> "-";
                    }
                )
                .collect(Collectors.toList()));
    }
}
