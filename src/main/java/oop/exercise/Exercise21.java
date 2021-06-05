package oop.exercise;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman

 */

public class Exercise21
{
    static Scanner input = new Scanner(System.in);
    public static String getNumber(){
        System.out.print("Please enter the number of the month: ");
        return input.nextLine();
    }
    public static void getMonth(String number){
        String statement;
        switch(number) {
            case "1":
                statement = "The name of the month is January";
                break;
            case "2":
                statement = "The name of the month is February";
                break;
            case "3":
                statement = "The name of the month is March";
                break;
            case "4":
                statement = "The name of the month is April";
                break;
            case "5":
                statement = "The name of the month is May";
                break;
            case "6":
                statement = "The name of the month is June";
                break;
            case "7":
                statement = "The name of the month is July";
                break;
            case "8":
                statement = "The name of the month is August";
                break;
            case "9":
                statement = "The name of the month is September";
                break;
            case "10":
                statement = "The name of the month is October";
                break;
            case "11":
                statement = "The name of the month is November";
                break;
            case "12":
                statement = "The name of the month is December";
                break;
            default:
                statement = "Error: This month does not exist.";
        }
        System.out.print(statement);
    }
    public static void main( String[] args ) {
        String number = getNumber();
        getMonth(number);
    }
}
