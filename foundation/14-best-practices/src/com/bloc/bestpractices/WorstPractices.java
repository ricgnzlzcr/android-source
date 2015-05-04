package com.bloc.bestpractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorstPractices extends Object {

	/************************************************
	 *	ASSIGNMENT:
	 *	Fix code and comments below this block
	/************************************************/

	public static void main(String [] args) {
		int mNum = WorstPractices.magicNumber(false);
		mNum *= 5;
		if (mNum > 18) {
			while(mNum > 0) {
				System.out.println(String.valueOf(mNum));
				mNum--;
			}
		}
	}


	/*********************
	* Function: animals
	* Usage: int x = WorstPractices.magicNumber(true);
	* Returns: integer representation of a Magic Number
	* ------------------------------------------------
	* Takes in a boolean that helps determine the magic number
	* recieved by the user. 
	/*********************/

	private static int magicNumber(boolean getMagicNumber) {
		
		int aInt = getMagicNumber ? 34 : 21;
		float multiplier = .5f;
		for (int i = 0; i < 5; i++) { 
			multiplier *= (float)aInt / 10;
		} 
		return (int) multiplier * aInt;
}

	/************************************************
	 *	ASSIGNMENT
	 *	Fix code and comments above this block
	/************************************************/
}
