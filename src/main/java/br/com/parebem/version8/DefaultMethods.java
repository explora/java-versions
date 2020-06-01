package br.com.parebem.version8;

public interface DefaultMethods {

    default long getId() {
        return 123l;
    }

}

class Main {
    public static void main(String[] args) {
        DefaultMethods defaultMethods = new DefaultMethods() {
            public long getId() {
                return 321;
            }
        };
        System.out.println(defaultMethods.getId());
    }
}
