package br.com.parebem.version8;

import java.util.Arrays;

public class LambdaExpression {
    public static void main(String[] args) {
        String[] names = new String[] { "janete", "josias", "nomegrandepracaraio", "leo", "jose", "joaquim" };
        Arrays.sort(names, (String s1, String s2) -> s2.length() - s1.length());
        System.out.println(Arrays.toString(names));
    }
}
