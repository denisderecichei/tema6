package org.tema5;

public class Aprofundare {

    public static void main(String[] args) {
//        ex5(12, "curs");
        int[] divizori = divide(100, 10);
        System.out.println("-----------");
        printArray(divizori);
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
        for (int current: array) {
            System.out.print(current);
            System.out.print(" ");
            System.out.println("ADAUGAT DIN GIT");
        }
    }
}
