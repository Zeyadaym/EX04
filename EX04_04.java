import java.util.Scanner;

public class EX04_04 {

	public static void main(String[] args) {
		double mile; int count=0;double kilometers ;
	Scanner input = new Scanner(System.in);
System.out.println("Enter the distance in miles please to exit press 0");
System.out.print("miles");
System.out.print("               ");
System.out.println("kilometers");
do {
	 mile = input.nextDouble();
	 kilometers = mile*1.609;
	count++;
	System.out.print(mile);
	System.out.print("               ");
	System.out.println(kilometers);
	if(count%2==0)
		System.out.println("-----------------------------------------");
}while(mile!=0);


	}

}
