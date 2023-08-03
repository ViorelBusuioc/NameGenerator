package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] firstNames = new String[] {"aNa", "GeORge", "BoB", "VIOrel", "iULIA", "PATRIcheala", "PaCAla", "otto"};

        Arrays.setAll(firstNames, s -> firstNames[s].toUpperCase());
        Arrays.setAll(firstNames, s -> firstNames[s] + " " + randomLetter() + ".");
        Arrays.setAll(firstNames, s -> firstNames[s] + " " + reverseName(firstNames[s]));


        for (String name : firstNames) {
            System.out.println(name);
        }

        List<String> fullNames = new ArrayList<>(List.of(firstNames));
        fullNames.removeIf(s -> {
            String[] names = s.split(" ");
            if (names[0].equals(names[2])) {
                return true;
            }
            return false;
        });
        System.out.println("________ Palindromes removed ______");
        fullNames.forEach(s -> System.out.printf("%s%n",s));
    }

    public static char randomLetter() {
        Random random = new Random();
        String letters = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        return letters.charAt(random.nextInt(letters.length()));
    }

    public static StringBuilder reverseName(String name) {

        String[] trimmer = name.split(" ");
        return new StringBuilder(trimmer[0]).reverse();
    }
}


