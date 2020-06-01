package br.com.parebem.version7;

public class ImprovedExceptionHandling {

    public static void main(String[] args) {
        oldMultiCatch();
        newMultiCatch();
    }

    public static void oldMultiCatch() {

        try {
            badMethod();
        } catch(IllegalStateException e) {
            // log and deal with all Exceptions
            System.out.println("Error");
            e.printStackTrace();
//            log.error("Error.", e);
        } catch(IllegalAccessException e) {
            // log and deal with all Exceptions
            System.out.println("Error");
            e.printStackTrace();
        }

    }

    public static void newMultiCatch() {

        try{
            badMethod();
        } catch(IllegalStateException | IllegalAccessException e) {
            // log and deal with all Exceptions
            System.out.println("Error");
            e.printStackTrace();
        }

    }

    private static void badMethod() throws IllegalStateException, IllegalAccessException {
        throw new IllegalStateException();
    }
}
