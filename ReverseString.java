// Anthony Dike
// March 24 2018
// This a program that will reverse any string inputted into it

import java.util.Scanner;

class ReverseString {

	public static void main(String[] args){

		// import scanner 
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");

		// declare string as input string value
		String myString = input.nextLine();

		System.out.println("BEFORE the reverse.");
		System.out.println(myString);
		System.out.println();

		// create empty new string value to put reversed string into
		String newString = "";
		// create temp string holder for converted chars to
		// later add to new string value
		String temp = "";

		// for loop: to repeatedly go over old string and
		// take value from end and then add to beginning of
		// new string
		for (int i = myString.length() - 1; i >= 0; i --){
			// conversion from char to string is stored into temp
			// string holder.
			// quotes are added to char value
			temp = "" + myString.charAt(i);
			// add each new temp string holder value to the
			// new string
			newString += temp;
			// System.out.println(myString.charAt(i)); // debug
		}


		System.out.println("AFTER the reverse.");
		System.out.println(newString);
		System.out.println();
	}
} 