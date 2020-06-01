package br.com.parebem.version11;

public class NewStringMethods {

    public static void main(String[] args) {
        System.out.println("\n\t  hello   \u2005".strip());
        System.out.println("\n\t\u2005  ".isBlank());
        String str = "GeeksForGeeks";
        System.out.println(str.repeat(4));

        String s = "";
        for (int i = 0; i < 10000; i++) {
            s += i;
        }
        System.out.println(s);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            builder.append(i);
        }
        System.out.println(builder.toString());
    }
}
