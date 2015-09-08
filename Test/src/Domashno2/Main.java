package Domashno2;

import java.util.Random;
import java.util.Scanner;

public class Main {
	 Random rn = new Random();
	 int range = 9 - 0 + 1;
	 int randomNum =  rn.nextInt(range) + 0;
	public static char[] input;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		input =  temp.toCharArray();
	}
	public static void randomNumber() {
		for(int i=0;i<4;) {
			 for(int i2=0;i2<4;) {			 Random rn = new Random();
			 int range = 9 - 0 + 1;
			 int randomNum =  rn.nextInt(range) + 0;
				 if(!input.toString().contains()) {
					 
				 }
			 }
		}
	}
}
