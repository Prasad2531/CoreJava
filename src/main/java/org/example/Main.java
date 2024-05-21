package org.example;


import java.util.Optional;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String email = null;
//        Optional<String> emailOptional = Optional.ofNullable(email);
//        System.out.println(Optional.empty());
//        Optional<String> emailOptional1 = Optional.of(email);
//        System.out.println(emailOptional1);
//        System.out.println(emailOptional);
        Optional<String> email1 = Optional.of("Heklodjs");
        email1.ifPresent((s)-> System.out.println(email1.get()));
//        email1.ifPresent((s)-> System.out.println(email1.get()));
        String s = email1.orElseGet(() -> "Default Email");
//        System.out.println(s);
        String result = "abc ";
        System.out.println(result);
        Optional<String> optStr = Optional.of(result);
        optStr.filter(res-> res.contains("abc"))
                .map(String::trim)
                .ifPresent((res)-> System.out.println(res));
    }
}
