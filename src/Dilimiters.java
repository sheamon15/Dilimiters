/**
 * Author: Shea Salloum
 * Date: September 11, 2017
 * License: GNU
 * Purpose: Use delimiters to find averages
 */

import java.util.Scanner;

public class Dilimiters {
    public static void main(String [] args){
        int i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;// ALLOWS ME TO INPUT NUMBERS
                Scanner keyboard1 = new Scanner(System.in);
                keyboard1.useDelimiter(",");// separates input with a comma
                System.out.println("Enter 10 Numbers separated by commas" + "\t" + "to find the average");
        i1 = Integer.parseInt(keyboard1.next()); // lets the keyboard understand variables
        i2 = Integer.parseInt(keyboard1.next());
        i3 = Integer.parseInt(keyboard1.next());
        i4 = Integer.parseInt(keyboard1.next());
        i5 = Integer.parseInt(keyboard1.next());
        i6 = Integer.parseInt(keyboard1.next());
        i7 = Integer.parseInt(keyboard1.next());
        i8 = Integer.parseInt(keyboard1.next());
        i9 = Integer.parseInt(keyboard1.next());
        i10 = Integer.parseInt(keyboard1.next());
        i11= ( i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10);// adds all inputted integers
        i12= (i11/10);// does the final calculation to find average
        System.out.println("The average is" + "\n" + i12);// Displays the average

    }


}
