package ie.atu.studentapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 0-9 : ");




        try (Scanner myscan = new Scanner(System.in);){

            String input = myscan.nextLine();

            int myNum = Integer.parseInt(input);

            while (myNum > 0 || myNum < 9) {

                try {

                    if (myNum >= 0 && myNum <= 9) {
                        System.out.println("You entered: " + myNum);
                    } else {
                        System.out.println("Not a valid number");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Enter number between 0-9: ");
                }
            }

        }
    }
}