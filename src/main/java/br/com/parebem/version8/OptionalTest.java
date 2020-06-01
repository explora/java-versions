package br.com.parebem.version8;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Optional<Integer> opt = getSomething();
        System.out.println(opt.isPresent());
        if (opt.isPresent())
            System.out.println(opt.get());
        System.out.println(opt.orElse(0));
//        System.out.println(opt.orElseThrow(IllegalStateException::new));
//        System.out.println(opt.orElseThrow(() -> new LucasException()));
        System.out.println(opt.orElseThrow(LucasException::new));

        opt = getSomethingWithValue();
        System.out.println(opt.isPresent());
        if (opt.isPresent())
            System.out.println(opt.get());
        System.out.println(opt.orElse(0));
    }

    private static Optional<Integer> getSomething() {
        return Optional.ofNullable(null);
    }

    private static Optional<Integer> getSomethingWithValue() {
        return Optional.of(1);
    }
}

class LucasException extends RuntimeException {

}
