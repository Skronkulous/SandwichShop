package com.pluralsight;
import java.util.*;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner kbScanner = new Scanner(System.in);
        double regSand = 5.45;
        double lrgSand = 8.95;
        final double studentDisc = .90;
        final double seniorDisc = .80;

        System.out.print("Would you like a regular or large sandwich? (1 or 2): ");
        int choice =kbScanner.nextInt();
        System.out.print("How old are you?: ");
        int age = kbScanner.nextInt();
        if ((choice == 1) && (age <= 17)){
            System.out.println("Your regular sandwich will cost $" + (regSand * studentDisc) + "!");
        }
        else if((choice == 1) && (age > 65)){
            System.out.println("Your regular sandwich will cost $" + (regSand * seniorDisc) + "!");
        }
        else if ((choice == 2) && (age <= 17)){
            System.out.println("Your large sandwich will cost $" + (lrgSand * studentDisc) + "!");
        }
        else if((choice == 2) && (age >= 65)){
            System.out.println("Your large sandwich will cost $" + (lrgSand * seniorDisc) + "!");
        }
        else if((choice == 1) && ((age < 65) && (age > 17))){
            System.out.println("Your regular sandwich will cost $" + regSand + "!");
        }
        else if((choice == 2) && ((age < 65) && (age > 17))){
            System.out.println("Your large sandwich will cost $" + lrgSand + "!");
        }
    }
}
