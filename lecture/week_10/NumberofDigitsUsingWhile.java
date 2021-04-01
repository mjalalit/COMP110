// Count Number of Digits in a Number using While Loop 

import java.util.Scanner;

public class NumberofDigitsUsingWhile {
	
	
	public static void main(String[] args) {
		int Number, Count=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter any number");
      Number = sc.nextInt();
      
      while (Number > 0) {//12
         Number = Number /10;
         Count = Count + 1;
      }
     System.out.println("Num od digits: " + Count);

		
	}
}