import java.util.Random;
import java.util.Scanner;


public class Main {
 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Please enter a number to square: ");
     int num = in.nextInt();
	 Random rn = new Random();
	 int range = 1000 - 0 + 1;
	 int randomNum =  rn.nextInt(range) + 0;
	 System.out.println(randomNum);
	 for(int i=0;i<randomNum;i++) {
		 if(randomNum%i==0) System.out.println(i); break;
	 }
}
}
