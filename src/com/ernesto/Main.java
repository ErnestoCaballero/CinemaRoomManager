package com.ernesto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        CinemaRoom cinemaRoom = new CinemaRoom(rows, seats);

        cinemaRoom.printCinemaRoom();

        cinemaRoom.selectSeat(scanner);

    }

    static void incomeCalculator() {
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

    enum roomType {
        NORMAL,
        BIG
    }

    static class CinemaRoom {
        int rows;
        int seats;
        String[][] room;
        roomType type;

        CinemaRoom(int rows, int seats) {
            this.rows = rows;
            this.seats = seats;
            this.room = new String[this.rows][this.seats];
            type = rows * seats > 60 ? roomType.BIG : roomType.NORMAL;
            populateCinemaRoom();
        }

        public int getRows() {
            return rows;
        }

        public int getSeats() {
            return seats;
        }

        public String[][] getRoom() {
            return room;
        }

        public void setRows(int rows) {
            this.rows = rows;
        }

        public void setSeats(int seats) {
            this.seats = seats;
        }

        public void populateCinemaRoom() {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < seats; j++) {
                    room[i][j] = "S";
                }
            }
        }

        public void printCinemaRoom() {
            // Print Header
            System.out.println("\nCinema: ");
            System.out.print("  ");
            for (int i = 1; i <= seats; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

            // Print body
            for (int i = 0; i < room.length; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < room[i].length; j++) {
                    System.out.print(room[i][j] + " ");
                }
                System.out.println();
            }
        }

        public void selectSeat(Scanner scanner) {
            System.out.println("\nEnter a row number:");
            int selectedRow = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            int selectedSeat = scanner.nextInt();

            room[selectedRow - 1][selectedSeat - 1] = "B";

            int ticketPrice = 10;

            if (type == roomType.BIG && selectedRow > rows / 2) {
                ticketPrice = 8;
            }

            System.out.println("\nTicket price: $" + ticketPrice);

            printCinemaRoom();

        }

    }
}



















