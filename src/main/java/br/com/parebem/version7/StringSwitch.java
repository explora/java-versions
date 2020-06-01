package br.com.parebem.version7;

public class StringSwitch {
    public static void main(String[] args) {
        System.out.println(oldProcess());
        System.out.println(process());
    }

    public static String oldProcess() {
        String status = "a";
        if (status.equals("a"))
            return "A";
        else if (status.equals("b"))
            return "B";
        else
            return "-";
    }

    public static String process() {
        String status = "a";
        switch (status) {
            case "a":
                return "A";
            case "b":
                return "B";
            default:
                return "-";
        }
    }
}
