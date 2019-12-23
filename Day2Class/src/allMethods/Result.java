package allMethods;

import java.util.Scanner;
import allMethods.SiArea;

public class Result {

	public static void main(String[] args) {
		SiArea sm=new SiArea();
		
		Scanner stock= new Scanner(System.in);
		System.out.println("enter the details");
		int p = stock.nextInt();
		int t = stock.nextInt();
		int r = stock.nextInt();
		System.out.println("amount is"+p+"\t time is"+t+"\t radius is"+r);
		int pr=sm.simpleinterest(p,t,r);
		System.out.println(pr);
		
		System.out.println("enter radius");
		int ra=stock.nextInt();
		System.out.println("radius is"+ra);
		float mm=sm.areaofcircle(ra);
		System.out.println(mm);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
