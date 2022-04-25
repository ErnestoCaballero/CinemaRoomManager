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

        while(true) {
            int option = printInitialMenu(scanner);

            switch (option) {
                case 0:
                    return;
                case 1:
                    cinemaRoom.printCinemaRoom();
                    break;
                case 2:
                    cinemaRoom.selectSeat(scanner);
                    break;
                case 3:
                    cinemaRoom.printStatistics();
                    break;
                default:
                    break;
            }
        }
    }

    static int printInitialMenu(Scanner scanner) {
        System.out.println("\n1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
        return scanner.nextInt();
    }

    enum roomType {
        NORMAL,
        BIG
    }

    static class CinemaRoom {
        int rows;
        int seats;
        int purchasedTickets;
        int currentIncome;
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
            int selectedRow;
            int selectedSeat;

            while(true) {
                System.out.println("\nEnter a row number:");
                selectedRow = scanner.nextInt();
                System.out.println("Enter a seat number in that row:");
                selectedSeat = scanner.nextInt();


                if (selectedRow > rows || selectedSeat > seats || selectedRow < 0 || selectedSeat < 0) {
                    System.out.println("\nWrong input!");
                } else if ("B".equals(room[selectedRow - 1][selectedSeat - 1])) {
                    System.out.println("\nThat ticket has already been purchased!");
                } else {
                    break;
                }

            }

            room[selectedRow - 1][selectedSeat - 1] = "B";

            int ticketPrice = 10;

            if (type == roomType.BIG && selectedRow > rows / 2) {
                ticketPrice = 8;
            }

            System.out.println("\nTicket price: $" + ticketPrice);

            purchasedTickets++;
            currentIncome += ticketPrice;

        }

        public void printStatistics() {
            final int seatPrice = 10;
            float percentage = this.purchasedTickets * 100 / (float) (this.seats * this.rows);
            int totalIncome = this.type == roomType.NORMAL
                    ? rows * seats * seatPrice
                    : seats * ((rows / 2) * seatPrice + (rows - (rows / 2)) * (seatPrice - 2));

            System.out.printf("%nNumber of purchased tickets: %d%nPercentage: %.2f%%%nCurrent income: $%d%nTotal income: $%d%n", this.purchasedTickets, percentage, this.currentIncome, totalIncome);

//            System.out.println("\nNumber of purchased tickets: " + this.purchasedTickets);
//            System.out.printf("Percentage: %.2f%%%n", percentage);
//            System.out.println("Current income: $" + this.currentIncome);
//            System.out.println("Total income: $" + totalIncome);
        }

    }
}



