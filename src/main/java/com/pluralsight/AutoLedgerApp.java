package com.pluralsight;

import java.util.Scanner;

public class AutoLedgerApp {
    //Class Level Field Variables
    //Path for the file I am reading (transactions.csv)
    public static String filePath = "src/main/resources/transactions.csv";
    public static Scanner myScanner = new Scanner(System.in);
    public static String mainMenuPrompt = """
                🏁............🏎💨..
                ===== Main Menu =====
                (D) Add Deposit
                (P) Make Payment (Debit)
                (L) Ledger
                (X) Exit
                """;
    public static String ledgerMenuPrompt = """
                === Ledger Menu ===
                (A) View All Deposits
                (D) View Deposits
                (P) View Payments
                (R) Custom Report Search
                (H) Back To Home Page
                """;
    //All my code that needs to run
    public static void main(String[] args) {
        mainMenu();
        System.out.println("End of Application");

    }
    public static void mainMenu() {
        boolean running = true;
        do {
            System.out.println(mainMenuPrompt);
            //todo Add a .ignorecase somehow into the usersInput
            String userInput = myScanner.nextLine();
            switch (userInput) {
                case "D":
                    addDeposit();
                    break;
                case "P":
                    makePayment();
                    break;
                case "L":
                    ledgerMenu();
                    break;
                case "X":
                    running = false;
                    break;
                default:
                    System.err.println("You did not enter a valid input");
            }
        } while (running);
    }

    private static void addDeposit() {
        //todo prompt user for the deposit information and save it to the csv file
    }

    private static void makePayment() {
        //todo prompt user for the debit information and save it to the csv file
    }

    private static void ledgerMenu() {
        System.out.println(ledgerMenuPrompt);
        //todo Add a .ignorecase somehow into the usersInput


    }


}
