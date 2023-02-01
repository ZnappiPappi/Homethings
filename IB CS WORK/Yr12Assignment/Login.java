package Yr12Assignment;

import Helpers.Keyboard;

public class Login {

    public static String username = "user";
    public static String password = "pass";
    public static String name = "nme";

    public static void main(String[] args) {

        System.out.println("Welcome to Woozer! Please enter a desired username.");
        username = Keyboard.readString();
        System.out.println("Now please enter a password");
        password = Keyboard.readString();
        System.out.println("Lastly, please enter your name.");
        name = Keyboard.readString();
        System.out.println("Please check that your details are correct.");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Name: " + name);
        System.out.println("Are they correct?");
        String response = Keyboard.readString();
        if (response.equals("Yes")) {
            System.out.println("Thank you and have a nice day :)");
        } else {
            System.out.println("OOF");
        }
    }
}
