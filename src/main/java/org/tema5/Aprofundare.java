package org.tema5;

import java.util.Random;
import java.util.Scanner;

public class Aprofundare {
    private static Random random = new Random();

    public static void main(String[] args) {
//        ex5(12, "curs");
        int[] divizori = divide(100, 10);
        System.out.println("-----------");
        printArray(divizori);
        ex1();
        ex2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    public static void ex1() {
        int i = 0;
        for (i = 0; i < 100; i++) {
            System.out.println(i);
        }
        i = 0;
        while (i < 100) {
            System.out.println(i);
            i++;
        }
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 100);
    }

    public static void ex2(int[] array) {
        for (int current : array) {
            System.out.print(current);
            System.out.print(" ");
        }
    }

    public static void ex3(String[] array) {
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }

    public static void ex4(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array);
            } else {
                System.out.println(array);
            }
        }
    }


    public static void ex5(int size, String toBeAdded) {
        if (toBeAdded.length() >= size) {
            System.out.println(toBeAdded);
            return;
        }
        int emptySlots = size - toBeAdded.length();
        String finalString = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < emptySlots; i++) {
            builder.append("*");
//            finalString = finalString.concat(" ");
            finalString = String.join("", finalString, "*");
        }
        finalString = finalString.concat(toBeAdded);
        builder.append(toBeAdded);
        String stringBuffer = builder.toString();
        System.out.println(finalString);
        System.out.println(stringBuffer);
    }

    //guess the number
    public static void ex6() {
        //generare random intre 1 si 100 (initial 0-99 apoi +1)
        int randomNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your guess (1-100): ");
            int userInput = scanner.nextInt();

            if (userInput < randomNumber) {
                System.out.println("Sorry, you're too low. Try again.");
            } else if (userInput > randomNumber) {
                System.out.println("Sorry, you're too high. Try again.");
            } else {
                System.out.println("You guessed it! Congratulations!");
                break;
            }
        }
    }

    //acesta este ex7
    public static int[] divide(int n, int k) {
//        int counter = 0;
        int sizeArray = n / k;
        int[] divizori = new int[sizeArray];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                divizori[index] = i;
                index++;
            }
        }
        return divizori;
        //solutia cu counter, si cu 2 foruri.
    }

    public static void printArray(int[] array) {
        for (int current : array) {
            System.out.print(current);
            System.out.print(" ");
            System.out.println("ADAUGAT DIN GIT");
        }
    }
}
