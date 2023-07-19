package arranging_coins;

import java.util.Scanner;
/*
	 You have n coins and you want to build a staircase with these coins.
	 The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
	 Given the integer n, return the number of complete rows of the staircase you will build.
	
	Input: n = 5
	Output: 2
	
	Input: n = 8
	Output: 3
	
	Explanation: Because the 4th row is incomplete, we return 3.
 */
public class Arranging_Coins {
	
	private static int complete_rows(int n) {
	 int count=0;
	 int rows=0;
	 while(rows<n)
	 {
		 count++;
		 rows+=count;
	 }
	 if(rows>n)
	 {
		 count--;
	 }
	 return count;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println(complete_rows(n));
	}

	

}
