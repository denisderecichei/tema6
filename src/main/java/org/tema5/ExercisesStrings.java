package org.tema5;

import java.util.Random;

public class ExercisesStrings {
    private static String[] names = new String[]{
            "Alin", "Denis", "Em", "Mihai", "Cristina", "Maria", "Maria Clara Popescu", "Edgar Allan Poe"
    };

    private static Random random = new Random();

    public static void main(String[] args) {
        //ex1();
//        ex2("M");
//        ex3();
//        ex4();
//        ex5();
        ex6();
    }

    public static void ex1() {
        for (String numeCurent : names) {
            if (numeCurent.charAt(0) == 'A') {
                System.out.println(numeCurent);
            }
        }
    }

    public static void ex2(String filtru) {
        for (String numeCurent : names) {
            if (numeCurent.contains(filtru)) {
                System.out.println(numeCurent);
            }
        }
    }


    public static void ex3() {
        for (String numeCurent : names) {
            numeCurent = numeCurent.replace('r', '*');
            System.out.println(numeCurent);
        }
    }

    public static void ex4() {
        for (String numeCurent : names) {
            //solutia 1
//            int lungimeaMaximaCeOPotCere = 3;
//            if (numeCurent.length() < 3) {
//                lungimeaMaximaCeOPotCere = numeCurent.length();
//            }
//            System.out.println(numeCurent.substring(0, lungimeaMaximaCeOPotCere));
            //solutia 2
//            if (numeCurent.length() >= 3) {
//                System.out.println(numeCurent.substring(0, 3));
//            } else {
//                System.out.println(numeCurent);
//            }
            //solutia 3
            System.out.println(numeCurent.substring(0, Math.min(3, numeCurent.length())));
        }
    }

    public static void ex5() {
        for (String numeCurent : names) {
            int pozitiaDePrintat = random.nextInt(numeCurent.length());
            System.out.println(numeCurent.charAt(pozitiaDePrintat));
        }
    }

    public static void ex6() {
        for (String numeCurent : names) {
            String[] componente = numeCurent.split(" ");
            if (componente.length == 3) {
//                "Maria C. Popescu"
                System.out.println(componente[0] + " " + componente[1].charAt(0) + "." + " " + componente[2]);
                String numeAbreviat = "";
                numeAbreviat = numeAbreviat.concat(componente[0]);
                numeAbreviat = numeAbreviat.concat(" ");
                numeAbreviat = numeAbreviat.concat(componente[1].charAt(0) + ".");
//                componente[1] = componente[1].substring(0, 1) + ".";
            }
        }
    }

}
