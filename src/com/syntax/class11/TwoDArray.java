package com.syntax.class11;

public class TwoDArray {

	public static void main(String[] args) {
		
		char[][] array= new char[3][4];
		array[0][0]='A';
		array[0][1]='B';
		array[0][2]='C';
		array[0][3]='D';
		array[1][0]='E';
		array[1][1]='F';
		array[1][2]='G';
		array[1][3]='H';
		array[2][0]='I';
		array[2][1]='J';
		array[2][2]='K';
		array[2][3]='L';
		System.out.println(array[1][3]);
	}

}