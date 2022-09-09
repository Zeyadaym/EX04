package EX04_06;

import java.util.Scanner;

public class EX04_06 {

	public static void main(String[] args) {
		double mile; int count=0;double kilometers ;
	Scanner input = new Scanner(System.in);
System.out.println("Enter the distance in miles please to exit press 0");
System.out.print("miles");
System.out.print("------------->");
System.out.print("kilometers");
do {
	 mile = input.nextDouble();
	 kilometers = mile*1.609;
	count++;
	System.out.print(mile);
	System.out.print("------------->");
	System.out.println(kilometers);
	if(count%2==0) {
		System.out.println("");
		System.out.println("-----------------------------");}}while(mile!=0);
System.out.println("Enter the distance in kms please to exit press 0");
System.out.print("kilometers");
System.out.print("------------->");
System.out.println("miles");

do {
	 kilometers = input.nextDouble();
	 mile = kilometers/1.609;
	count++;
	System.out.print(kilometers);
	System.out.print("------------->");
	System.out.println(mile);
	if(count%2==0)
		System.out.println("----------------------------");
}while(kilometers!=0);


	}

}
