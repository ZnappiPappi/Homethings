package Yr12Assignment;

import Helpers.Keyboard;

public class Switchstatement {

    public static void main(String[] args) {

        int account;

        System.out.println("Welcome. Please pick a category.");
        account = Keyboard.readInt();

        switch (account) {
            case 0:
                System.out.println("You have an account balance of:");
                break;
            case 1:
                System.out.println("");
                break;
            case 3:
                System.out.println("");
                break;
            case 4:
                System.out.println("");
            default:
                System.out.println("Process failed.");
        }
    }

}
