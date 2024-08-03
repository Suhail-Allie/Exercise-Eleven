package org.example;

import java.util.Random;

import java.util.Scanner;

public class Main {

    // Method to reverse an array
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        // Part 1: Generate and display counts of random integers
        int[] counts = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            counts[rand.nextInt(10)]++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + ": " + counts[i]);
        }

        // Part 2: Reverse an array of user-input numbers
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int[] reversedNumbers = reverseArray(numbers);

        System.out.print("Reversed numbers: ");
        for (int num : reversedNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}