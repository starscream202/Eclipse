package Repl;

import java.util.Scanner;

public class Assign61 {

	public static void main(String[] args) {
	    Scanner inp=new Scanner(System.in);
	    int x=inp.nextInt();
	    System.out.print("In:");
	    //write your code below
	    int b=1;
	    int sum=x+b;
	    for (int a=x; a<sum; a--){
	      System.out.print(a+" ");
	      if (a<0){
	        break;
	      }
	      
	      
	    }
	}
}