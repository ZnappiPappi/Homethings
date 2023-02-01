package lesson;

import Helpers.Keyboard;

public class test {
    public static void main(String[] args) {

        System.out.println("Hi :>");

        String response = Keyboard.readString();

        if (response.equals("Hi")) {
            System.out.println("I love you <3");
            String answer = Keyboard.readString();
            if (answer.equals("I love you too <3")) {
                System.out.println("Mwa :D");
            } else {
                System.out.println(":(");
            }
        } else {
            System.out.println(":(");
        }

    }
}
