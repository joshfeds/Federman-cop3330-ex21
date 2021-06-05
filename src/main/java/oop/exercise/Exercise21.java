package oop.exercise;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 *
 * Write a program that converts a number from 1 to 12 to the corresponding month.
 * Prompt for a number and display the corresponding calendar month,
 * with 1 being January and 12 being December. For any value outside that range,
 * display an appropriate error message.

Example Output
Please enter the number of the month: 3
The name of the month is March.
Constraints
Use a switch or case statement for this program.
Use a single output statement for this program.
 */

public class Exercise21
{
    static Scanner input = new Scanner(System.in);
    public static int getNumber(){
        System.out.print("Please enter the number of the month: ");
        return input.nextInt();
    }
    public static void getMonth(int number){
        String statement = new String();
        switch(number) {
            case 1:
                statement = "The name of the month is January";
            case 2:
                statement = "The name of the month is February";
            case 3:
                statement = "The name of the month is March";
            case 4:
                statement = "The name of the month is April";
            case 5:
                statement = "The name of the month is May";
            case 6:
                statement = "The name of the month is June";
            case 7:
                statement = "The name of the month is July";
            case 8:
                statement = "The name of the month is August";
            case 9:
                statement = "The name of the month is September";
            case 10:
                statement = "The name of the month is October";
            case 11:
                statement = "The name of the month is November";
            case 12:
                statement = "The name of the month is December";
            default:
                statement = "Error: This is not a month!";
        }
        System.out.print(statement);
    }
    public static void main( String[] args ) {
        int number = getNumber();

    }
}
