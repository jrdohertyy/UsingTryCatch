package ie.atu.studentapp;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 0-9 : ");
        Scanner myscan = new Scanner(System.in);

        String input = myscan.nextLine();

        int myNum = Integer.parseInt(input);

        if(myNum >= 0 && myNum <= 9){
            System.out.println("You entered: " + myNum);
        }
        else{
            System.out.println("Not a valid number");
        }
    }
}