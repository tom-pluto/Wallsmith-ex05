/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

/*
    PSEUDOCODE:
    Define variables (numFirst, numSecond, addition, subtraction, multiplication, division)
    Create scanner
    Prompt for numFirst
    Read for numFirst
    Prompt for numSecond
    Read for numSecond
    Calculate addition value
    Calculate subtraction value
    Calculate multiplication value
    Calculate division value
    Print addition result, subtraction result, multiplication result, division result
*/

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {

        int numFirst, numSecond, addition, subtraction, multiplication, division;

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the first number? ");
        numFirst = scanner.nextInt();
        System.out.print("What is the second number? ");
        numSecond = scanner.nextInt();

        addition = numFirst+numSecond;
        subtraction = numFirst-numSecond;
        multiplication = numFirst*numSecond;
        division = numFirst/numSecond;

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d",
                numFirst, numSecond, addition,
                numFirst, numSecond, subtraction,
                numFirst, numSecond, multiplication,
                numFirst, numSecond, division);
    }
}
