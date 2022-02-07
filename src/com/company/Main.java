package com.company;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        int[] myIntMassive = new int[3];
        for (int i = 0; i <= 2; i++) {
            myIntMassive[i] = i + 1;
        }
        float[] myFloatMassive = {-1.57f, 7.654f, 9.986f};

        String[] myStringMassive = {"Red", "Green", "Blue"};

        //Задача 2
        System.out.println("Задача 2");

        String p = ",";

        for (int i = 0; i <= myIntMassive.length - 1; i++) {
            if (i == myIntMassive.length - 1) {
                p = "";
            }
            System.out.print(myIntMassive[i] + p + " ");
        }

        System.out.println();

        p = ",";
        for (int i = 0; i <= myFloatMassive.length - 1; i++) {
            if (i == myFloatMassive.length - 1) {
                p = "";
            }
            System.out.print(myFloatMassive[i] + p + " ");
        }

        System.out.println();

        p = ",";
        for (int i = 0; i <= myStringMassive.length - 1; i++) {
            if (i == myStringMassive.length - 1) {
                p = "";
            }
            System.out.print(myStringMassive[i] + p + " ");
        }

        System.out.println();
        System.out.println();

        // Задача 3
        System.out.println("Задача 3");

        p = ",";
        for (int i = myIntMassive.length - 1; i >= 0; i--) {
            if (i == 0) {
                p = "";
            }
            System.out.print(myIntMassive[i] + p + " ");
        }

        System.out.println();

        p = ",";
        for (int i = myFloatMassive.length - 1; i >= 0; i--) {
            if (i == 0) {
                p = "";
            }
            System.out.print(myFloatMassive[i] + p + " ");
        }

        System.out.println();

        p = ",";
        for (int i = myStringMassive.length - 1; i >= 0; i--) {
            if (i == 0) {
                p = "";
            }
            System.out.print(myStringMassive[i] + p + " ");
        }

        System.out.println();
        System.out.println();

        //Задача 4
        p = ",";
        System.out.println("Задача 4");
        for (int i = 0; i <= myIntMassive.length - 1; i++) {
            if (myIntMassive[i] % 2 != 0) {
                myIntMassive[i] += 1;
            }
            if (i == myIntMassive.length - 1) {
                p = "";
            }
            System.out.print(myIntMassive[i] + p + " ");
        }

    }
}
