package lesson;

import Helpers.Keyboard;

public class Identifyingfamily {
    public static void main(String[] args) {

        System.out.println("Welcome to Guess the Family Member game.");
        System.out.println(
                "You will think of a family member and I will try to guess them based on true/false questions.");
        System.out.println("Are you ready to play?");

        boolean hasFeature;
        String response = Keyboard.readString();

        if (response.equals("yes")) {
            System.out.println("Does this person have long hair?");
            hasFeature = Keyboard.readBoolean();
            if (hasFeature) {
                System.out.println("The person you are thinking of is Caitlin.");

            } else {
                System.out.println("Is this person extremely short?");
                hasFeature = Keyboard.readBoolean();
                if (hasFeature) {
                    System.out.println("The person you are thinking of is Mom.");

                } else {
                    System.out.println("Is this person the youngest in the house?");
                    hasFeature = Keyboard.readBoolean();
                    if (hasFeature) {
                        System.out.println("The person you are thinking of is Daniel.");

                    } else {
                        System.out.println("Is this person a woman?");
                        hasFeature = Keyboard.readBoolean();
                        if (hasFeature) {
                            System.out.println("The person you are thinking of is Grandma.");

                        } else {
                            System.out.println("Does this person have white hair?");
                            hasFeature = Keyboard.readBoolean();
                            if (hasFeature) {
                                System.out.println("The person you are thinking of is Grandpa.");

                            } else {
                                System.out.println("The person you are thinkng of is Dad.");
                            }
                        }
                    }
                }

            }
        } else if (response.equals("no")) {
            System.out.println("Okay we will play another time then.");
        }
    }
}
