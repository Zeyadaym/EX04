import java.util.Scanner;

public class EX04_05 {

	public static void main(String[] args) {
		double kilograms; int count=0;double pounds ;
	Scanner input = new Scanner(System.in);
System.out.println("Enter the weight in kilograms please to exit press 0");
System.out.print("kilograms");
System.out.print("------------->");
System.out.print("pounds");
do {
	 kilograms = input.nextDouble();
	 pounds = kilograms/2.2;
	count++;
	System.out.print(kilograms);
	System.out.print("------------->");
	System.out.println(pounds);
	if(count%2==0) {
		System.out.println("");
		System.out.println("-----------------------------");}}while(kilograms!=0);
System.out.println("Enter the weight in pounds please to exit press 0");
System.out.print("pounds");
System.out.print("------------->");
System.out.println("kilograms");

do {
	 pounds = input.nextDouble();
	 kilograms = pounds*2.2;
	count++;
	System.out.print(pounds);
	System.out.print("------------->");
	System.out.println(kilograms);
	if(count%2==0)
		System.out.println("----------------------------");
}while(pounds!=0);

	
	}}

