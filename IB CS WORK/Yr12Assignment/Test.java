package Yr12Assignment;

import Helpers.Keyboard;

public class Test {

    public static String currency = " Euros";

    public static void main(String[] args) {

        int MsC123 = 50;
        int BaldCanadian = 0;
        int Zoxlvr4 = 0;
        int Ihtemath34 = 0;
        int SlipperySai = 0;

        int dep;
        int with;

        int[] accNumber = new int[5];

        accNumber[0] = MsC123;
        accNumber[1] = BaldCanadian;
        accNumber[2] = Zoxlvr4;
        accNumber[3] = Ihtemath34;
        accNumber[4] = SlipperySai;

        System.out.println("Welcome to Woozer!! Your trusted banking entity! :D");
        System.out.println("Please enter your account username to continue.");

        String username = Keyboard.readString();
        if (username.equals("MsC123")) {
            System.out.println("Welcome Ms Camilleri. Please pick a category.");
            System.out.println("A. Display account balance.");
            System.out.println("B. Deposit money.");
            System.out.println("C. Withdraw money.");
            System.out.println("D. Quit.");

            String option = Keyboard.readString();
            if (option.equals("A")) {
                System.out.println("You have a balance of:");
                System.out.println(accNumber[0] + currency);
            } else if (option.equals("B")) {
                System.out.println("How much money would you like to deposit?");
                dep = Keyboard.readInt();
                System.out.println("Your current balance is:");
                System.out.println(accNumber[0] + dep + currency);
            } else if (option.equals("C")) {
                System.out.println("How much money would you like to withdraw?");
                with = Keyboard.readInt();
                if (with <= accNumber[0]) {
                    System.out.println("Your current balance is:");
                    System.out.println(accNumber[0] - with + currency);
                } else {
                    System.out.print("Transaction failed, insuficient funds.");
                }
            } else if (option.equals("D")) {
                System.out.println("Logging out of account...");
            }

        } else if (username.equals("BaldCanadian")) {
            System.out.println("Welcome Kailu. Please pick a category.");
            System.out.println("A. Display account balance.");
            System.out.println("B. Deposit money.");
            System.out.println("C. Withdraw money.");
            System.out.println("D. Quit.");

            String option = Keyboard.readString();
            if (option.equals("A")) {
                System.out.println("You have a balance of:");
                System.out.println(accNumber[1] + currency);
            } else if (option.equals("B")) {
                System.out.println("How much money would you like to deposit?");
                dep = Keyboard.readInt();
                System.out.println("Your current balance is:");
                System.out.println(accNumber[1] + dep + currency);
            } else if (option.equals("C")) {
                System.out.println("How much money would you like to withdraw?");
                with = Keyboard.readInt();
                if (with <= accNumber[1]) {
                    System.out.println("Your current balance is:");
                    System.out.println(accNumber[1] - with + currency);
                } else {
                    System.out.print("Transaction failed, insuficient funds.");
                }
            } else if (option.equals("D")) {
                System.out.println("Logging out of account...");
            }
        } else if (username.equals("Zoxlvr4")) {
            System.out.println("test");
        } else if (username.equals("Ihtemath34")) {
            System.out.println("test");
        } else if (username.equals("SlipperySai")) {
            System.out.println("test");
        } else {
            System.err.println("Incorrect user.");
        }

    }

}
