package org.tema5;

public class Confidential {

    public static void main(String[] args) {
//        int numarPotriviri = countChar("testarettttt", 't');
//        String formmatedString = String.format("Am gasit de %d in cuvant", numarPotriviri);
//        System.out.println(formmatedString);
//        System.out.println(redact("testarea"));
//        System.out.println(contains(new String[]{"Alin", "Denis", "Em", "Mihai", "Cristina", "Maria", "Maria Clara Popescu", "Edgar Allan Poe"}, "Alin"));
//        String[] aNaAreMeres = words("ANa are mere");
//        printArray(aNaAreMeres);

//        confidential("Ana are mere multe si Ana a mers sa mai cumpere mere", new String[]{"Ana", "mere"});


        String abc = "abc";
        String def = new String("abc");

        int a = 13;

        System.out.println(abc.equals(def));

        // == <- verificare de adresa DOAR PT PRIMITIVE
        // .equals() <- verificare de continut
        // == vs .equals()
    }

    public static int countChar(String stringToCount, char charToCount) {
        int counter = 0;
        char[] charDinString = stringToCount.toCharArray();
        for (char charCurent: charDinString) {
            if (charCurent == charToCount) {
                counter++;
            }
        }
        return counter;
    }

    public static String redact(String toRedact) {
//        for (int i = 0; i < toRedact.length(); i++) {
//            char charCurent = toRedact.charAt(i);
//            toRedact = toRedact.replace(charCurent, '*');
//        }
//        return toRedact;
        int lungimeaInitiala = toRedact.length();
        String cuvantulRedactat = "";
        for (int i = 0; i < lungimeaInitiala; i++) {
//            cuvantulRedactat = cuvantulRedactat.concat("*");
            cuvantulRedactat = String.join("", cuvantulRedactat, "*");
        }
        return cuvantulRedactat;
    }

    public static boolean contains(String[] stringArray, String toBeFound) {
        boolean isFound = false;
        for (String stringCurent: stringArray) {
            if (stringCurent == toBeFound) {
                isFound = true;
            }
        }
        return isFound;
    }

    public static String[] words(String sentence) {
        return sentence.split(" ");
    }

    public static void confidential(String toBeChanged, String[] toBeRedacted) {
        String[] sentenceBrokenDown = words(toBeChanged);
        for (int i = 0; i < sentenceBrokenDown.length; i++) {

            for (int j = 0; j < toBeRedacted.length; j++) {
                if (sentenceBrokenDown[i].equals(toBeRedacted[j])) {
                    sentenceBrokenDown[i] = redact(sentenceBrokenDown[i]);
                }
            }
        }
        System.out.println(String.join(" ", sentenceBrokenDown));
        //printArray(sentenceBrokenDown);

    }

    public static void printArray(String[] array) {
        for (String current: array) {
            System.out.print(current);
            System.out.print(" ");
        }
    }
}
