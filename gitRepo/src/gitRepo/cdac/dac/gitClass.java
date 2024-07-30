
package gitRepo.cdac.dac;

import java.util.Scanner;

public class gitClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scn = new Scanner(System.in))
		{
			System.out.println("Enter three numbers");
			int fNum = scn.nextInt();
			int sNum = scn.nextInt();
			int tNum = scn.nextInt();
			int sumOfTheNumbers = fNum + sNum + tNum;
			System.out.println("The sum of the three numbers is : "+sumOfTheNumbers);
		}

	}

}
