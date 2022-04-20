package com.ernesto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int seatPrice = 10;

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row: ");
        int seats = scanner.nextInt();
        int income;

        if (rows * seats < 60) {
            income = rows * seats * seatPrice;
        } else {
            System.out.println("Enter more than 60");
            income = seats * ((rows / 2) * seatPrice + (rows - (rows / 2)) * (seatPrice - 2));
        }

        System.out.println("Total income: \n$" + income);

    }

    static void printCinemaRoom() {
        System.out.println("Cinema:\n" +
                "  1 2 3 4 5 6 7 8\n" +
                "1 S S S S S S S S\n" +
                "2 S S S S S S S S\n" +
                "3 S S S S S S S S\n" +
                "4 S S S S S S S S\n" +
                "5 S S S S S S S S\n" +
                "6 S S S S S S S S\n" +
                "7 S S S S S S S S");
    }
}
