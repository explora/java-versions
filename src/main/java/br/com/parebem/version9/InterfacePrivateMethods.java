package br.com.parebem.version9;

public interface InterfacePrivateMethods {

    default long getId() {
        return buildId();
    }

    private long buildId() {
        // do something
        return 321l;
    }

}

class Main {
    public static void main(String[] args) {
        InterfacePrivateMethods defaultMethods = new InterfacePrivateMethods() {

        };
        System.out.println(defaultMethods.getId());
    }
}
