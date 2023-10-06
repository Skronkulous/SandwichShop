package com.pluralsight;
import java.util.*;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner kbScanner = new Scanner(System.in);
        final double regSand = 5.45;
        final double lrgSand = 8.95;
        final double loadedRegSand = 6.45;
        final double loadedLrgSand = 10.70;
        final double studentDisc = .90;
        final double seniorDisc = .80;

        System.out.print("Please choose a sandwich size: \n     Regular Sandwich: $5.45\n     Large Sandwich: $8.95\n");
        System.out.print("Would you like a regular or large sandwich? (1 or 2): ");
        int choice =kbScanner.nextInt();
        System.out.println("");
        System.out.print("Loaded Options: \n     Regular Loaded: Additional $1.00\n     Large Loaded: Additional $1.75\n");
        System.out.print("Would you like your sandwich loaded or not loaded? (1 or 2): ");
        int loaded = kbScanner.nextInt();
        System.out.println("");
        System.out.print("How old are you?: ");
        int age = kbScanner.nextInt();
        System.out.println("");
        if ((choice == 1) && (age <= 17)){
            if(loaded == 1){
                System.out.println("You are eligible for the student discount! ");
                System.out.println("Your regular loaded sandwich will cost $" + (loadedRegSand * studentDisc) + "!");
            }
            else{
                System.out.println("You are eligible for the student discount! ");
                System.out.println("Your regular sandwich will cost $" + (regSand * studentDisc) + "!");
            }
        }
        else if((choice == 1) && (age > 65)){
            if(loaded == 1){
                System.out.println("You are eligible for the senior discount! ");
                System.out.println("Your loaded regular sandwich will cost $" + (loadedRegSand * seniorDisc) + "!");
            }
            else{
                System.out.println("You are eligible for the senior discount! ");
                System.out.println("Your regular sandwich will cost $" + (regSand * seniorDisc) + "!");
            }
        }
        else if ((choice == 2) && (age <= 17)){
            if(loaded == 1){
                System.out.println("You are eligible for the student discount! ");
                System.out.println("Your loaded large sandwich will cost $" + (loadedLrgSand * studentDisc) + "!");
            }
            else{
                System.out.println("You are eligible for the student discount! ");
                System.out.println("Your large sandwich will cost $" + (lrgSand * studentDisc) + "!");
            }
        }
        else if((choice == 2) && (age >= 65)){
            if(loaded == 1){
                System.out.println("You are eligible for the senior discount! ");
                System.out.println("Your loaded large sandwich will cost $" + (loadedLrgSand * seniorDisc) + "!");
            }
            else{
                System.out.println("You are eligible for the senior discount! ");
                System.out.println("Your large sandwich will cost $" + (lrgSand * seniorDisc) + "!");
            }
        }
        else if((choice == 1) && ((age < 65) && (age > 17))){
            if(loaded == 1){
                System.out.println("Unfortunately, you are not eligible for a discount! ");
                System.out.println("Your loaded regular sandwich will cost $" + loadedRegSand + "!");
            }
            else{
                System.out.println("Unfortunately, you are not eligible for a discount! ");
                System.out.println("Your regular sandwich will cost $" + regSand + "!");
            }
        }
        else if((choice == 2) && ((age < 65) && (age > 17))){
            if(loaded == 1){
                System.out.println("unfortunately, you are not eligible for discount! ");
                System.out.println("Your loaded large sandwich will cost $" + loadedLrgSand + "!");
            }
            else{
                System.out.println("unfortunately, you are not eligible for discount! ");
                System.out.println("Your large sandwich will cost $" + lrgSand + "!");
            }
        }
    }
}
