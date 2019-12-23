package allMethods;

import java.util.Scanner;

public class Result1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddNumbers anum= new AddNumbers();
		
		
		Scanner stock= new Scanner(System.in);
		System.out.println("enter your choice ");
		System.out.println("1 for numbers ");
		System.out.println("2 for strings ");
		int choice=stock.nextInt();
		
		switch (choice)
		{
		
		case 1: 
			System.out.println("enter 2 values ");
			int a= stock.nextInt();
			int b= stock.nextInt();
			anum.numbers(a,b);
		
		case 2:
			System.out.println("enter 2 strings ");
			String c= stock.next();
			String d= stock.next();
			anum.strings(c,d);
			
	}

}
}